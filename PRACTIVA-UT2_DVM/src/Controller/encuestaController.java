package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class encuestaController implements Initializable {
	@FXML
	private Button botoncito;
	
	@FXML
	private PieChart encuesta;
	
	@FXML
	 public void close(ActionEvent event) { 
		Node source = (Node) event.getSource();
	    Stage stage = (Stage) source.getScene().getWindow();
	    stage.close();
	
	}
	
	@FXML
	private void mostrarencuesta(ActionEvent event) {
		ObservableList<Data> list = FXCollections.observableArrayList(
				new PieChart.Data("SI", 70),
				new PieChart.Data("NO", 30)
		);
		encuesta.setData(list);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
