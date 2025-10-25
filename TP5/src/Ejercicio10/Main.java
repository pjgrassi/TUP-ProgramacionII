/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Titular titular = new Titular("Hugo Gauna", "25666777");
        ClaveSeguridad cs = new ClaveSeguridad("abc123", "01-07-2025");
        CuentaBancaria cuenta = new CuentaBancaria("1111111122222222", 150000.0, "abc123", "01-07-2025");
        titular.setCuenta(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());

    }
}
