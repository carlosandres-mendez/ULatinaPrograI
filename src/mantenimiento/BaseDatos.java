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
public class BaseDatos {
    List<Empleado> listaEmpleados = new ArrayList<>();
    
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    
}
