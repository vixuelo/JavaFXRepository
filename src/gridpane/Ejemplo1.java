package gridpane;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Ejemplo1 extends Application {
	
	Button button1 = new Button("Botón 1");
    Button button2 = new Button("Botón 2");
    Button button3 = new Button("Botón 3");
    Button button4 = new Button("Botón 4");
    Button button5 = new Button("Botón 5");
    Button button6 = new Button("Botón 6");
	
	@Override
    public void start(Stage ventana) throws Exception {
        ventana.setTitle("Cuadrícula de botones");

        GridPane layout = new GridPane();
        
        //control, columna, fila
        layout.add(button1, 0, 0);
        layout.add(button2, 1, 0);
        layout.add(button3, 2, 0);
        layout.add(button4, 0, 1);
        layout.add(button5, 1, 1);
        layout.add(button6, 2, 1);

        Scene scene = new Scene(layout, 240, 100);
        ventana.setScene(scene);
        ventana.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
