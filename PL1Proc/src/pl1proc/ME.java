/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.Set;

/**
 *
 * @author diego
 */
public class ME {
    
    private Integer estadoActual = 0;
    private AFD automata;
    private ArrayList<String> listaFinal = new ArrayList<>();
    
    /**
     * Constructor de la Matriz de Estados
     */
    public ME(){
        automata = new AFD();
        automata.cargarAlfabeto();
        automata.cargarEstados();
        automata.establecerQi(0);
        automata.establecerQf();
        automata.inicializacionMatriz();
        automata.cargarMatriz();
    }
    /**
     * Se establece el estado actual
     */
    public void inicializar(){
        estadoActual = automata.getEstadoInicial();
    }
    
    /**
     * Se comprueba si el caracter se acepta según la matriz de estados
     * @param caracter caracter que se comprueba en la matriz
     * @return si el caracter ha sido aceptado o no
     * @throws Exception 
     */
    public boolean acepta(Character caracter) throws Exception{
        Integer estadotmp = automata.getSiguienteEstado(estadoActual, caracter);
        if(estadotmp==null){
            return false;
        }
        else{
            estadoActual = estadotmp;
            return true;
        }
        //else throw new Exception("No existe un estado más.");
    }
    
    /**
     * Comprobación de si el caracter es el de un estado final
     * @return si el estado actual es final o no
     */
    public boolean isFinal(){
        return automata.isFinal(estadoActual);
    }
    
    /**
     * Comprobación de una cadena según una expresión regular
     * @param s cadena a probar en la ER
     * @return si la cadena es válida o no
     */
    public boolean compruebaCadena(String s){
        inicializar();
        try {
            for (int i = 0; i < s.length(); i++) {

                if (!this.acepta(s.charAt(i))) {
                    return false;
                }
            }
            if (this.isFinal()) {
                return true;
            }
        }catch (Exception e) {
            return false;
        }
        return false;
    }
    
    /**
     * Generador de cadenas válidas para la ER de la matriz, e introduce los resultados en la lista a imprimir, por limite de resultados y limite de caracteres.
     * @param cadActual cadena actual
     * @param estActual estado actual
     */
    public void generadorCadenasCyR(String cadActual, int estActual){
        int limResultados = 100;
        int limCaracteres = 10;
        
        if(cadActual.length()<=limCaracteres){
            int siguiente = automata.getSiguienteEstado(estActual, cadActual.charAt(cadActual.length()-1));
            Set <Character> letras = automata.getMatriz().get(siguiente).keySet();
            List<Character> lista = new ArrayList<>();
            lista.addAll(letras);
            if(!letras.isEmpty()){
                for(int i = 0;i<lista.size();i++){
                    generadorCadenasCyR(cadActual+lista.get(i), siguiente);
                }
            }
            if(automata.isFinal(siguiente) && listaFinal.size()<limResultados){
                listaFinal.add(cadActual);
            }
        }    
    }


    /**
     * Sacar resultados programa a un fichero.txt
     * @param cadenas cadenas a probar en la ER
     */
    public void resultadoEjercicio(ArrayList<String> cadenas) {
        
       File f;
       f = new File("ResultadosPL1.txt");
       try{
            BufferedWriter outputWriter;
            outputWriter = new BufferedWriter(new FileWriter(f));
            
            for (int i = 0; i<cadenas.size();i++){
            boolean resultado = compruebaCadena(cadenas.get(i));
            if (resultado) outputWriter.write("\""+cadenas.get(i)+"\" -->" + "Válida");
            else outputWriter.write("\""+cadenas.get(i)+"\" -->" + "No Válida");
            outputWriter.newLine();
        }
            
            for(int i = 0;i<listaFinal.size();i++){
                outputWriter.write(i+1+"- \""+listaFinal.get(i)+"\"");
                outputWriter.newLine();
            }
            outputWriter.close();
       }catch(IOException e){}
    }
   
    /**
     * Conseguir el automata
     * @return automata
     */
    public AFD getAutomata() {
        return automata;
    }
    
}
