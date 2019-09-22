/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author diego
 */
public class AFD {
    List<Character> alfabeto;
    List<Integer> estados;
    Integer estadoInicial = 0;
    List<Integer> estadosFinales;
    HashMap<Integer,HashMap<Character,Integer>> matriz = new HashMap<>();
    
    public void cargarAlfabeto(){
        alfabeto.add('a');
        alfabeto.add('b');
        alfabeto.add('c');
        alfabeto.add('d');
        alfabeto.add('e');
    }
    
    public void cargarEstados(){
        for (int i=0;i<18;i++){
            estados.add(i);
        }
    }
    
    public void establecerQi(Integer est){
        estadoInicial = est;
    }
    
    public void establecerQf(List<Integer> ests){
        estadosFinales.add(5);
    }
    
    
    
    
    
}
