package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class mainController {
	
	@FXML
	public Label lblstatus;
	
	@FXML
	public TextField  txtusername;
	
	@FXML
	private TextField txtpassword;
	
	public void Login(ActionEvent event) throws Exception {
		
		if (txtusername.getText().equals("user") && txtpassword.getText().equals("pass")) {
			lblstatus.setText("Login Success");
			
			
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/main.fxml"));
			Scene scene = new Scene(root,400,400);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else
			lblstatus.setText("LoginFailed");
	}
	


}

