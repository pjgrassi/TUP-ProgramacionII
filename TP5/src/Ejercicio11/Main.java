/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Artista artista = new Artista("Britney Spears", "Pop");
        Cancion cancion = new Cancion("Baby one more time", artista);
        Reproductor r = new Reproductor();
        r.reproducir(cancion); // Dependencia de uso

    }
}
