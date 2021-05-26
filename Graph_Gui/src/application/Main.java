package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		
//		primaryStage.setTitle("1a-PROJECT");
//		
////		initialize root layout
//		BorderPane root = new BorderPane();
//		
////		Top setup
//		MenuBar menuBar = new MenuBar();
//		
//		Menu fileMenu = new Menu("File");
//		Menu editMenu = new Menu("Edit");
//		Menu stimulate = new Menu("Stimulation");
//		Menu informationMenu = new Menu("Info");
//		
//		MenuItem browse = new MenuItem("Browse");
//		MenuItem create = new MenuItem("New graph");
//		MenuItem auto = new MenuItem("Auto edit");
//		MenuItem byHand = new MenuItem("Edit by hand");
//		MenuItem withSuggest = new MenuItem("With Suggestion");
//		MenuItem noSuggest = new MenuItem("No Suggestion");
//		
//		fileMenu.getItems().addAll(browse, create);
//		editMenu.getItems().addAll(auto, byHand);
//		stimulate.getItems().addAll(withSuggest, noSuggest);
//		
//		menuBar.getMenus().addAll(fileMenu, editMenu,stimulate,  informationMenu);
//		root.setTop(menuBar);
//		
////		Right setup
//		VBox bigVBox = new VBox();
//		StackPane rightPane = new StackPane();
//
//	//	with suggestion stimulation
//		
//		VBox suggestBox = new VBox();
//		suggestBox.setSpacing(5);
//		suggestBox.setPadding(new Insets(5,5,5,5));
//		suggestBox.setAlignment(Pos.TOP_CENTER);
//		
//		Label lbl1 = new Label("Suggestion node : ");
//		TextField suggestTF = new TextField();
//		suggestTF.setEditable(false);
//		suggestBox.getChildren().addAll(lbl1, suggestTF);
//		
//		Label lbl2 = new Label("Input node : ");
//		TextField inputField = new TextField();
//		inputField.setEditable(true);			
//		suggestBox.getChildren().addAll(lbl2, inputField);
//		
//		HBox moveBox = new HBox();
//		moveBox.setAlignment(Pos.CENTER);
//		moveBox.setSpacing(15);
//		Button btnNext = new Button("Next");
//		Button btnPrev = new Button("Prev");
//		moveBox.getChildren().addAll(btnNext, btnPrev);
//		suggestBox.getChildren().add(moveBox);
//		
//		Button shortbtn = new Button("Shortest path");
//		suggestBox.getChildren().add(shortbtn);
//		suggestBox.setVisible(false);
//		
//		rightPane.getChildren().add(suggestBox);
//		
//	// without suggestion stimulation
//		
//		VBox noSuggestBox = new VBox();
//		noSuggestBox.setSpacing(5);
//		noSuggestBox.setPadding(new Insets(5,5,5,5));
//		noSuggestBox.setAlignment(Pos.TOP_CENTER);
//		
//		Label lbl3 = new Label("List of node : ");
//		TextField suggestTF2 = new TextField();
//		suggestTF2.setEditable(false);
//		noSuggestBox.getChildren().addAll(lbl3, suggestTF2);
//		
//		Label lbl4 = new Label("Input node : ");
//		TextField inputField2 = new TextField();
//		inputField2.setEditable(true);			
//		noSuggestBox.getChildren().addAll(lbl4, inputField2);
//		
//		HBox moveBox2 = new HBox();
//		moveBox2.setAlignment(Pos.CENTER);
//		moveBox2.setSpacing(15);
//		Button btnNext2 = new Button("Next");
//		Button btnPrev2 = new Button("Prev");
//		moveBox2.getChildren().addAll(btnNext2, btnPrev2);
//		noSuggestBox.getChildren().add(moveBox2);
//		
//		Button shortbtn2 = new Button("Shortest path");
//		noSuggestBox.getChildren().add(shortbtn2);
//		noSuggestBox.setVisible(false);
//		
//		rightPane.getChildren().add(noSuggestBox);
//		bigVBox.getChildren().add(rightPane);
//		
//	// add and delete node,edge panel
//		
//		StackPane editPane = new StackPane();
//		editPane.setPadding(new Insets(5,5,5,5));
//		//auto
//		VBox autoBox = new VBox();
//		Label lbl5 = new Label("Add node :");
//		TextField addTF5 = new TextField();
//		
//		Label lbl6 = new Label("Delete node :");
//		TextField addTF6 = new TextField();
//		
//		Label lbl7 = new Label("Add edge :");
//		HBox hb7 = new HBox(); hb7.setSpacing(10);
//		Label lbl71 = new Label("From :");
//		TextField addFrom = new TextField();
//		addFrom.setPrefWidth(30);
//		Label lbl72 = new Label(" To :");
//		TextField addTo = new TextField();
//		addTo.setPrefWidth(30);
//		hb7.getChildren().addAll(lbl71, addFrom, lbl72, addTo);
//		
//		Label lbl8 = new Label("Delete edge :");
//		HBox hb8 = new HBox(); hb8.setSpacing(10);
//		Label lbl81 = new Label("From :");
//		TextField delFrom = new TextField();
//		delFrom.setPrefWidth(30);
//		Label lbl82 = new Label(" To :");
//		TextField delTo = new TextField();
//		delTo.setPrefWidth(30);
//		hb8.getChildren().addAll(lbl81, delFrom, lbl82, delTo);
//		
//		autoBox.getChildren().addAll(lbl5, addTF5, lbl6, addTF6, lbl7, hb7, lbl8, hb8);
//		autoBox.setVisible(false);
//		editPane.getChildren().add(autoBox);
//		
//		//by hand
//		TextArea textA = new TextArea();
//		textA.setEditable(true);
//		textA.setPrefSize(100, 100);
//		textA.setVisible(false);
//		editPane.getChildren().add(textA);
//		
//		bigVBox.getChildren().add(editPane);
//		
//		
//		root.setRight(bigVBox);
////		Center setup
//		BorderPane midPane = new BorderPane();
//		root.setCenter(midPane);
//		
////		Bottom setup (chua lam)
//		TextArea textBottom = new TextArea();
//		root.setBottom(textBottom);
//		root.setMargin(textBottom, new Insets(5,5,5,5));
//		
////		Event-Handling
//	
//	// input node textfield cho phan with suggestion	
//		inputField.setOnKeyPressed(new EventHandler<KeyEvent>() {
//
//			@Override
//			public void handle(KeyEvent arg0) {
//				if (arg0.getCode().equals(KeyCode.ENTER)) {
//				//event-handling here
//				
//				}
//			}
//		});
//		
//		
//	// input node textfield cho phan no suggestion	
//		inputField2.setOnKeyPressed(new EventHandler<KeyEvent>() {
//
//			@Override
//			public void handle(KeyEvent arg0) {
//				if (arg0.getCode().equals(KeyCode.ENTER)) {
//				//event-handling here
//					
//				}
//			}
//		});
//		
//		
//	// Browse file
//		browse.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				
//			}
//		});
//		
//	// Next with suggestion
//		btnNext.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		
//	// Next without suggestion	
//		btnNext2.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		
//	// Prev with suggestion
//		btnPrev.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		
//	// prev without suggestion
//		btnPrev2.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//	
//	//shortest path with suggestion
//		shortbtn.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		
//	//shortest path without suggestion
//		shortbtn2.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				// TODO Auto-generated method stub
//						
//			}
//		});	
//	
//	// textfield phan add node
//		addTF5.setOnKeyPressed(new EventHandler<KeyEvent>() {
//
//			@Override
//			public void handle(KeyEvent arg0) {
//				if (arg0.getCode().equals(KeyCode.ENTER)) {
//				//event-handling here
//					
//				}
//			}
//		});
//		
//	// textfield phan delete node
//			addTF6.setOnKeyPressed(new EventHandler<KeyEvent>() {
//
//			@Override
//			public void handle(KeyEvent arg0) {
//				if (arg0.getCode().equals(KeyCode.ENTER)) {
//				//event-handling here
//							
//				}
//			}
//		});
//			
//    //textfield phan add edge
//			addTo.setOnKeyPressed(new EventHandler<KeyEvent>() {
//
//				@Override
//				public void handle(KeyEvent arg0) {
//					if (arg0.getCode().equals(KeyCode.ENTER)) {
//					//event-handling here
//								
//					}
//				}
//			});
//	//textfield phan delete edge		
//			delTo.setOnKeyPressed(new EventHandler<KeyEvent>() {
//
//				@Override
//				public void handle(KeyEvent arg0) {
//					if (arg0.getCode().equals(KeyCode.ENTER)) {
//					//event-handling here
//								
//					}
//				}
//			});
//	
//		
//// Phan menu ko can handling	
//		withSuggest.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				noSuggestBox.setVisible(false);
//				suggestBox.setVisible(true);
//			}
//		});
//		
//		noSuggest.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				suggestBox.setVisible(false);
//				noSuggestBox.setVisible(true);
//			}
//		});
//		
//		auto.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				textA.setVisible(false);
//				autoBox.setVisible(true);
//			}
//		});
//		
//		byHand.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				autoBox.setVisible(false);
//				textA.setVisible(true);
//			}
//		});
//		
////		Scene setup
		Parent root = FXMLLoader.load(getClass().getResource("MyScene.fxml"));
		primaryStage.setScene(new Scene(root)); 
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
