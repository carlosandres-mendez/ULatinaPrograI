/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import juego.Juego;
import nota.Nota_C;

/**
 *
 * @author Andres
 */
public class Tester {
    public static void main (String a[]){
        
        
        Nota_C programaNotas = new Nota_C();
        programaNotas.iniciar();
        
        
        Juego programaJuego = new Juego();
        programaJuego.iniciar();
        
        
    }
}
