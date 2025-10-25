/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Conductor conductor = new Conductor("Maria Juarez", "L123456");
        Motor motor = new Motor("Nafta", "M112233");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Renault Kwid", motor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());

    }

}
