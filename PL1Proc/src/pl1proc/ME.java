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
    AFD automata = new AFD();
    
    public void Inicializar(){
        estadoActual = automata.getEstadoInicial();
    }
    
    public void acepta(Character caracter) throws Exception{
        Integer estadotmp = automata.getSiguienteEstado(estadoActual, caracter);
        if (estadotmp!=null) estadoActual = estadotmp;
        else throw new Exception("Algo malo ha pasado.");
    }
    
    public boolean isFinal(){
        return automata.isFinal(estadoActual);
    }
    
    public boolean compruebaCadena(String s){
        Inicializar();
        for (int i=0;i<s.length();i++){
            try{
                
                this.acepta(s.charAt(i));
                if (i == s.length()-1){
                    if (this.isFinal()) return true; //HACERLO SÓLO PARA EL FINAL DE TODOS
                } 
            } catch (Exception e){}
        }
        return false;
    }
    
}
