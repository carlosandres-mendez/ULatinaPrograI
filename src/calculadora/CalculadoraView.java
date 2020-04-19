/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosandres.mendez
 * Clase VISTA. Observar que esta es la unica clase que hace uso de la libreria javax.swing
 * Ademas, es la unica clase donde se hubica los mensajes al usuario. Si en el futuro se requiere ajustar los mensajes,
 * entonces solo se necesita revisar esta clase.
 */
public class CalculadoraView {
    Calculadora calculadora; //Observese que esta clase vista se compone de las clases del modelo
    
    public final static String ERROR_VACIO="Debe ingresar valores para los números";
    public final static String ERROR_NO_NUMERO="Debe ingresar únicamente números";
    
    /**
     * CONSTRUCTOR
     * Este constructor es clave para el patron MVC. Se pasa como parametro una referencia de una clase del modelo
     * @param c
     */
    public CalculadoraView(Calculadora c){
        this.calculadora=c; //esta linea es importante ya que asignamos el objeto que se instancio en la clase controladora
    }
    
    //*** METODOS PARA INTERACTUAR CON EL USUARIO ******
    
    public void solicitarPrimerNumero(){
        String numero = JOptionPane.showInputDialog("Ingrese un número");
        if (numero.isEmpty()){
            throw new NullPointerException(); //ej de lanzar una excepcion si no digito nada
        }
        calculadora.setNum1(Double.parseDouble(numero)); //Double.parseDouble puede generar una excepcion que se ataja en clase Controller
    }
    
    public void solicitarSegundoNumero(){
        String numero = JOptionPane.showInputDialog("Ingrese un segundo número");
        if (numero.isEmpty()){
            throw new NullPointerException(); //ej de lanzar una excepcion si no digito nada
        }
        calculadora.setNum2(Double.parseDouble(numero)); //Double.parseDouble puede generar una excepcion que se ataja en clase Controller
    }
    
    public String solicitarOperacion(){
        String operacion = JOptionPane.showInputDialog("Ingrese la operación que desea realizar: " + "\n"
                        + "S para suma" + "\n"
                        + "R para resta" + "\n"
                        + "M para multiplicación" + "\n"
                        + "D para división" + "\n"
                        + "Q para salir" + "\n").trim().toUpperCase();
        return operacion;
    }

    public void mostrarResultado(double resultado){
        JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
    }
    
    public void mostrarMensajePersonalizado(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }     
    
    public void mostrarMensajeErrorGeneral(){
        JOptionPane.showMessageDialog(null, "Error al procesar solicitud, por favor contacte el administrador. ");
    }    
}
