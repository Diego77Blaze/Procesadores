/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
        String cadena1 = "abcdede";
        String cadena2 = "abce";
        ArrayList<String> cadenas = new ArrayList<>();
        System.out.println("¿Cuantas cadenas deseas probar?");
        Integer numeroCadenas = Integer.parseInt(br.readLine());
        for (int i = 0; i<numeroCadenas;i++){
            System.out.println("Introduce la cadena numero " + i);
            cadenas.add(br.readLine());
        }
        for (int i = 0; i<numeroCadenas;i++){
            boolean resultado = maquinaEstados.compruebaCadena(cadenas.get(i));
            if (resultado) System.out.println("La cadena solicitada"+"["+cadenas.get(i)+"] " + "SI es valida para esta expresion regular");
            else System.out.println("La cadena"+"["+cadenas.get(i)+"] " + "NO es valida para esta expresion regular");
        }

    }
    
}
