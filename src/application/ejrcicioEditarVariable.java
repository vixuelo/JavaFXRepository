package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ejrcicioEditarVariable extends Application{
	int x=190,y=20;
	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Programa plantilla"); 
		BorderPane BP = new BorderPane();
			
			Pane Pl_t = new Pane();
				Label nameTxt = new Label("Nombre de la variable");
					nameTxt.relocate(20, 20);
					nameTxt.setPrefSize(x, y);
					Pl_t.getChildren().add(nameTxt);
				Label TypeTxt = new Label("tipo de variable");
					TypeTxt.relocate(20, 50);
					TypeTxt.setPrefSize(x, y);
					Pl_t.getChildren().add(TypeTxt);
				Label ValueTxt = new Label("Valor de la variable");
					ValueTxt.relocate(20, 80);
					ValueTxt.setPrefSize(x, y);
					Pl_t.getChildren().add(ValueTxt);
				Label LangTxt = new Label("Lenguaje de programacion");
					LangTxt.relocate(20, 110);
					LangTxt.setPrefSize(x, y);
					Pl_t.getChildren().add(LangTxt);
				TextField nameL = new TextField();
					nameL.relocate(260, 20);
					nameL.setPrefSize(x, y);
					Pl_t.getChildren().add(nameL);
				ComboBox Typelist = new ComboBox<>();
					Typelist.relocate(260, 50);
					Typelist.setPrefSize(x, y);
					Pl_t.getChildren().add(Typelist);
				TextField ValueL = new TextField();
					ValueL.relocate(260, 80);
					ValueL.setPrefSize(x, y);
					Pl_t.getChildren().add(ValueL);
				ComboBox Langlist = new ComboBox<>();
					Langlist.relocate(260, 110);
					Langlist.setPrefSize(x, y);
					Pl_t.getChildren().add(Langlist);
		BP.setCenter(Pl_t);
		
			Pane Pl_b = new Pane();
				Button btnOk = new Button("Ok");
					btnOk.relocate(20,40);
					btnOk.setPrefSize(40,20);
					Pl_b.getChildren().add(btnOk);
				Button btnCancel = new Button("Cancelar");
					btnCancel.relocate(120, 40);
					btnCancel.setPrefSize(80, 20);
					Pl_b.getChildren().add(btnCancel);
		BP.setBottom(Pl_b);
				
		Scene sc = new Scene(BP,560,200);
		primaryStage.setScene(sc);
		primaryStage.show();
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
