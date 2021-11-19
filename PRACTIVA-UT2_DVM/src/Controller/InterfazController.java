package Controller;

import java.awt.Component;
import java.awt.Container;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JScrollPane;

import Model.comentarios;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import Model.comentarios;

public class InterfazController{  
	@FXML
	private Button boton;
	
	
		@FXML 
		private void nuevaventana(ActionEvent event) throws IOException {
			FXMLLoader	loader1 = new FXMLLoader(getClass().getResource("noticia.fxml"));
			ScrollPane root1 = (ScrollPane)loader1.load();
			Stage stage= new Stage();
			Scene scene = new Scene(root1,500,500);
			stage.setScene(scene);
			stage.show();
			
		}

		
		
		
}
