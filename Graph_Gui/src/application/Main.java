package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("1a-PROJECT");
		
//		initialize root layout
		BorderPane root = new BorderPane();
		
//		Top setup
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");
		Menu stimulate = new Menu("Stimulation");
		Menu informationMenu = new Menu("Info");
		
		MenuItem browse = new MenuItem("Browse");
		MenuItem create = new MenuItem("New graph");
		MenuItem auto = new MenuItem("Auto edit");
		MenuItem byHand = new MenuItem("Edit by hand");
		MenuItem withSuggest = new MenuItem("With Suggestion");
		MenuItem noSuggest = new MenuItem("No Suggestion");
		
		fileMenu.getItems().addAll(browse, create);
		editMenu.getItems().addAll(auto, byHand);
		stimulate.getItems().addAll(withSuggest, noSuggest);
		
		menuBar.getMenus().addAll(fileMenu, editMenu,stimulate,  informationMenu);
		root.setTop(menuBar);
		
//		Right setup
		VBox bigVBox = new VBox();
		StackPane rightPane = new StackPane();

	//	with suggestion stimulation
		
		VBox suggestBox = new VBox();
		suggestBox.setSpacing(5);
		suggestBox.setPadding(new Insets(5,5,5,5));
		suggestBox.setAlignment(Pos.TOP_CENTER);
		
		Label lbl1 = new Label("Suggestion node : ");
		TextField suggestTF = new TextField();
		suggestTF.setEditable(false);
		suggestBox.getChildren().addAll(lbl1, suggestTF);
		
		Label lbl2 = new Label("Input node : ");
		TextField inputField = new TextField();
		inputField.setEditable(true);			
		suggestBox.getChildren().addAll(lbl2, inputField);
		
		HBox moveBox = new HBox();
		moveBox.setAlignment(Pos.CENTER);
		moveBox.setSpacing(15);
		Button btnNext = new Button("Next");
		Button btnPrev = new Button("Prev");
		moveBox.getChildren().addAll(btnNext, btnPrev);
		suggestBox.getChildren().add(moveBox);
		
		Button shortbtn = new Button("Shortest path");
		suggestBox.getChildren().add(shortbtn);
		suggestBox.setVisible(false);
		
		rightPane.getChildren().add(suggestBox);
		
	// without suggestion stimulation
		
		VBox noSuggestBox = new VBox();
		noSuggestBox.setSpacing(5);
		noSuggestBox.setPadding(new Insets(5,5,5,5));
		noSuggestBox.setAlignment(Pos.TOP_CENTER);
		
		Label lbl3 = new Label("List of node : ");
		TextField suggestTF2 = new TextField();
		suggestTF2.setEditable(false);
		noSuggestBox.getChildren().addAll(lbl3, suggestTF2);
		
		Label lbl4 = new Label("Input node : ");
		TextField inputField2 = new TextField();
		inputField2.setEditable(true);			
		noSuggestBox.getChildren().addAll(lbl4, inputField2);
		
		HBox moveBox2 = new HBox();
		moveBox2.setAlignment(Pos.CENTER);
		moveBox2.setSpacing(15);
		Button btnNext2 = new Button("Next");
		Button btnPrev2 = new Button("Prev");
		moveBox2.getChildren().addAll(btnNext2, btnPrev2);
		noSuggestBox.getChildren().add(moveBox2);
		
		Button shortbtn2 = new Button("Shortest path");
		noSuggestBox.getChildren().add(shortbtn2);
		noSuggestBox.setVisible(false);
		
		rightPane.getChildren().add(noSuggestBox);
		bigVBox.getChildren().add(rightPane);
		
	// add and delete node,edge panel
		
		StackPane editPane = new StackPane();
		editPane.setPadding(new Insets(5,5,5,5));
		//auto
		VBox autoBox = new VBox();
		Label lbl5 = new Label("Add node :");
		TextField addTF5 = new TextField();
		
		Label lbl6 = new Label("Delete node :");
		TextField addTF6 = new TextField();
		
		Label lbl7 = new Label("Add edge :");
		TextField addTF7 = new TextField();
		
		Label lbl8 = new Label("Delete edge :");
		TextField addTF8 = new TextField();
		
		autoBox.getChildren().addAll(lbl5, addTF5, lbl6, addTF6, lbl7, addTF7, lbl8, addTF8);
		autoBox.setVisible(false);
		editPane.getChildren().add(autoBox);
		
		//by hand
		TextArea textA = new TextArea();
		textA.setEditable(true);
		textA.setPrefSize(100, 100);
		textA.setVisible(false);
		editPane.getChildren().add(textA);
		
		bigVBox.getChildren().add(editPane);
		
		
		root.setRight(bigVBox);
//		Center setup
		TabPane tabPane = new TabPane();
		tabPane.setPadding(new Insets(5,5,5,5));
		
		Tab tabDefault = new Tab("Default");
		tabPane.getTabs().add(tabDefault);
		root.setCenter(tabPane);
		
//		Bottom setup (chua lam)
		TextArea textBottom = new TextArea();
		root.setBottom(textBottom);
		root.setMargin(textBottom, new Insets(5,5,5,5));
		
//		Event-Handling
		inputField.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent arg0) {
				if (arg0.getCode().equals(KeyCode.ENTER)) {
				//event-handling here
				
				}
			}
		});
		
		inputField2.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent arg0) {
				if (arg0.getCode().equals(KeyCode.ENTER)) {
				//event-handling here
				
				}
			}
		});
		
		withSuggest.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				noSuggestBox.setVisible(false);
				suggestBox.setVisible(true);
			}
		});
		
		noSuggest.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				suggestBox.setVisible(false);
				noSuggestBox.setVisible(true);
			}
		});
		
		auto.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				textA.setVisible(false);
				autoBox.setVisible(true);
			}
		});
		
		byHand.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				autoBox.setVisible(false);
				textA.setVisible(true);
			}
		});
		
//		Scene setup
		Scene scene = new Scene(root,900,600);
		primaryStage.setScene(scene); 
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}