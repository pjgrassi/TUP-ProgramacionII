/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        // Array vacio de figuras
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Rectangulo r1 = new Rectangulo(5.0,  4.0, "Rectangulo 1");
        Rectangulo r2 = new Rectangulo(6.0,  5.0, "Rectangulo 2");
        Circulo c1 = new Circulo(12, "Circulo 1");
        Circulo c2 = new Circulo(15, "Circulo 2");
        
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(c1);
        figuras.add(c2);
        
        // Recorremos el array y llamamos al metodo calcular area en cada figura
        for(Figura f : figuras){
            f.calcularArea();
        }
        
    }
}
