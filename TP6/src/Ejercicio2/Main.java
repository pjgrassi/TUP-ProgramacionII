/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {

        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A2", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A3", "Julio Verne", "Francesa");

        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "El coronel no tiene quién le escriba", 1961, a1);
        biblioteca.agregarLibro("ISBN003", "Ficciones", 1944, a2);
        biblioteca.agregarLibro("ISBN004", "El Aleph", 1949, a2);
        biblioteca.agregarLibro("ISBN005", "Viaje al centro de la Tierra", 1864, a3);

        // 4. Listar todos los libros
        System.out.println("=== LISTA COMPLETA DE LIBROS ===");
        biblioteca.listarLibros();

        // 5. Buscar un libro por ISBN
        System.out.println("=== BUSCAR ISBN 'ISBN003' ===");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 6. Filtrar libros por año
        System.out.println("=== LIBROS PUBLICADOS EN 1944 ===");
        for (Libro l : biblioteca.filtrarLibrosPorAnio(1944)) {
            l.mostrarInfo();
        }

        // 7. Eliminar un libro
        System.out.println("=== ELIMINAR LIBRO ISBN002 ===");
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // 8. Mostrar cantidad de libros
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar autores disponibles
        System.out.println("=== AUTORES EN LA BIBLIOTECA ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}

