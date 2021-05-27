package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class MyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem auto;

    @FXML
    private VBox suggestBox;

    @FXML
    private Label lbl1;

    @FXML
    private TextField delFrom;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl5;

    @FXML
    private MenuItem withSuggest;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl81;

    @FXML
    private Menu informationMenu;

    @FXML
    private Label lbl82;

    @FXML
    private TextField inputField;

    @FXML
    private TextField inputField2;

    @FXML
    private Button btnNext2;

    @FXML
    private TextField delTo;

    @FXML
    private VBox handBox;

    @FXML
    private MenuItem create;

    @FXML
    private Menu fileMenu;

    @FXML
    private TextField suggestTF2;

    @FXML
    private MenuItem byHand;

    @FXML
    private VBox autoBox;

    @FXML
    private Button btnPrev;

    @FXML
    private TextArea textA;

    @FXML
    private TextField suggestTF;

    @FXML
    private Button btnNext;

    @FXML
    private TextField addFrom;

    @FXML
    private Menu stimulate;

    @FXML
    private Label lbl71;

    @FXML
    private Label lbl8;

    @FXML
    private Menu editMenu;

    @FXML
    private Label lbl72;

    @FXML
    private MenuItem noSuggest;

    @FXML
    private Label lbl6;

    @FXML
    private Label lbl7;

    @FXML
    private Button btnPrev2;

    @FXML
    private Button shortbtn;

    @FXML
    private TextField addTF6;

    @FXML
    private Button shortbtn2;

    @FXML
    private TextField addTF5;

    @FXML
    private TextField addTo;

    @FXML
    private VBox noSuggestBox;

    @FXML
    private Button saveBtn;

    @FXML
    private MenuItem browse;

    @FXML
    void withSuggestInput(ActionEvent event) {
    	
    }

    @FXML
    void prevWithSuggest(ActionEvent event) {

    }

    @FXML
    void nextWithSuggest(ActionEvent event) {

    }

    @FXML
    void shortestWithSuggest(ActionEvent event) {

    }

    @FXML
    void withNoSuggestInput(ActionEvent event) {
    	
    }

    @FXML
    void prevWithoutSuggest(ActionEvent event) {

    }

    @FXML
    void nextWithoutSuggest(ActionEvent event) {

    }

    @FXML
    void shortestWithoutSuggest(ActionEvent event) {

    }

    @FXML
    void addNodeInput(ActionEvent event) {

    }

    @FXML
    void deleteNodeInput(ActionEvent event) {

    }

    @FXML
    void addEdgeInput(ActionEvent event) {

    }

    @FXML
    void deleteEdgeInput(ActionEvent event) {

    }

    @FXML
    void savingButton(ActionEvent event) {

    }

    @FXML
    void browseFile(ActionEvent event) {

    }

    @FXML
    void createGraph(ActionEvent event) {

    }

    @FXML
    void openAuto(ActionEvent event) {
    	handBox.setVisible(false);
		autoBox.setVisible(true);
    }

    @FXML
    void openByHand(ActionEvent event) {
    	handBox.setVisible(true);
		autoBox.setVisible(false);
    }

    @FXML
    void openSuggestBox(ActionEvent event) {
    	noSuggestBox.setVisible(false);
		suggestBox.setVisible(true);
    }

    @FXML
    void openNoSuggestBox(ActionEvent event) {
    	suggestBox.setVisible(false);
		noSuggestBox.setVisible(true);
    }

    @FXML
    void initialize() {
        assert auto != null : "fx:id=\"auto\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert suggestBox != null : "fx:id=\"suggestBox\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert delFrom != null : "fx:id=\"delFrom\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl4 != null : "fx:id=\"lbl4\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl5 != null : "fx:id=\"lbl5\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert withSuggest != null : "fx:id=\"withSuggest\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl2 != null : "fx:id=\"lbl2\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl3 != null : "fx:id=\"lbl3\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl81 != null : "fx:id=\"lbl81\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert informationMenu != null : "fx:id=\"informationMenu\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl82 != null : "fx:id=\"lbl82\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert inputField != null : "fx:id=\"inputField\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert inputField2 != null : "fx:id=\"inputField2\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert btnNext2 != null : "fx:id=\"btnNext2\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert delTo != null : "fx:id=\"delTo\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert handBox != null : "fx:id=\"handBox\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert create != null : "fx:id=\"create\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert fileMenu != null : "fx:id=\"fileMenu\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert suggestTF2 != null : "fx:id=\"suggestTF2\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert byHand != null : "fx:id=\"byHand\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert autoBox != null : "fx:id=\"autoBox\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert btnPrev != null : "fx:id=\"btnPrev\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert textA != null : "fx:id=\"textA\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert suggestTF != null : "fx:id=\"suggestTF\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert btnNext != null : "fx:id=\"btnNext\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert addFrom != null : "fx:id=\"addFrom\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert stimulate != null : "fx:id=\"stimulate\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl71 != null : "fx:id=\"lbl71\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl8 != null : "fx:id=\"lbl8\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert editMenu != null : "fx:id=\"editMenu\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl72 != null : "fx:id=\"lbl72\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert noSuggest != null : "fx:id=\"noSuggest\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl6 != null : "fx:id=\"lbl6\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert lbl7 != null : "fx:id=\"lbl7\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert btnPrev2 != null : "fx:id=\"btnPrev2\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert shortbtn != null : "fx:id=\"shortbtn\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert addTF6 != null : "fx:id=\"addTF6\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert shortbtn2 != null : "fx:id=\"shortbtn2\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert addTF5 != null : "fx:id=\"addTF5\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert addTo != null : "fx:id=\"addTo\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert noSuggestBox != null : "fx:id=\"noSuggestBox\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert saveBtn != null : "fx:id=\"saveBtn\" was not injected: check your FXML file 'MyScene.fxml'.";
        assert browse != null : "fx:id=\"browse\" was not injected: check your FXML file 'MyScene.fxml'.";

    }
}
