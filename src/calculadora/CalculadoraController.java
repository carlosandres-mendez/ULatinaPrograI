/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


/**
 *
 * @author carlosandres.mendez
 * Esta clase es la clase Controladora, es la clase que se encarga de controlar el flujo del programa
 * Esta clase es como un intermediario entre la clase Vista y las clases del modelo
 */
public class CalculadoraController {
    
    public void iniciar(){
        Calculadora c = new Calculadora(); //Se instancia la clase del modelo
        CalculadoraView cv = new CalculadoraView(c); //Se instancia la clase de la Vista (ojo se pasa en el contructor el objeto de clase modelo)
        
        boolean estado = false;
        do {
            try {
                cv.solicitarPrimerNumero(); //le decimos a la Vista que solicite el primer numero y se lo pase al controller
                cv.solicitarSegundoNumero(); //le decimos a la Vista que solicite el segundo numero y se lo pase al controller

                String operacion = cv.solicitarOperacion(); //le decimos a la Vista que solicite la operacion y la retorne
                switch (operacion) {
                    case "S":
                        cv.mostrarResultado(c.suma());
                        estado = false;
                        break;
                    case "R":
                        cv.mostrarResultado(c.resta());
                        estado = false;
                        break;
                    case "M":
                        cv.mostrarResultado(c.multiplicacion());
                        estado = false;
                        break;
                    case "D":
                        cv.mostrarResultado(c.division());
                        estado = false;
                        break;
                    case "Q":
                        estado = true;
                        break;
                    default:
                        throw new Exception();
                }
            }
            catch (NullPointerException e){
                cv.mostrarMensajePersonalizado(CalculadoraView.ERROR_VACIO); //se usa CalculadoraView.ERROR_VACIO y no cv.ERROR_VACIO por se varible estatica
            }
            catch (NumberFormatException e){
                cv.mostrarMensajePersonalizado(CalculadoraView.ERROR_NO_NUMERO); //si se lanza esta execpcion se muestra este mensaje
            }
            catch (Exception e) {
                cv.mostrarMensajeErrorGeneral(); //este error se muestra x ej al dividir 2 entre 0
            }
        } while (estado == false); 
    }
}
