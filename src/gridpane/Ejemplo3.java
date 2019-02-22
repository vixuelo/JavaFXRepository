package gridpane;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Ejemplo3 extends Application {
	Label tituloLbl = new Label("Introduce tu DNI para verificar tu identidad");
	Label usuarioLbl = new Label("DNI:");
    TextField usuarioTxt = new TextField();

	 @Override
	   public void start(Stage ventana) throws Exception {
	       GridPane layout = new GridPane();
	 
	       //margenes internos del GridPane establecidos a 20px
	       layout.setPadding(new Insets(20));
	       
	       //espacios entre celdas
	       layout.setHgap(25);
	       layout.setVgap(15);
	 
	       // celda (0,0), span 2 columnas y 1 fila.
	       layout.add(tituloLbl, 0, 0, 2, 1);
	       
	       //La familia de la fuente la coge del sistema
	       //Si queremos una fuente en particular debemos instalarla antes
	       tituloLbl.setFont(Font.font("tahoma", 20));
	 
	       // Celda (0,1)
	       layout.add(usuarioLbl, 0, 1);
	       GridPane.setHalignment(usuarioLbl, HPos.LEFT);
	       
	       //Establecemos la fuente "IMPACT" y la ponemos en negrita 
	       //mediante la clase FontWeight que tiene variables estáticas para ello
	       //es decir, cada variable contiene un estilo de negrita diferente
	       //no todas la fuentes poseen dichos estilos de modo que algunos estilos pueden no funcionar
	       //12 es el tamaño de la fuente
	       usuarioLbl.setFont(Font.font("impact", FontWeight.BOLD, 20));
	       
	       // Alineación horizontal para el campo usuario.
	       GridPane.setHalignment(usuarioTxt, HPos.LEFT);
	       layout.add(usuarioTxt, 1, 1);
	 
	       Scene scene = new Scene(layout, 500, 300);
	       ventana.setTitle("Ejemplo básico 3 - GridPane");
	       ventana.setScene(scene);
	       ventana.show();
	   }
	
	public static void main(String[] args) {
		launch(args);
	}
}
