package com.mavenjavafxpokus1.katalognemovitosti;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    
    private SpravceNemovitosti spravceNemovitosti = new SpravceNemovitosti();
    private PridatDialog pridatDialog = new PridatDialog();
    
    @FXML
    private TableView<Nemovitost> tableView;
    @FXML
    private TableColumn<Nemovitost, String> typTableColumn;
    @FXML
    private TableColumn<Nemovitost, Double> plochaTableColumn;
    @FXML
    private TableColumn<Nemovitost, Integer> mistnostiTableColumn;
    @FXML
    private TableColumn<Nemovitost, Double> cenaTableColumn;
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
    private void handleOdebratButtonAction(ActionEvent event) { // toto plně funguje a správně to naplní list
        spravceNemovitosti.pridejNemovitost(new Nemovitost("pozemek", 54, 3, 1123123));
        spravceNemovitosti.pridejNemovitost(new Nemovitost("pozemek", 74, 1, 1123123));
        spravceNemovitosti.pridejNemovitost(new Nemovitost("pozemek", 55, 5, 1123123));
        spravceNemovitosti.pridejNemovitost(new Nemovitost("pozemek", 40.54, 2, 1123123));
    }
    
    @FXML
    private void handlePridatButtonAction(ActionEvent event) {
        pridatDialog.zobrazDialog(odebratButton.getScene().getWindow());
    }
    
    @FXML
    private void handlePridatFinalAction(ActionEvent event) {
        Stage pridatDialog = (Stage)typComboBox.getScene().getWindow();
        pridatDialog.hide(); //.close()
        
        try { /*není to prasárna?*/
            String typ = (String)typComboBox.getSelectionModel().getSelectedItem();
            double plocha = Double.parseDouble(plochaTextField.getText());
            int mistnosti = Integer.parseInt(mistnostiTextField.getText());
            double cena = Double.parseDouble(cenaTextField.getText());

            Nemovitost novaNemovitost = new Nemovitost(typ, plocha, mistnosti, cena);
            spravceNemovitosti.pridejNemovitost(novaNemovitost);
        } catch (Exception e) {
            System.out.println("- - - - - Vyskytla se chyba!");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        typTableColumn.setCellValueFactory(new PropertyValueFactory<Nemovitost, String>("Typ")); //v závorce (na konci) by měl být v uvozovkách název getteru daného atributu (bez klíčového slova get a proto s velkým písmenem na začátku)
        plochaTableColumn.setCellValueFactory(new PropertyValueFactory<Nemovitost, Double>("Plocha"));
        mistnostiTableColumn.setCellValueFactory(new PropertyValueFactory<Nemovitost, Integer>("Mistnosti"));
        cenaTableColumn.setCellValueFactory(new PropertyValueFactory<Nemovitost, Double>("Cena"));
        tableView.setItems(spravceNemovitosti.getNemovitosti());
    }
    
}
