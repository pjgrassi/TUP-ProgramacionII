
package libro;

import java.util.Scanner;

public class libroMain {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro l = new Libro();
        
        l.setTitulo("Don Quijote de la Mancha");
        l.setAutor("Miguel de Cervantes");
        l.setAnioPublicacion(1605);
        
        l.mostrarDatos();
        System.out.println("Ingrese un nuevo año de publicacion para el libro: ");
        l.setAnioPublicacion(sc.nextInt());
        l.mostrarDatos();
    }
    
}
