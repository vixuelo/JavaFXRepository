package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ej1 extends Application {
	// Definimos los componentes gráficos que vamos a usar
	Button btnConect = new Button("Conectar");
	Button btnOptions = new Button("Opciones...");
	Button btnClean = new Button("Vaciar Historial");
	Button btnClose = new Button("Cerrar");
	Text HostTxt = new Text();
	Text PuertoTxt = new Text();
	Text ServidorTxt = new Text();
	Text PuertoSSHTxt = new Text();
	Text UsuarioSHHTxt = new Text();
	Label HostL = new Label("Host Remoto: ");
	Label PuertoL = new Label("Puerto: ");
	Label ServidorL = new Label("Servidor SHH: ");
	Label PuertoSSHL = new Label("Puerto SHH: ");
	Label UsuarioSHHL = new Label("Usuario SHH: ");
	CheckBox ConectSHH = new CheckBox("Usar conexion SHH");

	// No hace falta constructor pq Application nos provee del método start que es
	// el punto de arranque
	// No hace falta ni siquiere el main
	@Override
	public void start(Stage ventana) {
		// Propiedades de la venta
		ventana.setTitle("Nueva conexion");
		ventana.setResizable(true);

		// Definimos el layout que queremos usar
		BorderPane layout = new BorderPane();
		HostL.relocate(20, 20);
		HostL.setPrefSize(200, 20);
		// añadir al layout los componentes gráficos
		BorderPane panelsuperior = new BorderPane();
		layout.setTop(panelsuperior);
			panelsuperior.setTop(HostL);
				
//			panelsuperior.setTop(HostTxt);
//			panelsuperior.setCenter(PuertoL);
			panelsuperior.setCenter(PuertoTxt);
			panelsuperior.setBottom(ConectSHH);
		BorderPane panelcentral = new BorderPane();
		layout.setCenter(panelcentral);
			panelcentral.setTop(ServidorL);
//			panelcentral.setTop(ServidorTxt);
			panelcentral.setCenter(PuertoSSHL);
//			panelcentral.setCenter(PuertoSSHTxt);
//			panelcentral.setBottom(UsuarioSHHL);
			panelcentral.setBottom(UsuarioSHHTxt);
		// Montamos el contenido de la escena con el layout el ancho y el alto
		Scene escena = new Scene(layout, 300, 250);

		// A la ventana se le añade el contenido que es la escena
		ventana.setScene(escena);

		// mostramos todo el conjunto
		ventana.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
