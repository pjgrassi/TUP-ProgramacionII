
package arrayrecursivo;


public class ArrayRecursivo {

    public static void main(String[] args) {
        //Declarar e inicializar el array con precios
        double[] precios = { 199.99, 299.5, 149.75, 399.0, 89.99 };

        //Mostrar precios originales usando recursión
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        //Modificar el precio de un producto específico (ej: producto 3)
        precios[2] = 129.99;

        //Mostrar precios modificados usando recursión
        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios, 0);
    }
    
    // Función recursiva para imprimir precios
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("Producto " + (indice + 1) + ": $" + precios[indice]);
        mostrarPrecios(precios, indice + 1);
    }

   
}
