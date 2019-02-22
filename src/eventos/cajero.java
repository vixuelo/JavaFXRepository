package eventos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class cajero extends Application{
	Label SaldoLbl= new Label();
	TextField SaldoTxt = new TextField();
	Label IngresoLbl= new Label();
	TextField IngresoTxt = new TextField();
	Button Ingresobtn = new Button();
	Label RetiradaLbl= new Label();
	TextField RetiradaTxt = new TextField();
	Button Retiradabtn = new Button();
	GridPane GP= new GridPane();
	@Override
	public void start(Stage primaryStage) throws Exception {
		GP.add(SaldoLbl, 0, 1,3,1);
		GP.add(SaldoTxt, 0, 2,3,1);
		GP.add(IngresoLbl, 0, 3);
		GP.add(IngresoTxt, 1, 3);
		GP.add(Ingresobtn, 2, 3);
		GP.add(RetiradaLbl, 0, 4);
		GP.add(RetiradaTxt, 1, 4);
		GP.add(Retiradabtn, 2, 4);
		Scene sc = new Scene(GP,200,350);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
