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
        Usuario usuario = new Usuario("Pablo Perez", "20100300");
        Bateria bateria = new Bateria("BAT1234", 5000);
        Celular celular = new Celular( "111112222233333", "Samsung", "S25", bateria);
        usuario.setCelular(celular);
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Batería: " + celular.getBateria().getModelo());
    }
    
}
