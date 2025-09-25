
package descespecial;

import java.util.Scanner;

public class DescEspecial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar precio al usuario
        System.out.print("Ingrese el precio del producto: $");
        double precio = sc.nextDouble();

        // Llamar al método para calcular el descuento especial
        calcularDescuentoEspecial(precio);

    }
    
    // Variable global
    static double DESCUENTO = 0.10; // 10%

    // Método para calcular el descuento especial
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO;

        // Calcular precio final
        double precioFinal = precio - descuentoAplicado;

        // Mostrar resultados
        System.out.println("El descuento especial aplicado es: $" + descuentoAplicado);
        System.out.println("El precio final con descuento es: $" + precioFinal);
    }
}
