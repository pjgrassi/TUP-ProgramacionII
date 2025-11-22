/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Usuario user = new Usuario("Pablo Perez", "pperez@gmail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("COD-123", user);

    }
}
