package eventos;

import java.io.File;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class Main2 extends Application {
	String ruta = "src/audio/do8.wav";

	Media sound;
	MediaPlayer mediaPlayer;

	Label label = new Label("Toca la tecla S para emitir un sonido");

	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		root.setCenter(label);
		Scene scene = new Scene(root,400,400);

		KeyCombination do8KC = new KeyCodeCombination(KeyCode.S);

		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				//comprueba si la tecla del event coincide con la combinacion de tecla Q
				if(do8KC.match(event)) {
					//para representar la pista de audio le pasamos al constructor de media
					//la informacion del recurso que contiene la ruta
					//así tendríamos el sonido almacenado en nuestro objeto sound
					//URI identificador de recursos: te indica el tipo de recurso y la ruta absoluta(dependiente del SO)
					//Media requiere un representación en String de la URI que contiene la ruta del clip de audio
					sound = new Media(new File(ruta).toURI().toString());

					//a mediaPlayer le pasamos la pista de audio
					//contenida en el objeto sound
					mediaPlayer = new MediaPlayer(sound);
					//a continuacion lo reproduce
					mediaPlayer.play();
				}

			}

		});

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}