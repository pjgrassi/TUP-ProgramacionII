/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Juan Gomez", "20555666");
        Computadora pc = new Computadora("LENOVO", "SN123456", "LOQ", "A555");
        propietario.setComputadora(pc);

        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());

    }

}
