
package modarray;

import java.util.Scanner;

public class ModArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declarar e inicializar el array con precios
        double[] precios = { 199.99, 299.5, 149.75, 399.0, 89.99 };

        //Mostrar los valores originales
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }

        //Modificar el precio de un producto específico
        System.out.print("Se modifican precios origianles");
        precios[2] = 129.99;

        //Mostrar los valores modificados
        System.out.println("Precios modificados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }

    }
    
}
