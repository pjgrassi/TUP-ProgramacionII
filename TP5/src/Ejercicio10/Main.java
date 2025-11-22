/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Titular titular = new Titular("Pablo Perez", "20100200");
        ClaveSeguridad cs = new ClaveSeguridad("Pablo123", "01-10-2025");
        CuentaBancaria cuenta = new CuentaBancaria("111112222233333", 100000.0, "Pablo123", "01-10-2025");
        titular.setCuenta(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());

    }
}
