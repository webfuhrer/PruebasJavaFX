package pauqte.javafx;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class ClasePrincipal extends Application{
Stage window;
Scene escena1, escena2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window=primaryStage;
		//StackPane layout=new StackPane();
		VBox layout=new VBox(20);
		Button b=new Button();
		Label lbl=new Label("Esto es un label");
		b.setText("Clicame");
		/*layout.getChildren().add(lbl);
		layout.getChildren().add(b);*/
		layout.getChildren().addAll(lbl, b);
		escena1=new Scene(layout, 400, 300);
		window.setScene(escena1);
		primaryStage.show();
		
		//Puede cambiarse la escena con el setScene
	}
	

}
