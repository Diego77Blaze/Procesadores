/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Main {

    /** Main method
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ME maquinaEstados = new ME();
        ArrayList<String> cadenas = new ArrayList<>();
        
        //Ejercicio 1
        System.out.println("¿Cuantas cadenas deseas probar?");
        Integer numeroCadenas = Integer.parseInt(br.readLine());
        for (int i = 0; i<numeroCadenas;i++){
            System.out.println("Introduce la cadena numero " + i);
            cadenas.add(br.readLine());
        }
        
        //Ejercicio 2
        int initialSize = maquinaEstados.getAutomata().getCaracteresUsados().size();
        for(int i = 0; i<initialSize;i++){
            maquinaEstados.formarCadenasCaracteres();
            //maquinaEstados.formarCadenasResultados();
            //maquinaEstados.formarCadenasCyR();
        }
        maquinaEstados.resultadoEjercicio(cadenas);
            
            

    }
}
