
package naveEspacial;


public class naveMain {

    
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        nave.setNombre("Falcon");
        nave.setCombustible(50);
        
        System.out.println("Estado inicial de la nave");
        nave.mostrarEstado();
        
        nave.despegar();
        nave.avanzar(40);
        System.out.println("Estado habiendo recorrido algunos km");
        nave.mostrarEstado();
        
        System.out.println("Iniciamos nuevo recorrido");
        nave.avanzar(30);
        nave.recargar(50);
        System.out.println("Estado luego de recargar combustible");
        nave.mostrarEstado();
        System.out.println("Ahora si nos vamos de viaje");
        nave.avanzar(30);
        System.out.println("Estado final de la nave");
        nave.mostrarEstado();
                
    }
    
}
