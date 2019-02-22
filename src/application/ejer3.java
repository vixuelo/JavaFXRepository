package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ejer3 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Programa plantilla");  
		primaryStage.setResizable(false);
		Label usernameL =new  Label("introduzca nombre de usuario");
		usernameL.relocate(150, 10);
		usernameL.setPrefWidth(280);
		usernameL.setPrefHeight(50);
		Label passL = new Label("Introduzca su contraseña");
		passL.relocate(150,130);
		TextField usernameTxt = new TextField();
		
		usernameTxt.relocate(150, 70);
		TextField passTxt = new TextField();
		
		passTxt.relocate(150, 190);
		Pane layout = new Pane();
		Scene escena = new Scene(layout,700,700);
		primaryStage.setScene(escena);
		primaryStage.show();
		layout.getChildren().add(usernameL);
		layout.getChildren().add(usernameTxt);
		layout.getChildren().add(passL);
		layout.getChildren().add(passTxt);
		
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
 
}
