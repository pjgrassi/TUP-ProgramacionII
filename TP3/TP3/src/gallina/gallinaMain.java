
package gallina;


public class gallinaMain {

   
    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        
        //Agregamos dos gallinas con sus datos
        g1.setGallinaId("G0001");
        g1.setEdad(1);
        g1.setHuevosPuestos(0);
        
        g2.setGallinaId("G0002");
        g2.setEdad(2);
        g2.setHuevosPuestos(0);
        
        //Mostramos estado inicial
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        //Modificamos estado y vemos el cambio 
        g1.envejecer();
        g1.ponerHuevos();
        g1.ponerHuevos();
        
        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevos();
        
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
    
}
