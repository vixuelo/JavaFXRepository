package gridpane;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class act4 extends Application{
	BorderPane main = new BorderPane();
	HBox top = new HBox();
		String nameleft = "Lidia";
		Label nameLeftL = new Label(nameleft);
		
		String nameRight ="Hector";
		Label nameRightL= new Label(nameRight);
		
		String status = "Online";
		Label statusL = new Label(status);
	GridPane central = new GridPane();
		String pathImgLeft = "C:\\Users\\AlumnoM\\eclipse-workspace-2aEv\\1erJavaFX\\src\\gridpane\\img\\chica.png";
		Image imgLeft;
		ImageView imgvwLeft;
		
		String msgLeft = "Hola, como ha ido el dia?";
		Label msgLeftL = new Label(msgLeft);
		
		String msgRigth = "Muy bien, gracias!!";
		Label msgRigthL = new Label(msgRigth);
		
		String pathImgRigth = "C:\\Users\\AlumnoM\\eclipse-workspace-2aEv\\1erJavaFX\\src\\gridpane\\img\\chico.png";
		Image imageRight;
		ImageView imgvwRight;
	HBox bottom = new HBox();
		String pathImgLeftTop = "C:\\Users\\AlumnoM\\eclipse-workspace-2aEv\\1erJavaFX\\src\\gridpane\\img\\adjuntar.png";
		Image imgLeftT;
		ImageView imgvwLeftT;
		
		Separator SepLeft= new Separator(Orientation.VERTICAL);
		
		TextField msgTxt = new TextField();
		
		Separator SepRigth = new Separator(Orientation.VERTICAL);
		
		String pathImgRigthTop = "C:\\Users\\AlumnoM\\eclipse-workspace-2aEv\\1erJavaFX\\src\\gridpane\\img\\enviar.png";
		Image imgRightT;
		ImageView imgvwRigthT;
		Button adjuntar;
		Button enviar;
	
		@Override
		public void init() {
			try {
		    	FileInputStream foto1 = new FileInputStream(pathImgLeft);
		 		imgLeft = new Image(foto1);
		 		imgvwLeft = new ImageView(imgLeft);
		 		
		 		foto1 = new FileInputStream(pathImgRigth);
		 		imageRight = new Image(foto1);
		 		imgvwRight = new ImageView(imageRight);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				FileInputStream foto1 = new FileInputStream(pathImgLeftTop);
		 		 imgLeftT = new Image(foto1);
		 		imgvwLeftT = new ImageView(imgLeftT);
		 		adjuntar = new Button("", imgvwLeftT);
		 		
		 		foto1 = new FileInputStream(pathImgRigthTop);
		 		imgRightT = new Image(foto1);
		 		imgvwRigthT = new ImageView(imgRightT);
		 		enviar = new Button("", imgvwRigthT);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
			top.getChildren().addAll(nameLeftL,statusL,nameRightL);
			top.setAlignment(Pos.CENTER);
			top.setSpacing(160);
			bottom.setSpacing(50);

			nameLeftL.setPadding(new Insets(30,10,10,10));
			nameRightL.setPadding(new Insets(30,10,10,10));
			
		main.setTop(top);
			central.setVgap(10);
			central.setHgap(40);
			central.add(imgvwLeft,0,0);
			central.add(msgLeftL,1,0);
			
			central.add(msgRigthL,2,1);
			central.add(imgvwRight,3,1);
			central.setPadding(new Insets(10,10,10,10));
			central.setAlignment(Pos.CENTER);
		main.setCenter(central);
			bottom.getChildren().addAll(adjuntar,SepLeft,msgTxt,SepRigth,enviar);
			
			adjuntar.setPrefWidth(80);
			enviar.setPrefWidth(80);
		main.setBottom(bottom);
		Scene sc = new Scene(main,500,200);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
