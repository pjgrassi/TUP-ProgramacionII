
package stock;

import java.util.Scanner;

public class Stock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Ingrese el stock actual: ");
        int stockActual = sc.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = sc.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = sc.nextInt();

        // Calcular nuevo stock
        int stockActualizado = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar resultado
        System.out.println("El stock actualizado es: " + stockActualizado);

    }
    // Método para actualizar el stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }

}
