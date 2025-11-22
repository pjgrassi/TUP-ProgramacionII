/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Pablo Perez", "pperez@gmail.com");
        Documento doc = new Documento("Contrato", "Escrito del contrato", "hash123", "01-01-2025", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario de la firma: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash de firma: " + doc.getFirma().getCodigoHash());

    }
    
}
