/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Personal
 */
public class Auto extends Vehiculo { // Extendemos de la clase vehiculo
    private int cantidadDePuertas;

    // Se crea el constructor llamando al de la clase padre
    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Modelo: " + this.modelo + " ,marca: " + this.marca + ", cantidad de puertas: " + cantidadDePuertas);
    }
    
}

