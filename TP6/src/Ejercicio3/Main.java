/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Personal
 */
public class Main {

    public static void main(String[] args) {

        Universidad uni = new Universidad("UTN");

        // 1. Crear profesores
        Profesor p1 = new Profesor("P1", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P2", "Carlos Pérez", "Programación");
        Profesor p3 = new Profesor("P3", "María García", "Física");

        // 2. Crear cursos
        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Análisis Matemático");
        Curso c3 = new Curso("C201", "Java Inicial");
        Curso c4 = new Curso("C202", "Estructuras de Datos");
        Curso c5 = new Curso("C301", "Física I");

        // Agregar todo a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P1");
        uni.asignarProfesorACurso("C201", "P2");
        uni.asignarProfesorACurso("C202", "P2");
        uni.asignarProfesorACurso("C301", "P3");

        // 4. Listados
        System.out.println("=== CURSOS ===");
        uni.listarCursos();

        System.out.println("=== PROFESORES ===");
        uni.listarProfesores();

        // 5. Cambiar profesor de un curso
        System.out.println("=== CAMBIAR PROFESOR DE C202 ===");
        uni.asignarProfesorACurso("C202", "P3"); // de P2 pasa a P3

        uni.listarCursos();
        uni.listarProfesores();

        // 6. Remover un curso
        System.out.println("=== ELIMINAR CURSO C101 ===");
        uni.eliminarCurso("C101");

        uni.listarProfesores();
        uni.listarCursos();

        // 7. Remover profesor
        System.out.println("=== ELIMINAR PROFESOR P2 ===");
        uni.eliminarProfesor("P2");

        uni.listarCursos();

        // 8. Reporte
        uni.reporteCursosPorProfesor();
    }
}

