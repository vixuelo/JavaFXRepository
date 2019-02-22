package style;

import java.awt.TextField;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class act5 extends Application{
	MenuBar Menu = new MenuBar();
		Menu file = new Menu("Archivo");
			Menu newreg = new Menu("Nuevo registro");
				ToggleGroup newregtogg = new ToggleGroup();
				RadioMenuItem Cent = new RadioMenuItem("Registro en centigrados");
				RadioMenuItem Fahr = new RadioMenuItem("Registro en fahrenheits");
				RadioMenuItem Kelv = new RadioMenuItem("Registro en kelvins");
				
			MenuItem openreg = new MenuItem("Abrir registro");
			MenuItem closereg = new MenuItem("Cerrar Registro");
			MenuItem closeall = new MenuItem("Cerrar todos");
			//sep
			MenuItem exit = new MenuItem("Salir");
		
		Menu Temp = new Menu("Temperatura");
			CustomMenuItem temperatura = new CustomMenuItem();
			Slider slider = new Slider(0,100,50);
			
			//sep
			MenuItem max = new MenuItem("Hallar maxima...");
			MenuItem min = new MenuItem("Hallar minima...");
		Menu help = new Menu("Ayuda");
			MenuItem HelpMI = new MenuItem("Ayuda");
			Menu user = new Menu("Cuentas de usuario");
				ToggleGroup usertogg = new ToggleGroup();
				RadioMenuItem login = new RadioMenuItem("Iniciar sesion...");
				RadioMenuItem perfil = new RadioMenuItem("Mi perfil...");
				RadioMenuItem logout = new RadioMenuItem("Cerrar sesion...");
				//sep
				RadioMenuItem autologin = new RadioMenuItem("Iniciar automa"
						+ "ticamente...");
			//sep
			MenuItem actual = new MenuItem("Comprobar Actualizaciones");
			MenuItem install = new MenuItem("Instalar un producto");
			//sep
			MenuItem version = new MenuItem("Version actual...");
			
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane main = new BorderPane();
		VBox temp = new VBox();
		Text texto = new Text("Establezca temperatura");
		temp.getChildren().addAll(texto,slider);
		temperatura.setContent(temp);
		file.getItems().addAll(newreg,openreg,new SeparatorMenuItem(),closereg,closeall,new SeparatorMenuItem(),exit);
		newreg.getItems().addAll(Cent,Fahr,Kelv);
			Cent.setAccelerator(new KeyCodeCombination(KeyCode.C,KeyCombination.CONTROL_DOWN));
			Fahr.setAccelerator(new KeyCodeCombination(KeyCode.F,KeyCombination.CONTROL_DOWN));
			Kelv.setAccelerator(new KeyCodeCombination(KeyCode.K,KeyCombination.CONTROL_DOWN));
				
			closereg.setAccelerator(new KeyCodeCombination(KeyCode.W,KeyCombination.CONTROL_DOWN));
			closeall.setAccelerator(new KeyCodeCombination(KeyCode.W,KeyCombination.CONTROL_DOWN,KeyCombination.ALT_DOWN));
			
			Temp.getItems().addAll(temperatura,new SeparatorMenuItem(),max,min);
			max.setAccelerator(new KeyCodeCombination(KeyCode.M,KeyCombination.CONTROL_DOWN,KeyCombination.ALT_DOWN));
			min.setAccelerator(new KeyCodeCombination(KeyCode.M,KeyCombination.CONTROL_DOWN,KeyCombination.SHIFT_DOWN));
		help.getItems().addAll(HelpMI,user,new SeparatorMenuItem(),actual,install,new SeparatorMenuItem(),version);
			user.getItems().addAll(login,perfil,logout,autologin);
			usertogg.getToggles().add(login);
			usertogg.getToggles().add(perfil);
			usertogg.getToggles().add(logout);
			usertogg.getToggles().add(autologin);
			HelpMI.setAccelerator(new KeyCodeCombination(KeyCode.F1));
			actual.setAccelerator(new KeyCodeCombination(KeyCode.U,KeyCombination.CONTROL_DOWN));
		Menu.getMenus().addAll(file,Temp,help);
		main.setTop(Menu);
		Scene sc = new Scene(main,350,200);
		primaryStage.setScene(sc);
		primaryStage.show();
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
		
	}

}
