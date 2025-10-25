/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author rigon
 */
public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan Pérez", "20333444");
        Bateria bateria = new Bateria("BAT1050", 4000);
        Celular celular = new Celular("Samsung", "S25", "100002000030000", bateria);
        usuario.setCelular(celular);
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Batería: " + celular.getBateria().getModelo());
    }
    
}
