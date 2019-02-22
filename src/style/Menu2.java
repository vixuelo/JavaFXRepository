package style;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Menu2 extends Application{

	MenuBar BarraMenu = new MenuBar();
	
	Menu menuArchivo = new Menu("Archivo");
		Menu Nuevo = new Menu("Nuevo");
			MenuItem ItemNuevo1 = new MenuItem("Proyecto JavaFX");
			MenuItem ItemNuevo2 = new MenuItem("Proyecto...");
		MenuItem Abrir = new MenuItem("Abrir Fichero");
	    MenuItem Salir = new MenuItem("Salir");	
	
	Menu menuEditar = new Menu("Editar");
		MenuItem Deshacer = new MenuItem("Deshacer");
		MenuItem Rehacer = new MenuItem("Rehacer");
		MenuItem Copiar = new MenuItem("Copiar");
		MenuItem Pegar = new MenuItem("Pegar");
		Menu expandirSeleccion = new Menu("Expandir seleccion a...");
			MenuItem ele1 = new MenuItem("Elementos encerrados");
			MenuItem ele2 = new MenuItem("Elemento siguiente");
			MenuItem ele3 = new MenuItem("Elemento anterior");
		MenuItem Modo = new MenuItem("Modo inserccion inteligente");
	
	Menu menuproyecto = new Menu("Proyecto");
		MenuItem AbrirProyecto = new MenuItem("Abrir Proyecto");
		MenuItem CerrarProyecto = new MenuItem("Cerrar Proyecto");
		MenuItem CompilarProyecto = new MenuItem("Compilar");
		RadioMenuItem compilacion = new RadioMenuItem("Compilacion Automatica");
		RadioMenuItem GenerarProyecto = new RadioMenuItem("Generar Javadoc automaticamente");
		MenuItem EjecutarProyecto = new MenuItem("Abrir Proyecto");
		Menu EjecutarComo = new Menu("Ejecutar como...");
			RadioMenuItem app = new RadioMenuItem("Aplicacion Java");
			RadioMenuItem javaFX = new RadioMenuItem("JavaFX2");
			RadioMenuItem JUnit = new RadioMenuItem("JUnit");
			RadioMenuItem Maven = new RadioMenuItem("Maven");
			ToggleGroup toggle = new ToggleGroup();
			
	@Override
	public void start(Stage ventana) throws Exception {
		
		BorderPane layout = new BorderPane();
        ventana.setTitle("Editor de texto - Menu ");
	
        menuArchivo.getItems().addAll(Nuevo, Abrir, new SeparatorMenuItem(), Salir);
        	Nuevo.getItems().addAll(ItemNuevo1, ItemNuevo2);
        
        menuEditar.getItems().addAll(Deshacer, Rehacer, new SeparatorMenuItem(), Copiar, Pegar, new SeparatorMenuItem(), expandirSeleccion, new SeparatorMenuItem(), Modo);
        	expandirSeleccion.getItems().addAll(ele1, ele2, ele3);
        
        menuproyecto.getItems().addAll(AbrirProyecto, CerrarProyecto, new SeparatorMenuItem(), CompilarProyecto, compilacion, new SeparatorMenuItem(), GenerarProyecto, new SeparatorMenuItem(), EjecutarProyecto, EjecutarComo);
        	EjecutarComo.getItems().addAll(app, javaFX, JUnit, Maven);
        	 toggle.getToggles().add(app);
             toggle.getToggles().add(javaFX);
             toggle.getToggles().add(JUnit);
             toggle.getToggles().add(Maven);
        
        Abrir.setAccelerator(new KeyCodeCombination(KeyCode.A, KeyCombination.CONTROL_DOWN ,KeyCombination.ALT_DOWN));
        ItemNuevo1.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN ,KeyCombination.ALT_DOWN));
        ItemNuevo2.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));

        Deshacer.setAccelerator(new KeyCodeCombination(KeyCode.Z, KeyCombination.CONTROL_DOWN));
        Rehacer.setAccelerator(new KeyCodeCombination(KeyCode.Y, KeyCombination.CONTROL_DOWN));
        Copiar.setAccelerator(new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_DOWN));
        Pegar.setAccelerator(new KeyCodeCombination(KeyCode.V, KeyCombination.CONTROL_DOWN));
        
        ele1.setAccelerator(new KeyCodeCombination(KeyCode.UP, KeyCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN));
        ele2.setAccelerator(new KeyCodeCombination(KeyCode.RIGHT, KeyCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN));
        ele3.setAccelerator(new KeyCodeCombination(KeyCode.LEFT, KeyCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN));
        
        Modo.setAccelerator(new KeyCodeCombination(KeyCode.INSERT, KeyCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN));
        
        CompilarProyecto.setAccelerator(new KeyCodeCombination(KeyCode.B, KeyCombination.CONTROL_DOWN));
        BarraMenu.getMenus().addAll(menuArchivo, menuEditar, menuproyecto);
        
        layout.setTop(BarraMenu);
        Scene scene = new Scene(layout, 350, 200);
        
        ventana.setScene(scene);
        ventana.show();
	}

	public static void main(String[] args) {
		launch(args);
		
	}
}