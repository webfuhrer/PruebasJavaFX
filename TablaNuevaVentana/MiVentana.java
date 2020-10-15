/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx_1;

import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author FPMananaA
 */
public class MiVentana {
    public static void mostrarVentana(String titulo, ArrayList<Persona> lista)
    {TableView tv=new TableView();
      
      TableColumn<String, Persona> columna1 = new TableColumn<>("NOMBRE");
      columna1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
      TableColumn<String, Persona> columna2 = new TableColumn<>("TELEFONO");
      columna2.setCellValueFactory(new PropertyValueFactory<>("telefono"));
      tv.getColumns().add(columna1);
      tv.getColumns().add(columna2);
    
        for (Persona persona : lista) {
            tv.getItems().add(persona);
        }
        Stage ventana=new Stage();
        ventana.setTitle(titulo);
        VBox v=new VBox(20);
        Label lbl=new Label("Esto es unaetiqueta");
        v.getChildren().addAll(lbl, tv);
        Scene escena =new Scene(v, 200, 200);
        ventana.setScene(escena);
        ventana.show();
    }
}
