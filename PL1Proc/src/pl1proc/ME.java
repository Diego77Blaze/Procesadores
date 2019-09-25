/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1proc;

/**
 *
 * @author diego
 */
public class ME {

    /**
     * @param args the command line arguments
     */
    Integer estadoActual = 0;
    AFD automata;
    
    public ME(){
        automata = new AFD();
        automata.cargarAlfabeto();
        automata.cargarEstados();
        automata.establecerQi(0);
        automata.establecerQf();
        automata.inicializacionMatriz();
        automata.cargarMatriz();
    }
    
    public void inicializar(){
        estadoActual = automata.getEstadoInicial();
    }
    
    public boolean acepta(Character caracter) throws Exception{
        Integer estadotmp = automata.getSiguienteEstado(estadoActual, caracter);
        boolean verificar;
        if (estadotmp!=null){
            estadoActual = estadotmp;
            verificar = true;
        }
        else throw new Exception("No existe un estado mas.");
        
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
                        if (this.isFinal()) result = true; //HACERLO SÓLO PARA EL FINAL DE TODOS
                    }
                }
                
            } catch (Exception e){}
        }
        return result;
    }
    
}

//Te puede pedir para un numero maximo de caracteres o para unas cifras limitadas
