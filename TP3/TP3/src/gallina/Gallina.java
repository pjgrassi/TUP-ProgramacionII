
package gallina;


public class Gallina {
    private String gallinaId;
    private int edad;
    private int huevosPuestos;

    public String getGallinaId() {
        return gallinaId;
    }

    public void setGallinaId(String gallinaId) {
        this.gallinaId = gallinaId;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    //Metodos adicionales poner huevos, envejecer y mostrar estado
    
    public void ponerHuevos(){
        this.huevosPuestos += 1;
    }
    
    public void envejecer(){
        this.edad += 1;
    }
    
    public void mostrarEstado(){
        System.out.println("ID Gallina: "+this.gallinaId+", "+"Edad: "+this.edad+", "+"Huevos puestos: "+this.huevosPuestos);
    }
    
}
