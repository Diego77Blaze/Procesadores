/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
        
        //Ejercicio 1
        
        ArrayList<String> cadenas = new ArrayList<>();
        System.out.println("¿Cuantas cadenas deseas probar?");
        Integer numeroCadenas = Integer.parseInt(br.readLine());
        for (int i = 0; i<numeroCadenas;i++){
            System.out.println("Introduce la cadena numero " + i);
            cadenas.add(br.readLine());
        }
        
        //Ejercicio 2
        Set <Character> inicial = maquinaEstados.getAutomata().getMatriz().get(maquinaEstados.getAutomata().getEstadoInicial()).keySet();
        List<Character> lista = new ArrayList<>();
        lista.addAll(inicial);
        for(int i2 = 0; i2<lista.size();i2++){
            maquinaEstados.generadorCadenasCyR(lista.get(i2).toString(),maquinaEstados.getAutomata().getEstadoInicial());
        }
        
        //Impresión de Resultados
        maquinaEstados.resultadoEjercicio(cadenas);
       
            

    }
}
