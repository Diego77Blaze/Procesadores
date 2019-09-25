/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.util.ArrayList;
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
    
   public AFD(){
       this.alfabeto = new ArrayList<>();
       this.estados = new ArrayList<>();
       this.estadosFinales = new ArrayList<>();
   }
    
    public void cargarAlfabeto(){
        alfabeto.add('a');
        alfabeto.add('b');
        alfabeto.add('c');
        alfabeto.add('d');
        alfabeto.add('e');
        alfabeto.add('f');
        alfabeto.add('g');
        alfabeto.add('h');
        alfabeto.add('i');
        alfabeto.add('j');
        alfabeto.add('k');
        alfabeto.add('l');
        alfabeto.add('m');
        alfabeto.add('n');
        alfabeto.add('ñ');
        alfabeto.add('o');
        alfabeto.add('p');
        alfabeto.add('q');
        alfabeto.add('r');
        alfabeto.add('s');
        alfabeto.add('t');
        alfabeto.add('u');
        alfabeto.add('v');
        alfabeto.add('w');
        alfabeto.add('x');
        alfabeto.add('y');
        alfabeto.add('z');
        alfabeto.add('0');
        alfabeto.add('1');
        alfabeto.add('2');
        alfabeto.add('3');
        alfabeto.add('4');
        alfabeto.add('5');
        alfabeto.add('6');
        alfabeto.add('7');
        alfabeto.add('8');
        alfabeto.add('9');
        alfabeto.add(' ');
    }
    
    public void cargarEstados(){
        for (int i=0;i<6;i++){
            estados.add(i);
        }
    }
    
    public void establecerQi(Integer est){
        estadoInicial = est;
    }
    
    public void establecerQf(){
        estadosFinales.add(3);
        estadosFinales.add(5);//ejemplo, hacen falta más
    }
    
    public void inicializacionMatriz(){
        for(int i = 0; i<estados.size();i++){
            matriz.put(estados.get(i), new HashMap<Character, Integer>());
        }
    }
    
    public void cargarMatriz(){
        matriz.get(0).put('a', 1);
        matriz.get(0).put('b', 2);
        matriz.get(1).put('b', 2);
        matriz.get(2).put('c', 3);
        matriz.get(3).put('d', 4);
        matriz.get(4).put('e', 5);
        matriz.get(5).put('d', 4);
    }
    
    public Integer getSiguienteEstado(Integer estado,Character caracter){
        return matriz.get(estado).get(caracter);
    }
    
    public boolean isFinal(Integer estado){
        return estadosFinales.contains(estado);
    }
    
    public Integer getEstadoInicial(){
        return estadoInicial;
    }
    
    
    
    
}
