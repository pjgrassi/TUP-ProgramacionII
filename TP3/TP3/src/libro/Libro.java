
package libro;


public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion > 0 && anioPublicacion <= 2025)
            this.anioPublicacion = anioPublicacion;
        else {
            System.out.println("El año no fue actualizado.");
        }
    }
    
    //Mostrar datos libro
    public void mostrarDatos(){
        System.out.println("Titulo: "+this.titulo+"\nAutor: "+this.autor+"\nAño publicacion: "+this.anioPublicacion);
    }
    
   
    
}
