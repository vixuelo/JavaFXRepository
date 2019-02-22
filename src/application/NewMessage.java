package application;


import java.util.ArrayList;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NewMessage extends Application {

	@SuppressWarnings("restriction")
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Nuevo mensaje");
		BorderPane pane = new BorderPane();
		
		Pane pnorth = new BorderPane();
		pnorth.setPrefSize(0, 50);
			Label TituloL = new Label("Título");
				TituloL.relocate(10, 10);
				TituloL.setPrefSize(20, 10);
			TextArea TituloTxt = new TextArea();
				TituloTxt.relocate(40, 10);
				TituloTxt.setPrefSize(20, 10);
		pane.setTop(pnorth);
		ArrayList al = new ArrayList<>();
			ListView nombresLV = new ListView<>();
		pane.setLeft(nombresLV);
		
			TextArea TxtBig =new TextArea();
		pane.setRight(TxtBig);
					
		Pane pbtm = new BorderPane();
		pbtm.setPrefSize(0, 100);
			Button EnviarBtn = new Button("Enviar");
				EnviarBtn.relocate(10, 30);
				EnviarBtn.setPrefSize(20, 10);
				pbtm.getChildren().add(EnviarBtn);
			Button LimpiarBtn = new Button("Limpiar");
				LimpiarBtn.relocate(30, 30);
				LimpiarBtn.setPrefSize(20, 10);
				pbtm.getChildren().add(LimpiarBtn);
			Button CancelarBtn = new Button("Cancelar");
				CancelarBtn.relocate(50, 30);
				CancelarBtn.setPrefSize(20, 10);
				pbtm.getChildren().add(CancelarBtn);
		pane.setBottom(pbtm);
		
		Scene sc = new Scene(pane,500,300);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
