/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Personal
 */
public class Empleado {
    // declaramos atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    //constructor de la clase que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        Empleado.totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    //constructor de la clase que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        Empleado.totalEmpleados++;
        this.id = Empleado.totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 2000000;
    }
    
    // getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }
    
   // metodo actualizar salario por porcentaje    
    public void actualizarSalario(double porcentaje){
        if(porcentaje > 0){
            this.salario = salario * (1+(porcentaje/100));
        }
    }
    
    // usando metodo anterior doy un aumento fijo
    public void actualizarSalario(){
        actualizarSalario(10);
    }

    //metodo to string
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario= $" + salario + '}';
    }
    
    //metodo para mostrar total de empleados
    public static int mostrarTotalEmpleados(){
        return Empleado.totalEmpleados;
    }
    
    
    
}
