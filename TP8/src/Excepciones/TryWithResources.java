/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Personal
 */
public class TryWithResources {
    
    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\Personal\\OneDrive\\Documentos\\GitHub\\TUP-ProgramacionII\\TP8\\src\\Excepciones\\ArchivoALeer.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            System.out.println(br.readLine());  
        } catch(IOException ex) {
            System.out.println("Error de E/S: "+ ex.getMessage());
        } 
    }
    
}
