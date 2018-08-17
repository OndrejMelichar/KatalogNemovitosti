/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenjavafxpokus1.katalognemovitosti;

/**
 *
 * @author admin
 */
public class Nemovitost {
    
    private final String typ;
    private final double plocha;
    private final int mistnosti;
    private final double cena;
    
    public Nemovitost(String typ, double plocha, int mistnosti, double cena) {
        this.typ = typ;
        this.plocha = plocha;
        this.mistnosti = mistnosti;
        this.cena = cena;
    }
    
    public String getTyp() {
        return typ;
    }
    
    public double getPlocha() {
        return plocha;
    }
    
    public int getMistnosti() {
        return mistnosti;
    }
    
    public double getCena() {
        return cena;
    }
    
}
