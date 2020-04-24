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
public class Reloj {

    private String horas = "";
    private String minutos = "";

    public void setAlarm(String horas, String minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

}
