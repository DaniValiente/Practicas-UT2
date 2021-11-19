package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import Model.comentarios;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class NoticiaController implements Initializable {
	@FXML
	private Button boton;
	
	@FXML
    private TableView<comentarios> tabla;
    
	@FXML
    private TableColumn nickname;
	
	@FXML
    private TableColumn comentario;
    @FXML
    private ObservableList<comentarios> comentarios2;
	
	
		@FXML 
		private void nuevaventana2(ActionEvent event) throws IOException {
			FXMLLoader	loader2 = new FXMLLoader(getClass().getResource("encuesta.fxml"));
			AnchorPane root2 = (AnchorPane)loader2.load();
			Stage stage2= new Stage();
			stage2.setScene(new Scene(root2));
			stage2.show();
		}
		

		@FXML
		private void mostrarAlertConfirmation(ActionEvent event) throws IOException {
			
			Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
			alert.setHeaderText(null);
			alert.setTitle("Confirmación");
			alert.setContentText("¿Estas seguro de que no quieres ver la encuesta?");
			Optional<ButtonType> action = alert.showAndWait();
			if (action.get() == ButtonType.OK) {
				Node source = (Node) event.getSource();
			    Stage stage = (Stage) source.getScene().getWindow();
			    stage.close();
			} else {
			  
			}
		} 

		@SuppressWarnings("unchecked")
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
		
			tabla.getColumns().addAll(nickname,comentario);
			
			comentarios2 = FXCollections.observableArrayList(
					new comentarios("Mario","Roman"),
					new comentarios("Daniel", "Valiente"),
					new comentarios("Andres","Lozano"));
			
			nickname.setCellValueFactory(new PropertyValueFactory<comentarios,String>("nickname"));
			comentario.setCellValueFactory(new PropertyValueFactory<comentarios,String>("comentario"));
		
			tabla.setItems(comentarios2);
		}

}

