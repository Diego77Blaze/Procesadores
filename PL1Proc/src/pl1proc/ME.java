/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

import java.util.ArrayList;

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
    
public ArrayList formarCadenas() {
        String cadenatmp="",cadenafinal="";
        ArrayList<String> soluciones=new ArrayList<>();
        int i,j;
        inicializar();
        try {
            for (i=0;i<automata.getCaracteresUsados().size()+1;i++){
                if(soluciones.size()!=5){
                    for(j=0;j<automata.getCaracteresUsados().size();j++){
                        if(i>j){
                            if(automata.getCaracteresUsados().get(j)!=null){
                                if(acepta(automata.getCaracteresUsados().get(j))){                    
                                    i=j;
                                    cadenatmp=cadenatmp + automata.getCaracteresUsados().get(i).toString();
                                }
                            }
                        }
                    }
                    if(acepta(automata.getCaracteresUsados().get(i))){
                        cadenatmp=cadenatmp + automata.getCaracteresUsados().get(i).toString();
                        //if(checkString(cadenatmp)){cadenafinal=cadenatmp;}
                    }
                    if (compruebaCadena(cadenatmp)){
                        if(!soluciones.contains(cadenatmp)){
                            soluciones.add(cadenatmp);
                        }
                }
                }
            }
            automata.getCaracteresUsados().add(automata.getCaracteresUsados().get(0));
            automata.getCaracteresUsados().remove(0);
            
        } catch (Exception ex){}
        return soluciones;
    }

    public AFD getAutomata() {
        return automata;
    }
    
}

//Te puede pedir para un numero maximo de caracteres o para unas cifras limitadas
