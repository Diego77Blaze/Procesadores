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

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ME maquinaEstados = new ME();
        ArrayList<String> cadenas = new ArrayList<>();
        Integer eleccion;
        System.out.println("Elija una opción:\n0)Salir\n1)Probar cadena segun una expresion regular\n2)Dar todas las posibles cadenas de texto de entradas válidas");
        eleccion = Integer.parseInt(br.readLine());
        while(eleccion!=0){
            if(eleccion==1){
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
                System.out.println("\nElija una opción:\n0)Salir\n1)Probar cadena segun una expresion regular\n2)Dar todas las posibles cadenas de texto de entradas válidas");
                eleccion = Integer.parseInt(br.readLine());
            }
            else if(eleccion==2){
                int initialSize = maquinaEstados.getAutomata().getCaracteresUsados().size();
                for(int i = 0; i<initialSize;i++){
                    maquinaEstados.formarCadenasCaracteres();
                    maquinaEstados.formarCadenasResultados();
                    maquinaEstados.formarCadenasCyR();
                }
                maquinaEstados.getListaFinal();
                
               System.out.println("\nElija una opción:\n0)Salir\n1)Probar cadena segun una expresion regular\n2)Dar todas las posibles cadenas de texto de entradas válidas");
               eleccion = Integer.parseInt(br.readLine()); 
            }
            else throw new Exception("Sólo existen tres opciones:\n0)Salir\n1)Probar cadena segun una expresion regular\n2)Dar todas las posibles cadenas de texto de entradas válidas");
        }

    }
}
