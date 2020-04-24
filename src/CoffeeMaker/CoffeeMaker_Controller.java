/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeMaker;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tati
 */
public class CoffeeMaker_Controller {

    public void iniciar() {

        CoffeeMaker_Model cfm_model = new CoffeeMaker_Model();
        CoffeeMaker_View cfm_view = new CoffeeMaker_View(cfm_model);

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        Date horaLocal = new Date();

        boolean estado = false;

        try {
            cfm_view.esHoraDeHacerCafe();
            String hora = "";
            hora = cfm_view.reloj.getHoras() + ":" + cfm_view.reloj.getMinutos();
            if (hora.equals(formatter.format(horaLocal))) {
                cfm_view.haciendoCafe();
            } else {
                cfm_view.noSePuedeHacerCafe();
            }
        } catch (Exception e) {
        }

    }
}
