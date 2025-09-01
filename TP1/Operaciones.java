/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

/**
 *
 * @author Personal
 */
import java.util.Scanner;
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero entero: ");
        int a=sc.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int b=sc.nextInt();
        int suma=a+b;
        int resta=a-b;
        int multi=a*b;
        double division=(double)a/b;
        
        System.out.println("La suma de "+a+" + "+b+" es igual a: "+suma);
        System.out.println("La resta de "+a+" - "+b+" es igual a: "+resta);
        System.out.println("La multiplicacion de "+a+" x "+b+" es igual a: "+multi);
        System.out.println("La division de "+a+" / "+b+" es igual a: "+division);
    }
    
}
