
package calcudescuento;

import java.util.Scanner;

public class CalcuDescuento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se solicita datos del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la categoría (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0);

        double descuento = 0;

        // Opciones de descuento por categoria
        switch (categoria) {
            case 'A':
                descuento = 0.10;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }

        // Calculo de precio con descuento
        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;

        // Resultado
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);
           
    }
    
}
