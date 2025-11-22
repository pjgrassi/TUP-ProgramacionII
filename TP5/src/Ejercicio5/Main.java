/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Pablo Perez", "20100200");
        Computadora pc = new Computadora("LENOVO", "SN123456", "LOQ", "CHPS1234");
        propietario.setComputadora(pc);

        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());

    }
    
}
