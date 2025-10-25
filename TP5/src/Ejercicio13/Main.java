/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Usuario user = new Usuario("Carlos Juarez", "cjuarez@gmail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("ABC-123", user); // dependencia de creación

    }
}
