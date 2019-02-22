package eventos;

import java.awt.Event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo2 extends Application {

	Label nota1lbl = new Label("Nota 1");
	TextField nota1txt = new TextField();
	Label nota2lbl = new Label("Nota 2");
	TextField nota2txt = new TextField();

	Label nota3lbl = new Label("Nota 3");
	TextField nota3txt = new TextField();

	Label ResultadoLbl = new Label("Resultado");
	TextField ResultadoTxt = new TextField();

	Button btnr = new Button("Calcular Media");

	@Override
	public void start(Stage ventana) throws Exception {
		ventana.setTitle("Formulario en cuadrícula");

		VBox n1 = new VBox();
		n1.getChildren().addAll(nota1lbl, nota1txt);
		VBox n2 = new VBox();
		n2.getChildren().addAll(nota2lbl, nota2txt);
		VBox n3 = new VBox();
		n3.getChildren().addAll(nota3lbl, nota3txt);
		VBox res = new VBox();
		res.getChildren().addAll(ResultadoLbl, ResultadoTxt);
		GridPane layout = new GridPane();
		layout.add(n1, 0, 0);
		layout.add(n2, 1, 0);
		layout.add(n3, 2, 0);
		layout.add(btnr, 1, 1);
		layout.add(res, 0, 2);
		btnr.setOnMouseClicked(new EventHandler<MouseEvent>() {
			// Discriminamos tras el clic cuál botón ha sido pulsado
			public void handle(MouseEvent evento) {
				try {
					if (nota1txt.getText() == ("") || nota2txt.getText() == ("") || nota3txt.getText() == ("")
							|| Float.parseFloat(nota1txt.getText()) < 0 || Float.parseFloat(nota2txt.getText()) < 0|| Float.parseFloat(nota3txt.getText()) < 0
							||Float.parseFloat(nota1txt.getText()) > 10 || Float.parseFloat(nota2txt.getText()) > 10|| Float.parseFloat(nota3txt.getText()) > 10
							||nota1txt.getText().contains("[a-zA-Z]+") || nota2txt.getText().contains("[a-zA-Z]+")|| nota3txt.getText().contains("[a-zA-Z]+")) {
						nota1txt.setText("");
						nota2txt.setText("");
						nota3txt.setText("");
						nota1txt.setPromptText("numero entero <10");
						nota2txt.setPromptText("numero entero <10");
						nota3txt.setPromptText("numero entero <10");
					}
					float media = (Float.parseFloat(nota1txt.getText()) + Float.parseFloat(nota2txt.getText())
							+ Float.parseFloat(nota3txt.getText())) / 3;
					ResultadoTxt.setText(String.valueOf(media));
				} catch (NumberFormatException e) {
					ResultadoTxt.setPromptText("ERROR");
				}
			}
		});

		// espacio en la horizontal de las celdas del layout
		layout.setHgap(20);

		// espacio en la vertical de las celdas del layout
		layout.setVgap(20);

		// margen interno del layout
		layout.setPadding(new Insets(10, 10, 10, 10));

		Scene scene = new Scene(layout, 500, 200);
		ventana.setScene(scene);
		ventana.show();
	}
	 public static boolean isNumeric(String cadena) {

	        boolean resultado;

	        try {
	            Integer.parseInt(cadena);
	            resultado = true;
	        } catch (NumberFormatException excepcion) {
	            resultado = false;
	        }

	        return resultado;
	    }
	public static void main(String[] args) {
		Application.launch(args);
	}
}
