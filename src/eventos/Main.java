package eventos;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * 
 * Detecta cualquier botón del ratón al pulsarse e imprime en un campo de texto
 * qué botón fue pulsado cada vez, a distinguir entre primario, secundario y central
 * 
 * */

public class Main extends Application {

	//Nuestro botón
	Button boton = new Button("CLICK");

	//En este texto se imprimirá el resultado del evento
	Label resultadoClickLbl = new Label();

	@Override
	public void start(Stage ventana) {
		BorderPane layout = new BorderPane();
		Scene escena = new Scene(layout,400,400);

		//Añadimos el boton en el centro del border layout
		layout.setCenter(boton);
		layout.setBottom(resultadoClickLbl);

		//Manejamos el evento del clic
		//El evento detectará como clic cualquier botón que se pulse del ratón
		boton.setOnMouseClicked(new EventHandler<MouseEvent>() {

			//Discriminamos tras el clic cuál botón ha sido pulsado
			@Override
			public void handle(MouseEvent evento) {

				//Primario: clic izquierdo para el diestro; clic derecho para el zurdo
				//ya depende de como esté configurado en cada sistema JAVA se encarga de saberlo
				if(evento.getButton().equals(MouseButton.PRIMARY)) {
					resultadoClickLbl.setText("Has hecho click con el botón principal");
				}
				if(evento.getButton().equals(MouseButton.SECONDARY)) {
					resultadoClickLbl.setText("Has hecho click con el botón secundario");
				}
				if(evento.getButton().equals(MouseButton.MIDDLE)) {
					resultadoClickLbl.setText("Has hecho click con el botón central");
				}
			}
		});

		ventana.setScene(escena);
		ventana.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
