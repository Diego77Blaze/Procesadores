/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author diego
 */
public class AFD {
    private List<Character> alfabeto;
    private List<Integer> estados;
    private Integer estadoInicial = 0;
    private List<Integer> estadosFinales;
    private HashMap<Integer,HashMap<Character,Integer>> matriz = new HashMap<>();
    private ArrayList<Character> caracteresUsados=new ArrayList<>();
    /**
     * Constructor de la Matriz de Estados
     */
    public AFD(){
       this.alfabeto = new ArrayList<>();
       this.estados = new ArrayList<>();
       this.estadosFinales = new ArrayList<>();
    }
    /**
     * Método para cargar alfabeto
     */
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
    /**
     * Método para cargar los estados posibles
     */
    public void cargarEstados(){
        for (int i=0;i<6;i++){
            estados.add(i);
        }
    }
    /**
     * Método para establecer los estados iniciales
     * @param est estado inicial
     */
    public void establecerQi(Integer est){
        estadoInicial = est;
    }
    /**
     * Método para establecer los estados finales
     */
    public void establecerQf(){
        estadosFinales.add(3);
        estadosFinales.add(5);
    }
    /**
     * Método para inicializar la matriz
     */
    public void inicializacionMatriz(){
        estados.stream().forEach((estado) -> {
            matriz.put(estado, new HashMap<>());
        });
    }
    /**
     * Método para cargar los datos de la matriz 
     */
    public void cargarMatriz(){
        matriz.get(0).put('a', 1);
        matriz.get(0).put('b', 2);
        matriz.get(1).put('b', 2);
        matriz.get(2).put('c', 3);
        matriz.get(3).put('d', 4);
        matriz.get(4).put('e', 5);
        matriz.get(5).put('d', 4);
    }
    /**
     * Método para conseguir el estado que va a continuación del actual
     * @param estado estado actual
     * @param caracter caracter que nos dará el estado de salto
     * @return 
     */
    public Integer getSiguienteEstado(Integer estado,Character caracter){
        if(matriz.get(estado).get(caracter)!=null){
            return matriz.get(estado).get(caracter);
        }
        else return -1;
    }
    /**
     * Método para ver si un estado es final
     * @param estado estado a comprobar
     * @return 
     */
    public boolean isFinal(Integer estado){
        return estadosFinales.contains(estado);
    }
    /**
     * Método para conseguir el estado inicial
     * @return 
     */
    public Integer getEstadoInicial(){
        return estadoInicial;
    }
    /**
     * Método para conseguir los caracteres del alfabeto que se pueden usar según la ER
     */
    public void setCaracteresUsados(){
        Collection<Character> hashSet = new HashSet<>();
        for (int i = 0;i<estados.size();i++){
            hashSet.addAll(matriz.get(i).keySet());           
        }
        Iterator<Character> iterador = hashSet.iterator();
        while(iterador.hasNext()){
            caracteresUsados.add(iterador.next());
        }
    }
    /**
     * Método para conseguir una lista de los caracteres usados
     * @return la lista de caracteres usados
     */
    public ArrayList<Character> getCaracteresUsados(){
        return caracteresUsados;
    }
    
    
    
    
}
