/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenjavafxpokus1.katalognemovitosti;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author admin
 */
public class Nemovitost {
    
    private SimpleStringProperty typ;
    private SimpleDoubleProperty plocha;
    private SimpleIntegerProperty mistnosti;
    private SimpleDoubleProperty cena;
    
    public Nemovitost(String typ, double plocha, int mistnosti, double cena) {
        this.typ = new SimpleStringProperty(typ);
        this.plocha = new SimpleDoubleProperty(plocha);
        this.mistnosti = new SimpleIntegerProperty(mistnosti);
        this.cena = new SimpleDoubleProperty(cena);
    }

    /*jsou potřeba všechny gettery a settery pro všechny parametry, které budou v tabulce - !: GETTERY A SETTERY JSOU POZMĚNĚNÉ*/
    public String getTyp() {
        return this.typ.get();
    }

    public void setTyp(String typ) {
        this.typ.set(typ);
    }

    public Double getPlocha() {
        return this.plocha.get();
    }

    public void setPlocha(double plocha) {
        this.plocha.set(plocha);
    }

    public Integer getMistnosti() {
        return this.mistnosti.get();
    }

    public void setMistnosti(int mistnosti) {
        this.mistnosti.set(mistnosti);
    }

    public Double getCena() {
        return this.cena.get();
    }

    public void setCena(double cena) {
        this.cena.set(cena);
    }
    
    
    
}
