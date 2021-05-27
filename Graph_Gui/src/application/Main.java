package application;

import java.io.IOException;

import com.sun.javafx.tk.quantum.PrimaryTimer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		primaryStage.setTitle("OOP_Project");
		Parent root = FXMLLoader.load(getClass().getResource("MyScene.fxml"));
		primaryStage.setScene(new Scene(root)); 
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
