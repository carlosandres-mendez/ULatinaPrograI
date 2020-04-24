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
        List<Empleado> listaEmpleados = new ArrayList<>();
        
        Empleado emp1 = new Empleado();
        emp1.setApellido("aaa");
        emp1.setEdad(33);
        emp1.setNumEmpleado(2);
        emp1.setNombre("ddd");
        
        listaEmpleados.add(emp1);
        
        for(Empleado emp : listaEmpleados){
            System.out.print(emp.getNombre()+" "+emp.getApellido());
          
        }  
    } 
}
