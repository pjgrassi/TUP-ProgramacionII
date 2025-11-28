/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Personal
 */
public abstract class Empleado {
    
    public double calcularSueldo(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return 1000000.0; //sueldo empleado planta
        } else if (e instanceof EmpleadoTemporal) {
            return 800000.0; //sueldo empleado temporal
        } else {
            return 0; //no es empleado
        }
    }
    
}
