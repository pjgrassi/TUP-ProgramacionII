/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Andres Garcia", "21222333");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("27-10-2025", "21:00", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());

    }

}
