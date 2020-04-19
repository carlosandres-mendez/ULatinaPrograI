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
        
        //Algo caracteristico del patron MVC es que en el controller instanciamos las clases del modelo y la clase de la vista
        Calculadora calc = new Calculadora(); //Se instancia la clase del modelo. 
        CalculadoraView cv = new CalculadoraView(calc); //Se instancia la clase de la Vista (MVC: se pasa al contructor el objeto de la clase modelo)
        
        boolean estado = false;
        do {
            try {
                cv.solicitarPrimerNumero(); //le decimos a la Vista que solicite el primer numero y se lo pase al controller
                cv.solicitarSegundoNumero(); //le decimos a la Vista que solicite el segundo numero y se lo pase al controller

                String operacion = cv.solicitarOperacion(); //le decimos a la Vista que solicite la operacion y la retorne
                switch (operacion) {
                    case "S":
                        cv.mostrarResultado(calc.suma());
                        estado = false;
                        break;
                    case "R":
                        cv.mostrarResultado(calc.resta());
                        estado = false;
                        break;
                    case "M":
                        cv.mostrarResultado(calc.multiplicacion());
                        estado = false;
                        break;
                    case "D":
                        cv.mostrarResultado(calc.division());
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
