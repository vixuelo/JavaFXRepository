

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {

	//Para una ristra de elemento contenidos en un HBOX o VBOX debemos usar arrays.
	//Imaginad que en vez de tener 10 elementos(que ya son bastantes) usaramos 20 o 30.
	
	//Imagenes de iconos
	String idIconos [] = {"img/nuevo.png", "img/abrir.png", "img/guardar.png",
			"img/pdf.png", "img/imprimir.png", "img/cortar.png", "img/copiar.png", 
			"img/pegar.png", "img/buscar.png", "img/ayuda.png"};
	//Para obtener los bytes de lectura de las imagenes
	FileInputStream recursos [] = new FileInputStream [idIconos.length];
	//Necestamos un objeto de tipo Image y otro ImageView(para 	generar la vista de la imagen

	Image icono [] = new Image [idIconos.length];
	ImageView iconoView [] = new ImageView [idIconos.length];

	//Mensajes de ayuda (tambien creamos un Array
	String ayudaStr [] = {"Nuevo fichero", "Abrir fichero", "Guardar", "Exportar", "Imprimir"
			,"cortar", "copiar", "pegar","buscar", "ayuda"};
	Tooltip tooltip [] = new Tooltip[ayudaStr.length];

	//Etiquetas que portarán los iconos
	Label iconosLbl [] = new Label [idIconos.length];

	//Separadores vertical(no podemos añadirlos de forma duplicada
	Separator separador0 = new Separator(Orientation.VERTICAL);
	Separator separador1 = new Separator(Orientation.VERTICAL);
	Separator separador2 = new Separator(Orientation.VERTICAL);
	Separator separador3 = new Separator(Orientation.VERTICAL);

	//TextArea donde escribir
	TextArea areaTxt = new TextArea();

	//CARGA DE DATOS
	/*Vamos a usar el método init en esta práctica para 
	 * realizar asignaciones e inicializaciones de datos lógicos
	 * que van a aparecer en la interfaz*/
	@Override
	public void init() { //usamos este método y así no ensuciamos con mucho código el método Start

		//En cada vuelta tomamos un elemento de idIconos y se la pasamos
		//al buffer para que la cargue en memoria
		//Luego dicha carga la pasamos al objeto icono de Image 
		//necesario porque lo requiere ImageView para generar la vista del icono
		//Por último el objeto de tipo Label transportará dicha vista a la interfaz
		try {
			for(int i = 0; i < idIconos.length; i++) {
				recursos[i] = new FileInputStream(idIconos[i]);
				icono[i] = new Image(recursos[i]);
				iconoView[i] = new ImageView(icono[i]);
				iconosLbl[i] = new Label("", iconoView[i]);
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//Inicialización de los tooltips
		for(int i = 0; i < tooltip.length; i++) {
			tooltip[i] = new Tooltip(ayudaStr[i]);
			iconosLbl[i].setTooltip(tooltip[i]);
		}
	}


	@Override
	public void start(Stage ventana) {
		ventana.setTitle("Editor de texto");
		new d

		BorderPane layoutPrincipal = new BorderPane();

		//******* Layout superior *******//
		HBox layoutSuperior  = new HBox();
		for(int i = 0; i < iconosLbl.length; i++) {

			layoutSuperior.getChildren().add(iconosLbl[i]);

			//colocamos un separador tras el elemento tercero
			if(i == 2) layoutSuperior.getChildren().add(separador0);

			//colocamos un separador tras el elemento tercero
			if(i == 4) layoutSuperior.getChildren().add(separador1);

			//colocamos un separador tras el elemento octavo
			if(i == 7) layoutSuperior.getChildren().add(separador2);

			//colocamos un separador tras el elemento decimo
			if(i == 9) layoutSuperior.getChildren().add(separador3);
		}

		layoutSuperior.setPadding(new Insets(10));
		layoutSuperior.setSpacing(18f);

		//Añadimos al layout principal
		layoutPrincipal.setTop(layoutSuperior);
		layoutPrincipal.setCenter(areaTxt);

		/* Montamos escena y ventana */
		Scene escena = new Scene(layoutPrincipal, 700, 500);
		ventana.setScene(escena);
		ventana.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
