
package preciofinal;

import java.util.Scanner;

public class PrecioFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita datos de precios imp y desc
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuestoPorcentaje = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuentoPorcentaje = sc.nextDouble();

        // Pasa porcentaje a decimal
        double impuesto = impuestoPorcentaje / 100.0;
        double descuento = descuentoPorcentaje / 100.0;

        // Calculo precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Muestra precio final
        System.out.println("Precio final del producto: $" + precioFinal);

    }
    
    // Método para calcular el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    
}
