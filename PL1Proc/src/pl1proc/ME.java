/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.util.ArrayList;
import java.io.*;

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
        automata.setCaracteresUsados();
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
        if(estadotmp==-1){
            return false;
        }
        if (estadotmp!=null){
            estadoActual = estadotmp;
            return true;
        }
        else throw new Exception("No existe un estado más.");
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
     * Formar Cadenas con límite de resultados
     * @return la lista final con los resultados
     */
    public ArrayList formarCadenasResultados() {
        String cadena="";
        ArrayList<String> soluciones=new ArrayList<>();
        int i,j;
        inicializar();
        try {
            for (i=0;i<automata.getCaracteresUsados().size()+1;i++){
                if(listaFinal.size()<5){
                    for(j=0;j<automata.getCaracteresUsados().size();j++){
                        if(i>j){
                            if(automata.getCaracteresUsados().get(j)!=null){
                                if(acepta(automata.getCaracteresUsados().get(j))){
                                    i=j;
                                    cadena=cadena + automata.getCaracteresUsados().get(i).toString();
                                }
                            }
                        }
                    }
                    if(acepta(automata.getCaracteresUsados().get(i))){
                        cadena=cadena + automata.getCaracteresUsados().get(i).toString();
                    }
                    if (compruebaCadena(cadena)){
                        if(!soluciones.contains(cadena)){
                            soluciones.add(cadena);
                            if(!listaFinal.contains(cadena)){
                                listaFinal.add(cadena);
                            }
                        }
                    }
                }
            }
            automata.getCaracteresUsados().add(automata.getCaracteresUsados().get(0));
            automata.getCaracteresUsados().remove(0);
            }catch (Exception ex){}
        return listaFinal;
    }
    /**
     * Formar Cadenas con límite de resultados y limite de caracteres
     * @return la lista final con los resultados
     */
    public ArrayList formarCadenasCyR() {
        String cadena="";
        ArrayList<String> soluciones=new ArrayList<>();
        int i,j;
        inicializar();
        try {
            for (i=0;i<automata.getCaracteresUsados().size()+1;i++){
                if(listaFinal.size()<5){
                    for(j=0;j<automata.getCaracteresUsados().size();j++){
                        if(i>j){
                            if(automata.getCaracteresUsados().get(j)!=null){
                                if(acepta(automata.getCaracteresUsados().get(j))){                    
                                    i=j;
                                    cadena=cadena + automata.getCaracteresUsados().get(i).toString();
                                }
                            }
                        }
                    }
                    if(acepta(automata.getCaracteresUsados().get(i))){
                        cadena=cadena + automata.getCaracteresUsados().get(i).toString();
                    }
                    if (compruebaCadena(cadena)){
                        if(cadena.length()<=3){
                            if(!soluciones.contains(cadena)){
                                soluciones.add(cadena);
                                if(!listaFinal.contains(cadena)){
                                    listaFinal.add(cadena);
                                }
                            }
                        }
                        else{
                            automata.getCaracteresUsados().add(automata.getCaracteresUsados().get(0));
                            automata.getCaracteresUsados().remove(0);
                            return listaFinal;
                        }
                    }
                }
            }
            automata.getCaracteresUsados().add(automata.getCaracteresUsados().get(0));
            automata.getCaracteresUsados().remove(0);
        } catch (Exception ex){}
        return listaFinal;
    }
    /**
     * Formar Cadenas con límite de caracteres
     * @return la lista final con los resultados
     */
    public ArrayList formarCadenasCaracteres() {
        String cadena="";
        ArrayList<String> soluciones=new ArrayList<>();
        int i,j;
        inicializar();
        try {
            for (i=0;i<automata.getCaracteresUsados().size()+1;i++){
                for(j=0;j<automata.getCaracteresUsados().size();j++){
                    if(i>j){
                        if(automata.getCaracteresUsados().get(j)!=null){
                            if(acepta(automata.getCaracteresUsados().get(j))){                    
                                i=j;
                                cadena=cadena + automata.getCaracteresUsados().get(i).toString();
                            }
                        }
                    }
                }
                if(acepta(automata.getCaracteresUsados().get(i))){
                    cadena=cadena + automata.getCaracteresUsados().get(i).toString();
                }
                if (compruebaCadena(cadena)){
                    if(cadena.length()<=120){
                        if(!soluciones.contains(cadena)){
                            soluciones.add(cadena);
                            if(!listaFinal.contains(cadena)){
                                listaFinal.add(cadena);
                            }
                        }
                    }
                    else{
                        automata.getCaracteresUsados().add(automata.getCaracteresUsados().get(0));
                        automata.getCaracteresUsados().remove(0);
                        return listaFinal;
                    }
                }
            }
            automata.getCaracteresUsados().add(automata.getCaracteresUsados().get(0));
            automata.getCaracteresUsados().remove(0);
        } catch (Exception ex){}
        return listaFinal;
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
                outputWriter.write(i+"- \""+listaFinal.get(i)+"\"");
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

//Te puede pedir para un numero maximo de caracteres o para unas cifras limitadas
