
package regEstudiantes;


public class regEstudiantes {

    
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.setNombre("Juan");
        e.setApellido("Perez");
        e.setCurso("Comision 12");
        e.setCalificacion(8.0);
        
        e.mostrarInfo();
        
        //Se sube calificacion
        e.subirCalificacion(2.0);
        e.mostrarInfo();
        e.bajarCalificacion(1.0);
        e.mostrarInfo();
    }
    
}
