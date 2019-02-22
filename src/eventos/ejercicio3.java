package eventos;
	
import java.awt.Event;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ejercicio3 extends Application {
		
		ObservableList<String> convOL = FXCollections.observableArrayList("mm","cm","dm","m","Dm","Hm","Km");
		ComboBox origenCB = new ComboBox<>(convOL);
		TextField origenTxt = new TextField();
		
		ComboBox DestinoCB = new ComboBox<>(convOL);
		TextField DestinoTxt = new TextField();
		
		
		Button btnr = new Button("Retirar");
		
		@Override
	    public void start(Stage ventana) throws Exception {
	        ventana.setTitle("Formulario en cuadrícula");

	        GridPane layout = new GridPane();

	        layout.add(origenCB, 0, 0);
	        layout.add(DestinoCB, 0,1);
	        layout.add(origenTxt, 1, 0);
	        layout.add(DestinoTxt, 1, 1);
	        layout.add(btnr, 2, 0);
	        btnr.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        	//Discriminamos tras el clic cuál botón ha sido pulsado
				public void handle(MouseEvent evento) {
					convertir(origenTxt,origenCB,DestinoTxt,DestinoCB);
					
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
		public void convertir(TextField origen,ComboBox origenCB,TextField destino,ComboBox destinoCB) {
			int inicio=Integer.parseInt(origen.getText());
			String indice=(String) origenCB.getValue();
			int indiceInt=convOL.indexOf(indice);
			double iniciocasted= inicio*Math.pow(10,convOL.indexOf((String) origenCB.getValue())-3);
			destino.setText(String.valueOf(iniciocasted/ Math.pow(10,convOL.indexOf((String) destinoCB.getValue())-3)));
			
		}

	    public static void main(String[] args) {
	        Application.launch(args);
	    }
}
