package style;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
public class Menuu extends Application {
 
	// Creamos la barra de menú mediante objetos tipo MenuBar
    MenuBar menuBar = new MenuBar();
    
    // Creamos los menus de la barra de menú
    Menu menuUno = new Menu("menu1");
    Menu menuDos = new Menu("menu2");

    
    // Creamos lo elementos de cada menú mediante objetos de la clase MenuItems
    MenuItem submenuUno = new MenuItem("submenu1");
    MenuItem submenuDos= new MenuItem("submenu2");
    SeparatorMenuItem separadorMI = new SeparatorMenuItem();
    MenuItem submenuTres = new MenuItem("submenu3");
    
 
	
    @Override
    public void start(Stage ventana) {
 
        BorderPane layout = new BorderPane();
        ventana.setTitle("Editor de texto - Menu ");

        // añadimos los elementos a cada menú correspondiente
        menuUno.getItems().addAll(submenuUno, submenuDos, separadorMI, submenuTres);
    
        
        // Y cada menu creado lo añadimos a la barra de menú
        menuBar.getMenus().addAll(menuUno, menuDos);
        
        layout.setTop(menuBar);
        Scene scene = new Scene(layout, 350, 200);
        
        ventana.setScene(scene);
        ventana.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}
