/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        // Array vacio de animales
        ArrayList<Animal> animales = new ArrayList<>();

        Perro p1 = new Perro();
        Gato g1 = new Gato();
        Vaca v1 = new Vaca();

        animales.add(p1);
        animales.add(g1);
        animales.add(v1);

        for (Animal a : animales) {
            a.hacerSonido();
        }

    }
}
