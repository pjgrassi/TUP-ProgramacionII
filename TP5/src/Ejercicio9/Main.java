/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author rigon
 */
public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Laura Gimenez", "SWISSMEDICAL");
        Profesional profesional = new Profesional("Dr. Cesar Serra", "Cardiología");
        CitaMedica cita = new CitaMedica("30-10-2025", "09:30");
        cita.setProfesional(profesional);
        cita.setPaciente(paciente);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());

    }
}
