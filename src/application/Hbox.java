package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Hbox extends Application {

	
	//Botones de JAVAFX
	Button nuevoBtn = new Button("Nuevo");
	Button abrirBtn = new Button("Abrir");
	Button guardarBtn = new Button("Guardar");
	Button deshacerBtn = new Button("Deshacer");
	Button rehacerBtn = new Button("Rehacer");

	Button compilarBtn = new Button("Compilar");
	Button ejecutarBtn = new Button("Ejecutar");
	Button depurarBtn = new Button("Depurar");

	
	@Override
	public void start(Stage ventana) {
		ventana.setTitle("HBox y VBox Layout");
		
		//HBox distribuye de forma secuencial los componentes gráficos
		//en la horizontal
		HBox menuSuperior = new HBox();
		
		//para añadir los componentes en el layout nos hace falta los métodos
		//.getChildren().addAll(lista de componentes)
		//mediante getChildren devuelve el gestor de componentes gráficos
		//addAll añade los componentes dentro del layout por orden de adición		
		menuSuperior.getChildren().addAll(nuevoBtn, abrirBtn, guardarBtn, 
				deshacerBtn, rehacerBtn);
		//Pos permite alinear de forma directa el componente
		menuSuperior.setAlignment(Pos.CENTER);
		
		//VBox igual pero en la vertical
		VBox menuLateral = new VBox();
		menuLateral.getChildren().addAll(compilarBtn, ejecutarBtn, depurarBtn);
		menuLateral.setAlignment(Pos.CENTER_LEFT);
		
		//Creamos el BorderPane layout y añadimos los componentes
		//en este caso el HBOX y el VBOX
		BorderPane layoutPrincipal = new BorderPane();
		layoutPrincipal.setTop(menuSuperior);
		layoutPrincipal.setLeft(menuLateral);
		
		//Definimos la escena con el layout el ancho y el alto
		Scene escena = new Scene(layoutPrincipal, 500, 500);
		//y añadim el contenido a la venta
		ventana.setScene(escena);
		//mostramos
		ventana.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
