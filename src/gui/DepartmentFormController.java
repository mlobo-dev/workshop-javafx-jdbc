package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable{

	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Button btnSave;
	
	@FXML
	private Button btnCancel;
	
	@FXML
	private Label lblErrorName;
	
	@FXML
	public void onBtnSaveAction() {
		System.out.println("onBtnSaveAction");
	}
	
	@FXML
	public void onBtnCancelAction() {
		System.out.println("onBtnSaveCancel");
	}
	
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
		
	}

}
