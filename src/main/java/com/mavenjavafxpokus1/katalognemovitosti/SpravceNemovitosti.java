/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenjavafxpokus1.katalognemovitosti;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author admin
 */
public class SpravceNemovitosti {
    
    private ObservableList<Nemovitost> nemovitosti = FXCollections.observableArrayList();
    
    public void pridejNemovitost(Nemovitost nemovitost) {
        nemovitosti.add(nemovitost);
    }
    
    public void odeberNemovitost(Nemovitost nemovitost) {
        nemovitosti.remove(nemovitost);
    }
    
    public ObservableList<Nemovitost> getNemovitosti() {
        return nemovitosti;
    }
    
}
