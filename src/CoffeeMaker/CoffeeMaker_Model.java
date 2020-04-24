/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeMaker;

/**
 *
 * @author tati
 */
public class CoffeeMaker_Model {

    int tazasAgua = 4;
    int tazasCafe = 4;

    public CoffeeMaker_Model() {

    }

    public void servir(int tazas) {
        this.tazasAgua = this.tazasAgua - tazas;
    }

    public void lavar() {
        this.tazasAgua = 0;
        this.tazasCafe = 0;
    }

    public void chorrear() {
        
    }

    public int getTazasAgua() {
        return tazasAgua;
    }

    public int getTazasCafe() {
        return tazasCafe;
    }
    
}
