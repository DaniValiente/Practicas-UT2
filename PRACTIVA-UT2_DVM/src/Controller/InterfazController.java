package Controller;

import java.awt.Component;
import java.awt.Container;
import java.io.IOException;

import javax.swing.JScrollPane;

import Model.comentarios;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class InterfazController extends Application {
	@FXML
	private Button boton;
	
	
	
		@FXML 
		private void nuevaventana(ActionEvent event) throws IOException {
			
			TableView<comentarios>tabla = new TableView<>();
			ObservableList<comentarios>coment = FXCollections.observableArrayList(
					new comentarios("FUTBOL10","Mi hijo esta en mejor forma que el gordo ese"),
					new comentarios("vikingo9","hay que echarle ya GORDO"),
					new comentarios("suportito","Es normal que sea adicto a los fosquitos,estan muy buenos")
					);
			
			tabla.getItems((new comentarios("FUTBOL10","Mi hijo esta en mejor forma que el gordo ese"),
					new comentarios("vikingo9","hay que echarle ya GORDO"),
					new comentarios("suportito","Es normal que sea adicto a los fosquitos,estan muy buenos"));
			
			
			FXMLLoader	loader1 = new FXMLLoader(getClass().getResource("noticia.fxml"));
			ScrollPane root1 = (ScrollPane)loader1.load();
			Stage stage= new Stage();
			Scene scene = new Scene(root1,500,500);
			stage.setScene(scene);
			stage.show();
			
		}
		
		@Override
		public void start(Stage arg0) throws Exception {
			// TODO Auto-generated method stub
			
		}
}
