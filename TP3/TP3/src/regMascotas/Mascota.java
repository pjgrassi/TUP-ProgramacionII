
package regMascotas;


public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    //Getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: "+this.nombre+"\nEspecie: "+this.especie+"\nEdad: "+this.edad);
    }
    
    public void cumplirAnios(){
        this.edad+=1;
    }
    
}
