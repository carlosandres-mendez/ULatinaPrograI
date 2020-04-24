/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeMaker;

import javax.swing.JOptionPane;

/**
 *
 * @author tati
 */
public class CoffeeMaker_View {

    CoffeeMaker_Model coffeeMaker;
    Reloj reloj = new Reloj();

    public CoffeeMaker_View(CoffeeMaker_Model cfm) {
        this.coffeeMaker = cfm;

    }

// Vistas
    public void esHoraDeHacerCafe() {
        String hora = "";
        String h = JOptionPane.showInputDialog(null, "Digite la hora en formato militar que deseas hacer cafe");
        String m = JOptionPane.showInputDialog(null, "Digite los minutos que deseas hacer cafe");
        hora = h + ":" + m;
        reloj.setAlarm(h, m);
    }

    public void noSePuedeHacerCafe() {
        JOptionPane.showMessageDialog(null, "No es la hora de hacer cafe, vuleve mas tarde");
        System.exit(0);

    }

    public void haciendoCafe() {
        JOptionPane.showMessageDialog(null, "Empezando a hacer el cafe.....");
        boolean estado = false;
        do {
            int tazas = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas tazas de cafe quieres hacer"));

            if (tazas <= coffeeMaker.tazasAgua) {
                String limpio = JOptionPane.showInputDialog(null, "El Coffee Maker esta limpio?");
                if (limpio.toUpperCase().equals("SI")) {
                    autoLlenado();
                } else {
                    lavar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No puedes hacer mas tazas de las que el Coffee Maker puede hacer");
            }
        } while (estado == false);

    }

    public void lavar() {
        JOptionPane.showMessageDialog(null, "Se esta lavando el coffee maker....");
        coffeeMaker.lavar();
        JOptionPane.showMessageDialog(null, "Se procederá a hacer el autollenado de agua y café");
        autoLlenado();

    }

    public void autoLlenado() {
        JOptionPane.showMessageDialog(null, "Se ha realizado un autollenado con " + coffeeMaker.tazasAgua + " Tazas de agua y con " + " " + coffeeMaker.tazasCafe + " tazas de cafe");
    }

}
