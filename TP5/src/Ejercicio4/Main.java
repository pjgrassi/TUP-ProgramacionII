/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pablo Perez", "20100200");
        Banco banco = new Banco("Banco Nación", "30-99888777-6");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "11/28", banco);
        cliente.setTarjeta(tarjeta);
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());

    }
    
}
