/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author carlosandres.mendez
 */
public class Calculadora {
    private double num1;
    private double num2;
    
    /**
     * Constructor predeterminado
     */
    public Calculadora(){
        this.num1 = 0;
        this.num2 = 0;
    }
    
    /**
     * Constructor adicional
     * @param pNum1
     * @param pNum2
     */
    public Calculadora(int pNum1, int pNum2){
        this.num1 = pNum1;
        this.num2 = pNum2;
    }
    
    
    
    /* METODOS OPERACIONES DE LA CALCULADORA */    
    public double suma(){
        return this.getNum1() + this.getNum2();
    }
    
    public double resta(){
        return this.getNum1() - this.getNum2();
    }
    
    public double multiplicacion(){
       return this.getNum1() * this.getNum2();
    }
    
    public double division(){
        double resultado = 0;
        if(this.getNum2() != 0){
             resultado = this.getNum1() / this.getNum2();
        }
        else{
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return resultado;
    }

    /* METODOS GETS y SETS GENERADOS AUTOMATICAMENTE */ 
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }  
}
