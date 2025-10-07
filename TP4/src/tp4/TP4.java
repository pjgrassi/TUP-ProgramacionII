/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Personal
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos 4 empleados, 2 con un contructor y dos con el otro
        Empleado emp1 = new Empleado(1,"Juan Perez","Vendedor",1000000);
        Empleado emp2 = new Empleado(2,"Maria Gonzalez","Cajera",1200000);
        Empleado emp3 = new Empleado("Lucas Orban","Encargado");
        Empleado emp4 = new Empleado("Ana Leto","Gerenta");
        
        //mostramos datos de empleados creados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println("");
        
        //actualizamos salario
        emp3.actualizarSalario();
        emp4.actualizarSalario(15);
        
        //volvemos a mostrar info de empleados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println("");
        
        //mostrar total empleados
        System.out.println("El total de empleados es: "+Empleado.mostrarTotalEmpleados());
    }
    
}
