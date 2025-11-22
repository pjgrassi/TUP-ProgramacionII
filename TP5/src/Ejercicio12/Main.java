/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Pablo Perez", "23-20100200-9");
        Impuesto impuesto = new Impuesto(10000.0, contribuyente);
        Calculadora calcu = new Calculadora();
        calcu.calcular(impuesto);

    }
}
