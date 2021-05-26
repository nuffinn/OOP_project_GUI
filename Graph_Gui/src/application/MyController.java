package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MyController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	Menu fileMenu;
	@FXML
	Menu editMenu;
	@FXML
	Menu stimulate;
	@FXML
	Menu informationMenu;
	@FXML
	MenuItem browse;
	@FXML
	MenuItem create;
	@FXML
	MenuItem auto;
	@FXML
	MenuItem byHand;
	@FXML
	MenuItem withSuggest;
	@FXML
	MenuItem noSuggest;
	@FXML
	Label lbl1;
	@FXML
	TextField suggestTF;
	@FXML
	Label lbl2;
	@FXML
	TextField inputField;
	@FXML
	Button btnNext;
	@FXML
	Button btnPrev;
	@FXML
	Button shortbtn;
	@FXML
	Label lbl3;
	@FXML
	TextField suggestTF2;
	@FXML
	Label lbl4;
	@FXML
	TextField inputField2;
	@FXML
	Button btnNext2;
	@FXML
	Button btnPrev2; 
	@FXML
	Button shortbtn2;
	@FXML
	Label lbl5;
	@FXML
	TextField addTF5;
	@FXML
	Label lbl6;
	@FXML
	TextField addTF6;
	@FXML
	Label lbl7;
	@FXML
	Label lbl71;
	@FXML
	TextField addFrom;
	@FXML
	Label lbl72;
	@FXML
	TextField addTo;
	@FXML
	Label lbl8;
	@FXML
	Label lbl81;
	@FXML
	TextField delFrom;
	@FXML
	Label lbl82;
	@FXML
	TextField delTo;
	@FXML
	TextArea textA;
	@FXML
	Button saveBtn;
	@FXML
	VBox suggestBox;
	@FXML
	VBox noSuggestBox;
	@FXML
	VBox autoBox;
	@FXML
	VBox handBox;

	public void openSuggestBox(ActionEvent event) {
		noSuggestBox.setVisible(false);
		suggestBox.setVisible(true);
	}
	
	
	public void openNoSuggestBox(ActionEvent event) {
		suggestBox.setVisible(false);
		noSuggestBox.setVisible(true);
	}

	public void openAuto(ActionEvent event) {
		handBox.setVisible(false);
		autoBox.setVisible(true);
	}
	
	public void openByHand(ActionEvent event) {
		handBox.setVisible(true);
		autoBox.setVisible(false);
	}
}
