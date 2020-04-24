/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Tester {
    public static void main (String a[]){
        BaseDatos bd = new BaseDatos();
        
        Empleado emp1 = new Empleado();
        emp1.setApellido("aaa");
        emp1.setEdad(33);
        emp1.setNumEmpleado(2);
        emp1.setNombre("ddd");
        
        bd.agregarEmpleado(emp1);
        
        for(Empleado emp : bd.getListaEmpleados()){
            System.out.print(emp.getNombre()+" "+emp.getApellido());
          
        }  
    } 
}
