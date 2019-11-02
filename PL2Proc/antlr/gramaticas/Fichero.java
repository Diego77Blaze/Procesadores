import java.util.*;
import java.io.Serializable;


public class Fichero implements Serializable{
    private static Fichero instancia;
    private List<String> solucion;

    //Dato temporal
    private ArrayList<String> datosActuales;

    public static Fichero getInstancia(){
        if(instancia == null){
            instancia = new Fichero();
        }
        return instancia;
    }

    public Fichero(){
        this.solucion = new ArrayList<String>();
        this.datosActuales = new ArrayList<String>();
    }

    public void introducirDatoActual(String datoActual){
        ArrayList<String> elementosFichero = new ArrayList<String>();
        elementosFichero.addAll(solucion);
        this.datosActuales.add(datoActual);
        elementosFichero.add(generarString(datosActuales));
        solucion = elementosFichero;
    }

    private String generarString(ArrayList<String> elementosActuales){
        String elementosconcatenados = "";
        for(String elemento: elementosActuales){
            elementosconcatenados += "/" + elemento;
        }
        return elementosconcatenados;
    }
    
    public List<String> getSolucion(){
        return solucion;
    }

    public void setSolucion(List<String> solucion){ 
        this.solucion = solucion;
    }

    public String getUltimoElemento()
    {
        String ultimoDato = "";
        if(datosActuales.size() != 0)
        {
            ultimoDato = datosActuales.get(datosActuales.size()-1);
        }
        return ultimoDato;
    }

    public void eliminarUltimoElemento(){
        if(datosActuales.size() != 0){
            datosActuales.remove(datosActuales.size()-1);
        }
    }
    

}