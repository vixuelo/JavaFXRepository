package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Ejemplo2 extends Application {
	@Override
	public void start(Stage ventana) {
		ventana.setTitle("Controles FX");

		//Pane emula el null layout; por si solo no tiene layout ******************
		Pane layout = new Pane();

		//Etiqueta***********************************************************************
		Label etiqueta = new Label("Etiqueta");
		etiqueta.relocate(10, 10);

		//Botón**************************************************************************
		Button boton = new Button("Botón");
		boton.relocate(10, 30);

		//Radio button*******************************************************************
		RadioButton rb1 = new RadioButton("Rojo");
		RadioButton rb2 = new RadioButton("Verde");
		RadioButton rb3 = new RadioButton("Azul");

		rb1.relocate(10, 60);
		rb2.relocate(10, 80);
		rb3.relocate(10, 100);

		//Añadimos los radio a un grupo
		final ToggleGroup grupoRadio = new ToggleGroup();
		rb1.setToggleGroup(grupoRadio);
		rb2.setToggleGroup(grupoRadio);
		rb3.setToggleGroup(grupoRadio);


		//Toggle button funciona como el radio ******************************************
		ToggleButton tb1 = new ToggleButton("Colecciones");
		ToggleButton tb2 = new ToggleButton("Donaciones");
		ToggleButton tb3 = new ToggleButton ("Exposiciones");

		tb1.relocate(10, 140);
		tb2.relocate(10, 170);
		tb3.relocate(10, 200);

		//Hacemos un grupo para el toggle tal y como se hizo para el radio
		final ToggleGroup grupoToggleButton = new ToggleGroup();
		tb1.setToggleGroup(grupoToggleButton);
		tb2.setToggleGroup(grupoToggleButton);
		tb3.setToggleGroup(grupoToggleButton);


		//checkbox ***********************************************************************
		CheckBox cb1 = new CheckBox("Hacer copia");
		CheckBox cb2 = new CheckBox("Cifrar documento");

		cb1.relocate(10, 240);
		cb2.relocate(10, 260);

		//seleccionamos el checkbox cb1
		cb1.setSelected(true);
		//dejamos en estado indeterminado el cb2
		cb2.setIndeterminate(true);

		System.out.println(cb2.isSelected()); //false
		System.out.println(cb2.isIndeterminate());//true

		//Combo****************************************************************************
		ObservableList<String> options = 
				FXCollections.observableArrayList(
						"Español",
						"English",
						"Français"
						);
		final ComboBox comboBox = new ComboBox(options);

		//Establecer elemento por defecto
		comboBox.setValue("Español");

		//Mensaje de ayuda emergente
		comboBox.setTooltip(new Tooltip("Selecciona un idioma"));
		
		comboBox.relocate(10, 290);

		//Campo de texto*****************************************************************
		final TextField nombreTxt = new TextField();

		//ayuda escrita en el campo de texto
		nombreTxt.setPromptText("Ingresa tu nombre");

		nombreTxt.relocate(10, 330);

		//Campo para contraseñas*********************************************************
		PasswordField claveTxt = new PasswordField();

		//ayuda escrita en el campo de texto
		claveTxt.setPromptText("Introduce tu clave");

		claveTxt.relocate(10, 370);


		//Lista *****************************************************************************
		//Creamos la lista
		ListView<String> lista = new ListView<>();
		
		//Creamos una lista de objetos sensibles a ser observados cuando ocurra un evento
		//Creamos un objeto elementosLista de tipo ObservableList cuyos elementos serán String
		ObservableList<String> elementosLista =FXCollections.observableArrayList (
		    "Pan", "Aceite", "Tomate", "Jamón", "Melocotón", "Fresas", "Pimiento");
		//añadimos todos ellos a la lista
		lista.setItems(elementosLista);
		
		//Además podemos establecer el ancho y alto de la lista
		lista.setPrefWidth(280);
		lista.setPrefHeight(50);
		
		//Podemos establecer la orientación de nuestra lista
		//Clase Orientation y HORIZONTAL es un atributo de dicha clase
		//Por defecto la lista es Vertical
		lista.setOrientation(Orientation.HORIZONTAL);
		
		lista.relocate(10, 400);

		//Color picker****************************************************************************
		//Color constant set as the currently selected color
		//Es un control que ya está codificado, es decir, listo para ser usado
		ColorPicker colorPicker = new ColorPicker();
		colorPicker.relocate(10, 470);
		
		//fijamos un color por defecto mediante setValue
		//también puede seleccionarse en hexadecimal: Color.web("#ffcce6")
		colorPicker.setValue(Color.CORAL);
		
		//Añadimos los componentes al pane
		layout.getChildren().add(etiqueta);
		layout.getChildren().add(boton);
		layout.getChildren().add(rb1);
		layout.getChildren().add(rb2);
		layout.getChildren().add(rb3);
		layout.getChildren().add(tb1);
		layout.getChildren().add(tb2);
		layout.getChildren().add(tb3);
		layout.getChildren().add(cb1);
		layout.getChildren().add(cb2);
		layout.getChildren().add(comboBox);
		layout.getChildren().add(nombreTxt);
		layout.getChildren().add(claveTxt);
		layout.getChildren().add(lista);
		layout.getChildren().add(colorPicker);
		
		Scene scene = new Scene(layout,600,600);
		ventana.setScene(scene);
		ventana.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
