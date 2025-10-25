/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Autor autor = new Autor("Jose Hernandez", "Argentina");
        Editorial editorial = new Editorial("Ediciones Leo", "Calle Falsa 123");
        Libro libro = new Libro("Martin Fierro", "9780585091747", editorial);
        libro.setAutor(autor);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());

    }

}
