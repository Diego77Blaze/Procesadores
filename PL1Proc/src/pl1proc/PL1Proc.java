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
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numEstados = 0;
        
        System.out.println("Cuantos estados tiene la matriz? (Contando el inicial q0)");
        numEstados = Integer.parseInt(br.readLine());
    }
    
}
