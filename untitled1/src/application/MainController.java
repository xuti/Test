package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainController implements Initializable{
	
	@FXML
	private AnchorPane rootPane;
	
	
	@FXML
	private Button manage_customer_btn=new Button();
	
	@FXML
	private void loadSecond(ActionEvent event){
		AnchorPane pane;
		try {
			pane = FXMLLoader.load(getClass().getResource("/application/Manage_Customer.fxml"));
			rootPane.getChildren().setAll(pane);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
