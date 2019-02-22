package style;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class calculadora extends Application {
	TextField pantalla = new TextField();
	ArrayList<String> ALcalculadora = new ArrayList<>();
	String[][] ArrayCalculadora = { { "1", "2", "3", "+" }, { "4", "5", "6", "-" }, { "7", "8", "9", "*" },
			{ "C", "0", "=", "/" } };
	final int TAM = 4;

	GridPane GP = new GridPane();

	@Override
	public void start(Stage primaryStage) throws Exception {
		for (int i=0;i<=16;i++) {
			if (i==4) {
				
			}
			if (i==8) {
				
			}
			if (i==12) {
				
			}
			if (i==16) {
				
			}
			if (i==15) {
				
			}
			if (i==13) {
				
			}
			switch (i) {
			case 4:
				ALcalculadora.add(i, "+");
				break;
			case 8:

				ALcalculadora.add(i, "-");
				break;
			case 12:

				ALcalculadora.add(i, "*");
				break;
			case 16:

				ALcalculadora.add(i, "/");
				break;
			case 15:

				ALcalculadora.add(i, "=");
				break;
			case 13:

				ALcalculadora.add(i, "C");
				break;
			case 14:

				ALcalculadora.add(i, "0");
				break;
			default:
				ALcalculadora.add(i,String.valueOf(i));
				break;
			}
		}
		GP.setPrefHeight(500);
		
		GP.setPadding(new Insets(3,3,3,3));
		GP.setHgap(1);
		GP.setVgap(1);
		GP.setStyle("-fx-background-color: black;");
		
		for(int i=0;i<TAM;i++) {
			for(int j=0;j<TAM;j++) {
				Button btn= new Button(ArrayCalculadora[j][i]);
				btn.setPrefSize(100, 50);
				GP.add(btn, i, j);
				if (i==3) {
					btn.setStyle("-fx-background-color: green; -fx-text-inner-color: #FFFFFF;");
				}else if (j==3 && (i==0 || i==2)) {

					btn.setStyle("-fx-background-color: red; -fx-text-inner-color: red;");
				}else {
					btn.setStyle("-fx-background-color: blue; -fx-text-inner-color: red;");
				}
			}
		}
		BorderPane main = new BorderPane();
		main.setPadding(new Insets(5,5,5,5));
		main.setStyle("-fx-background-color: Brown;");
		main.setCenter(GP);
		main.setTop(pantalla);
		pantalla.setStyle("-fx-border-color: black;-fx-border: 12px");
		Scene sc = new Scene(main,420,230);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
