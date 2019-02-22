package gridpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class id extends Application {
	//Values//
	String title = "Pantalla de identificacion";
	String msg = "Introduce el nombre de usuario y la cotraseña";
	String user = "Usuario";
	String pass = "Contraseña";
	String id = "Identificarse";
	//graphical elements//
	Label msgL = new Label(msg);
	Label userL = new Label(user);
	TextField userTxt = new TextField();
	Label passL = new Label(pass);
	TextField passTxt = new TextField();
	Button idBtn = new Button(id);
	GridPane GP = new GridPane();
	@Override
	public void start(Stage primaryStage) throws Exception {
		//padding//
		GP.setHgap(10);
		GP.setVgap(10);
		GP.setPadding(new Insets(10, 10, 10, 10));
		GP.add(msgL, 0, 0, 2, 1);
		GP.add(userL, 0, 1);
		GP.add(userTxt, 1, 1 );
		GP.add(passL, 0, 2);
		GP.add(passTxt, 1, 2 );
		GP.add(idBtn, 1, 3);
		GP.setPrefSize(300, 100);
		Scene scene = new Scene(GP, 300,100);
		primaryStage.setTitle(title);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
