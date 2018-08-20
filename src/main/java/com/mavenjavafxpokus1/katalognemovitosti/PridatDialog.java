/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenjavafxpokus1.katalognemovitosti;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author admin
 */
public class PridatDialog extends Stage {
    
    public void zobrazDialog(Window hlavniOkno) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/PridatNemovitostDialog.fxml")); // bez initialize funguje: /fxml/PridatNemovitostDialog.fxml
            Parent root = (Parent) fxmlLoader.load();
            Stage okno = new Stage();// toto už se neprovede
            okno.initModality(Modality.WINDOW_MODAL); /*nevím přesně k čemu to je -> mohu to odstranit?*/
            okno.initOwner(hlavniOkno); /*nevím přesně k čemu to je -> mohu to odstranit?*/
            okno.setTitle("Přidat nemovitost");
            okno.setResizable(false);
            okno.setScene(new Scene(root));
            okno.show();
        } catch (Exception e) {
            System.out.println("- - - - - CHYBA: " + e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
}
