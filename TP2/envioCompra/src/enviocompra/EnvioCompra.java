
package enviocompra;

import java.util.Scanner;

public class EnvioCompra {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitar datos
        System.out.print("Ingrese el precio del producto: $");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = sc.nextDouble();
                
        System.out.print("Ingrese la zona de envío (Nacional / Internacional): ");
        String zona = sc.next();

        // Calcular costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Calcular total de la compra
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostrar resultados
        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("Total a pagar: $" + total);

    }
    
    //Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else {
            costoPorKg = 10.0;
        }

        return peso * costoPorKg;
    }

    //Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
