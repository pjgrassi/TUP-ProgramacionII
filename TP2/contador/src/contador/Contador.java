
package contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        System.out.println("Ingrese 10 números enteros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

    }
    
}
