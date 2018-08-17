package com.mavenjavafxpokus1.katalognemovitosti;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    private SpravceNemovitosti spravceNemovitosti = new SpravceNemovitosti();
    private PridatDialog pridatDialog = new PridatDialog();
    
    @FXML
    private TableColumn typTableColumn;
    @FXML
    private TableColumn plochaTableColumn;
    @FXML
    private TableColumn mistnostiTableColumn;
    @FXML
    private TableColumn cenaTableColumn;
    @FXML
    private Button odebratButton;
    
    /*podokno - přidat nemovitost*/
    @FXML
    private ComboBox typComboBox;
    @FXML
    private TextField plochaTextField;
    @FXML
    private TextField mistnostiTextField;
    @FXML
    private TextField cenaTextField;
    
    @FXML
    private void handleOdebratButtonAction(ActionEvent event) {
        
    }
    
    @FXML
    private void handlePridatButtonAction(ActionEvent event) {
        pridatDialog.zobrazDialog(odebratButton.getScene().getWindow());
    }
    
    @FXML
    private void handlePridatFinalAction(ActionEvent event) {
        //String operace = (String)operaceComboBox.getSelectionModel().getSelectedItem();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
