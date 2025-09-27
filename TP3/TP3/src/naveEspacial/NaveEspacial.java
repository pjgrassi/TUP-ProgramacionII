
package naveEspacial;


public class NaveEspacial {
    private String nombre;
    private int combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    //Metodos depegar, avanzar, recargar y mostrar estado
    
    public void despegar(){
        if(this.combustible > 0)
            System.out.println("La nave ha despegado..");
        else {
            System.out.println("Necesita recargar combustible");
        }
    }
    
    public void avanzar(int distancia){
        if(distancia <= this.combustible) // hace 1km por litro
            this.combustible = this.combustible - distancia;
        else {
            System.out.println("Necesita recargar combustible");
        }
    }
    
    public void recargar(int litros){
        this.combustible = this.combustible + litros;
    }
    
    public void mostrarEstado(){
        System.out.println("Nave "+this.nombre+"\nCombustible: "+this.combustible);
    }
}
