package paquete.javafx;
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class AlertBox {
public static void mostrar(String titulo, String mensaje)
	{
		Stage window=new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(titulo);
		window.setMinWidth(250);
		window.setMinHeight(250);
		Label lbl=new Label();
		Button btn=new Button("Cerrar ventana");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				window.close();
			}
		});
		VBox layout =new VBox(10);
		layout.getChildren().addAll(lbl, btn);
		layout.setAlignment(Pos.CENTER);
		Scene scene=new Scene(layout);
		window.setScene(scene);
		window.show();
	}
}
