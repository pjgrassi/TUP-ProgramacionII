
package clasiedad;

import java.util.Scanner;

public class ClasiEdad {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 12) {
            System.out.println("Usted es un Niño.");
        } else if (edad <= 17) {
            System.out.println("Usted es un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Usted es un Adulto.");
        } else {
            System.out.println("Usted es un Adulto mayor.");
        }
    }
}
    

