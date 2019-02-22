package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxEjemploFont extends Application{
	Integer inte;
	BorderPane main= new BorderPane();
	HBox hbox= new HBox();
	Label FontTxt = new Label("Fuente: ");
	ObservableList FontOL = FXCollections.<String>observableArrayList("Arial",
		"liberation",
		"pacifico",
		"lato",
		"roboto",
		"impact",
		"comic sans serif",
		"ar cena",
		"times new roman",
		"cambria",
		"deja vu",
		"tahoma",
		"calibri",
		"chiller"
	);
	ComboBox FontCb = new ComboBox<>(FontOL);
	ArrayList alnum = new ArrayList<>();
	
	ObservableList nFontOL;
	
	ComboBox nFontCb = new ComboBox<>(nFontOL);
	Button btnClean = new Button("Borrar Formato");
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		for (int i=0;i>=250;i++) {
			alnum.add(i);
		}
		nFontOL=FXCollections.<Integer>observableArrayList(alnum);
		FontTxt.setPrefSize(50,10);
		FontCb.setPrefSize(125,10);
		nFontCb.setPrefSize(20, 10);
		hbox.getChildren().addAll(FontTxt,FontCb,nFontCb,btnClean);
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(10);
		main.setCenter(hbox);
		Scene escena = new Scene(main, 500,200);
		primaryStage.setScene(escena);
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
