/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Pablo Perez", "LIC123456");
        Motor motor = new Motor("Nafta", "MOT123456");
        Vehiculo vehiculo = new Vehiculo("AA123BB", "Peugeot 2008", motor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());

    }
}
