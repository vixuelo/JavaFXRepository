package gridpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class table extends Application {
	String titletable = "lista de puntuaciones maximas";
	String puesto = "puesto";
	String[] names = { "Jugador", "Juan", "Raquel", "Alberto", "Miriam", "Nico" };
	String[] point = {"Puntos" ,"260", "187", "175", "165", "162"};
	GridPane GP = new GridPane();
	Label labeltitle = new Label(titletable);
	Label labelnum, labelname, labelpoints;
	String title = "Goal Scorers!";

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label(titletable);
		GP.add(label, 0, 0, 3, 1);
		label.setFont(Font.font("arial", FontWeight.BOLD, 20));
		for (int i = 0; i <=5; i++) {
			if (i == 0) {
				labelnum = new Label(puesto);
				labelnum.setFont(Font.font("arial", FontWeight.BOLD, 20));
				labelname = new Label(names[i]);
				labelname.setFont(Font.font("arial", FontWeight.BOLD, 20));
				labelpoints = new Label(point[i]);
				labelpoints.setFont(Font.font("arial", FontWeight.BOLD, 20));
				GP.add(labelnum, 1, i + 2);
				GP.add(labelname, 2, i + 2);
				GP.add(labelpoints, 3, i + 2);

			} else {
				labelnum = new Label(String.valueOf(i));
				labelnum.setFont(Font.font("arial", 16));
				labelname = new Label(names[i]);
				labelname.setFont(Font.font("arial", 16));
				labelpoints = new Label(String.valueOf(point[i]));
				labelpoints.setFont(Font.font("arial", 16));
				GP.add(labelnum, 1, i + 2);
				GP.add(labelname, 2, i + 2);
				GP.add(labelpoints, 3, i + 2);
			}
		}
		Scene sc = new Scene(GP);
		
		primaryStage.setTitle(title);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
