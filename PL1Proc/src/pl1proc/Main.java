/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author diego
 */
public class Main {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ME maquinaEstados = new ME();
        
        
        boolean resultado = maquinaEstados.compruebaCadena("abcdedee");
        if (resultado) System.out.println("La cadena es valida para esta expresion regular");
        else System.out.println("La cadena no es valida para esta expresion regular");
        
    }
    
}
