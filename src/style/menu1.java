package style;

import java.awt.MenuItem;

import application.App;
import javafx.application.Application;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SeparatorMenuItem;
import javafx.stage.Stage;

public class menu1 extends Application {
	private MenuBar menuBar = new MenuBar();
	private Menu Archivo = new Menu("Archivo");
		private MenuItem Nuevo = new MenuItem("Nuevo");
		private MenuItem AbrirFichero =new MenuItem("Abrir Fichero");
		private SeparatorMenuItem sep= new SeparatorMenuItem(); 
		private MenuItem Salir =new MenuItem("Salir");
	private Menu Editar = new Menu("Editar");
		private MenuItem Copiar = new MenuItem("Copiar");
		private MenuItem Pegar =new MenuItem("Pegar");
		
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Archivo.getItems().addAll(Nuevo,AbrirFichero,sep,Salir);
		
		
	}

}
