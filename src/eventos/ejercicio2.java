package eventos;
	
import java.awt.Event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ejercicio2 extends Application {
		

		Label nombreLbl = new Label("Escriba su nombre");
		TextField nombreTxt = new TextField("892");
		
		Label IngresoLbl = new Label("ingresar");
		TextField IngresoTxt = new TextField();
		
		Label RetiradaLbl = new Label("retirar");
		TextField RetiradaTxt = new TextField();
		
		Button btnr = new Button("Ingresar");
		Button btni = new Button("Retirar");
		
		@Override
	    public void start(Stage ventana) throws Exception {
	        ventana.setTitle("Formulario en cuadrícula");

	        GridPane layout = new GridPane();

	        nombreTxt.setEditable(false);
	        layout.add(nombreLbl, 0, 0,3,1);
	        layout.add(nombreTxt, 0, 1,3,1);
	        layout.add(IngresoLbl, 0,2);
	        layout.add(RetiradaLbl, 0, 3);
	        layout.add(IngresoTxt, 1, 2);
	        layout.add(RetiradaTxt, 1, 3);
	        layout.add(btnr, 2, 2);
	        layout.add(btni, 2, 3);
	        btnr.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        	//Discriminamos tras el clic cuál botón ha sido pulsado
				public void handle(MouseEvent evento) {
					if(!(Integer.parseInt(IngresoTxt.getText())<0))
					nombreTxt.setText(String.valueOf(Integer.parseInt(nombreTxt.getText())+Integer.parseInt(IngresoTxt.getText())));
				}
			});
	        btni.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        	//Discriminamos tras el clic cuál botón ha sido pulsado
				public void handle(MouseEvent evento) {
					int valorPosterior=Integer.parseInt(nombreTxt.getText())-Integer.parseInt(RetiradaTxt.getText());
					if(!(valorPosterior<=(-3000))) {
						nombreTxt.setText(String.valueOf(valorPosterior));
					}
				}
			});
	        //espacio en la horizontal de las celdas del layout
	        layout.setHgap(10);
	        
	        //espacio en la vertical de las celdas del layout
	        layout.setVgap(10);
	        
	        //margen interno del layout
	        layout.setPadding(new Insets(10,10,10,10));
	        
	        Scene scene = new Scene(layout, 300, 140);
	        ventana.setScene(scene);
	        ventana.show();
	    }

	    public static void main(String[] args) {
	        Application.launch(args);
	    }
}
