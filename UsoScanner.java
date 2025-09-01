/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usoscanner;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class UsoScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Cuál es tu edad: ");
        int edad=sc.nextInt();
        
        System.out.println("Mi nombre es "+nombre+" y tengo "+edad+" años.");
    }
    
}
