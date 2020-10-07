package paquete.javafx;
import java.security.Timestamp;
import java.util.Calendar;

import javax.swing.plaf.SliderUI;

import javafx.application.Application;
import javafx.concurrent.WorkerStateEvent;
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
				//AlertBox.mostrar("Titulo", "Mensaje");
//				for (int i=0; i<200; i++)
//				{
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
				System.out.println(Calendar.getInstance().getTimeInMillis());
				MiServicio m=new MiServicio();
				m.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
					
					@Override
					public void handle(WorkerStateEvent event) {
						// TODO Auto-generated method stub
						System.out.println("Terminó de contar");
						System.out.println(Calendar.getInstance().getTimeInMillis());
					}
				});
				m.start();
				
			}
		});
		s.getChildren().add(btn);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
