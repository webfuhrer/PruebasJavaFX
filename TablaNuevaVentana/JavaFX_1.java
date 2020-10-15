/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_1;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author FPMananaA
 */
public class JavaFX_1 extends Application  {
VBox v;
TextField campo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

    @Override
    public void start(Stage window) throws Exception {
  
      v=new VBox(30);
    Button boton=new Button("ABRIR VENTANA");
      
      
    
     
     /*v.getChildren().add(tv);
     v.getChildren().add(boton);*/
     boton.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent t) {
                ArrayList<Persona> lista=new ArrayList();
                Persona p1=new Persona("Pepe", "989898656");
                Persona p2=new Persona("Ana", "989898656");
                Persona p3=new Persona("Jose", "989898656");
                Persona p4=new Persona("Teresa", "989898656");
                lista.add(p1);
                lista.add(p2);
                lista.add(p3);
             MiVentana.mostrarVentana("Ventana secundaria", lista);
          }
     });
     v.getChildren().addAll( boton);
     
     Scene escena=new Scene(v, 200, 200);
     window.setScene(escena);
     window.show();
    }




}
