
package regMascotas;


public class regMascotas {

   
    public static void main(String[] args) {
        Mascota m = new Mascota();
        m.setNombre("Nina");
        m.setEspecie("Perra");
        m.setEdad(6);
        
        m.mostrarInfo();
        System.out.println("Cumple años!!!");
        m.cumplirAnios();
        m.mostrarInfo();
        System.out.println("Otro año mas!!!");
        m.cumplirAnios();
        m.mostrarInfo();
        
    }
    
}
