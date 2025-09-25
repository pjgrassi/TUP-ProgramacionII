
package validacionnota;

import java.util.Scanner;

public class ValidacionNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: la nota debe estar entre 0 y 10. Intente nuevamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente");

    }
    
}
