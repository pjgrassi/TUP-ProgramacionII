/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Personal
 */
public class Main {
    
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Pablo Perez", "Sancor Salud");
        Profesional profesional = new Profesional("Dr. Luis Gonzalez", "Urologia");
        CitaMedica cita = new CitaMedica("01-12-2025", "09:00");
        cita.setProfesional(profesional);
        cita.setPaciente(paciente);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());

    }
}
