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
 * @author Taiyou
 */
public class PL1Proc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here aaaaaaa
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numEstados = 0;
        int numCaracteres = 0;
        
        System.out.println("Cuantos estados tiene el automata? (Contando el inicial q0)");
        numEstados = Integer.parseInt(br.readLine());
        System.out.println("Cuantos caracteres tiene el alfabeto?");
        numCaracteres = Integer.parseInt(br.readLine());
        String matriz[][] = new String[numEstados][numCaracteres];
        
        
        for(int i=0;i<numEstados-1;i++){
            for(int j = 0;i<numCaracteres;j++){
                System.out.println("Introduzca el estado de la columna " +j+ " y de la fila " + i);
                matriz[i][j] = br.readLine();
            }
        }
    }
    
}
