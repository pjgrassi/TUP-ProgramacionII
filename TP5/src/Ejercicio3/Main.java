/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Autor autor = new Autor("Jose Hernandez", "Argentina");
        Editorial editorial = new Editorial("Ediciones Colihue", "Calle 1234");
        Libro libro = new Libro("Martin Fierro", "978-950-563-115-5.", editorial);
        libro.setAutor(autor);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());

    }
}
