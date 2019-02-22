package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class ejemploBorderLay extends Application {

	//Declaramos y definimos los components gráficos de nuestra aplicación
	Label labelSuperior = new Label("Posición superior del border pane");
	Label labelInferior = new Label("Posición inferior del border pane");
	Label labelDerecho = new Label("Posición derecha del border pane");
	Label labelIzquierdo = new Label("Posición izquierda del border pane");
	Label labelCentro = new Label("Posición central del border pane");
	
	@Override
	public void start(Stage ventana) {

		ventana.setTitle("BorderPane layout");
		
		//Rota los componentes deseados de acuerdo a las agujas del reloj
		labelDerecho.setRotate(90);
		labelInferior.setRotate(180);
		labelIzquierdo.setRotate(270);
		
		//Establecemos nuestro layout, el homónimo del border layout
		BorderPane layout = new BorderPane();
		layout.setTop(labelSuperior);
		layout.setBottom(labelInferior);
		layout.setLeft(labelIzquierdo);
		layout.setRight(labelDerecho);
		layout.setCenter(labelCentro);
		
		//Establezco una alineación centrada para los componentes gráficos
		//Por defecto están alineados a la izquierda
		//entonces si comentas las líneas siguientes veréis que el layout queda un poco feo
		BorderPane.setAlignment(labelSuperior, Pos.CENTER);
		BorderPane.setAlignment(labelInferior, Pos.CENTER);
		BorderPane.setAlignment(labelDerecho, Pos.CENTER);
		BorderPane.setAlignment(labelIzquierdo, Pos.CENTER);
								//ancho x alto
		Scene escena = new Scene(layout,800,200);			
		
		//establecemos el contenido de la ventana a la ventana
		ventana.setScene(escena);
		ventana.show(); //mostramos 
	}

	public static void main(String[] args) {
		launch(args);
	}
}
