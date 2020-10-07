package paquete.javafx;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
public class ClasePrincipal extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane s=new StackPane();
		Scene scene=new Scene(s, 200, 200);
		Button btn=new Button("Clicame");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				AlertBox.mostrar("Titulo", "Mensaje");
				
				
			}
		});
		s.getChildren().add(btn);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
