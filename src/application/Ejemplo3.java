package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Ejemplo3 extends Application {

	//Definimos los componentes gráficos que vamos a usar
	Button boton = new Button("Botoncito");
	
	//No hace falta constructor pq Application nos provee del método start que es el punto de arranque
	//No hace falta ni siquiere el main
	@Override
	public void start(Stage ventana) {
		//Propiedades de la venta
		ventana.setTitle("Programa plantilla");  
		ventana.setResizable(false);
		
		//Definimos el layout que queremos usar
		BorderPane layout = new BorderPane();
		
		//añadir al layout los componentes gráficos
		layout.setCenter(boton);
		
		//Montamos el contenido de la escena con el layout el ancho y el alto
		Scene escena = new Scene(layout, 300, 250);

		//A la ventana se le añade el contenido que es la escena
		ventana.setScene(escena);
		
		//mostramos todo el conjunto
		ventana.show();
	}
}