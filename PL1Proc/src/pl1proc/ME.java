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

    /**
     * @param args the command line arguments
     */
    private Integer estadoActual = 0;
    private AFD automata;
    private ArrayList<String> listaFinal = new ArrayList<>();
    
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
    
    public void inicializar(){
        estadoActual = automata.getEstadoInicial();
    }
    
    public boolean acepta(Character caracter) throws Exception{
        Integer estadotmp = automata.getSiguienteEstado(estadoActual, caracter);
        boolean verificar;
        if(estadotmp==-1){
            verificar = false;
            return verificar;
        }
        if (estadotmp!=null){
            estadoActual = estadotmp;
            verificar = true;
        }
        else throw new Exception("No existe un estado más.");
        
        return verificar;
    }
    
    public boolean isFinal(){
        return automata.isFinal(estadoActual);
    }
    
    public boolean compruebaCadena(String s){
        boolean result = false;
        inicializar();
        for (int i=0;i<s.length();i++){
            
            try{
                
                if(!acepta(s.charAt(i))){
                    throw new Exception("Error");
                }else{
                    if (i == s.length()-1){
                        if (this.isFinal()) result = true;
                    }
                }
                
            } catch (Exception e){}
        }
        return result;
    }
    
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
            
        } catch (Exception ex){}
        return listaFinal;
    }
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
                        if(cadena.length()<=6){
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



    public void getListaFinal() {
       File f;
       f = new File("ResultadosPL1.txt");
       try{
            BufferedWriter outputWriter;
            outputWriter = new BufferedWriter(new FileWriter(f));
            for(int i = 0;i<listaFinal.size();i++){
                outputWriter.write(i+"- \""+listaFinal.get(i)+"\"");
                outputWriter.newLine();
            }
            System.out.println(listaFinal);
            outputWriter.close();
       }catch(IOException e){}
    }

    
    
    public AFD getAutomata() {
        return automata;
    }
    
}

//Te puede pedir para un numero maximo de caracteres o para unas cifras limitadas
