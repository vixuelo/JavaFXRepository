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
 * Detecta cualquier bot�n del rat�n al pulsarse e imprime en un campo de texto
 * qu� bot�n fue pulsado cada vez, a distinguir entre primario, secundario y central
 * 
 * */

public class Main extends Application {

	//Nuestro bot�n
	Button boton = new Button("CLICK");

	//En este texto se imprimir� el resultado del evento
	Label resultadoClickLbl = new Label();

	@Override
	public void start(Stage ventana) {
		BorderPane layout = new BorderPane();
		Scene escena = new Scene(layout,400,400);

		//A�adimos el boton en el centro del border layout
		layout.setCenter(boton);
		layout.setBottom(resultadoClickLbl);

		//Manejamos el evento del clic
		//El evento detectar� como clic cualquier bot�n que se pulse del rat�n
		boton.setOnMouseClicked(new EventHandler<MouseEvent>() {

			//Discriminamos tras el clic cu�l bot�n ha sido pulsado
			@Override
			public void handle(MouseEvent evento) {

				//Primario: clic izquierdo para el diestro; clic derecho para el zurdo
				//ya depende de como est� configurado en cada sistema JAVA se encarga de saberlo
				if(evento.getButton().equals(MouseButton.PRIMARY)) {
					resultadoClickLbl.setText("Has hecho click con el bot�n principal");
				}
				if(evento.getButton().equals(MouseButton.SECONDARY)) {
					resultadoClickLbl.setText("Has hecho click con el bot�n secundario");
				}
				if(evento.getButton().equals(MouseButton.MIDDLE)) {
					resultadoClickLbl.setText("Has hecho click con el bot�n central");
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
