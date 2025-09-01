/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intdouble;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class IntDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero entero: ");
        int a=sc.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int b=sc.nextInt();
        int divisionint=a/b;
        System.out.println("El resultado en entero es: "+divisionint);
        double divisiondo=(double)a/b;
        System.out.println("El resultado en double es: "+divisiondo);
        
    }
    
}
