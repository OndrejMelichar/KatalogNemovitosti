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
            //event.notifyAll();
        } catch (Exception e) {
            System.out.println("- - - - - Vyskytla se chyba!");
            e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { // pro každý FXML dokument používat jeho vlastní Controller (každé okno má svůj Controller)
        System.out.println("URL: " + url);
        System.out.println("RB: " + rb);
        System.out.println("XXXXXXXXXXXXXX" + this.typTableColumn + "- " + this.plochaTableColumn);
//        this.typTableColumn = new TableColumn<>();
        typTableColumn.setCellValueFactory(new PropertyValueFactory<Nemovitost, String>("Typ")); //v závorce (na konci) by měl být v uvozovkách název getteru daného atributu (bez klíčového slova get a proto s velkým písmenem na začátku)
//        this.plochaTableColumn = new TableColumn<>();
        plochaTableColumn.setCellValueFactory(new PropertyValueFactory<Nemovitost, Double>("Plocha"));
//        this.mistnostiTableColumn = new TableColumn<>();
        mistnostiTableColumn.setCellValueFactory(new PropertyValueFactory<Nemovitost, Integer>("Mistnosti"));
//        this.cenaTableColumn = new TableColumn<>();
        cenaTableColumn.setCellValueFactory(new PropertyValueFactory<Nemovitost, Double>("Cena"));
//        this.tableView = new TableView<>();
        tableView.setItems(spravceNemovitosti.getNemovitosti());
    }
    
}
