package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class App extends Application {

	//Este método se ejecuta justo antes de start
	//es decir se ejcuta antes de que salga la interfaz
	//Se usa para cargar recursos antes de la interfaz
	@Override
	public void init() {
		System.out.println("Antes");
	}


	//Esto es un método de JavaFX
	//Y es el punto donde comienza la aplicación FX
	//Stage = JFrame
	@Override
	public void start(Stage ventana) {

		//Propiedades de la ventana
		ventana.setTitle("Hola mundo Java FX");
		ventana.setResizable(false);

		//BorderPane = BorderLayout
		BorderPane layout = new BorderPane();
		Label etiqueta = new Label("Hola mundo");

		//Añadimos la etiqueta en el centro del border pane
		layout.setCenter(etiqueta);

		//escena es el contenido de la ventana
		//y tenemos que especificar el layout que vamos a usar
		//el ancho y alto de la ventana
		Scene escena = new Scene(layout,400,400);

		//Añadir la escena a la ventana
		ventana.setScene(escena);

		//Mostramos la ventana
		ventana.show();
		

	}

	//punto de salida, es decir, cuando desaparece la interfaz
	@Override
	public void stop() {
		System.out.println("Fin del programa");
	}

	//podemos obviar el método main, JavaFx no depende de él
	public static void main(String[] args) {
		launch(args);
	}
}
