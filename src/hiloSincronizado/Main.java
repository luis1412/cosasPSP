/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiloSincronizado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Usuario
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        int contadorCaracteres = 0;
        String nombreFichero = args[0];
        File ficheroLeer = new File(nombreFichero);
        
        String a;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(ficheroLeer));
            while ((a = bf.readLine()) != null) {                
               char[] array = a.toCharArray();
               contadorCaracteres += array.length;
            }
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("El numero de caracteres del archivo " + nombreFichero + "es: " + contadorCaracteres);
        
            
            
    }
}
