package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Manage_Customer implements Initializable {

	@FXML
	private TableView<Student> table;
	@FXML
	private TableColumn<Student, Integer> id;
	@FXML
	private TableColumn<Student, String> name;
	@FXML
	private TableColumn<Student, String> surname;
	@FXML
	private TableColumn<Student, Integer> age;
	@FXML
	private Button addbtn;
	@FXML
	private Button delbtn;
	@FXML
	private TextField idInput;
	@FXML
	private TextField nameInput;
	@FXML
	private TextField surnameInput;
	@FXML
	private TextField ageInput;

	public ObservableList<Student> list = FXCollections.observableArrayList(
	 new Student(1, "Mark","suranme1",22),
	 new Student(2, "Tom","suranme2",30),
	 new Student(3, "Ben","suranme3",18),
	 new Student(4, "Jack","suranme4",23)
	);

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		id.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		surname.setCellValueFactory(new PropertyValueFactory<Student, String>("surname"));
		age.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
		System.out.println("1" + list);
		table.setItems(list);
		table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

	public void addButtonClicked() {
		System.out.println("2" + list);
		list.add(new Student(Integer.parseInt(idInput.getText()), nameInput.getText(), surnameInput.getText(),
				Integer.parseInt(ageInput.getText())));
		idInput.clear();
		nameInput.clear();
		surnameInput.clear();
		ageInput.clear();
	}

	public void deleteButtonClicked() {
		table.getItems().removeAll(table.getSelectionModel().getSelectedItems());
	}
}
