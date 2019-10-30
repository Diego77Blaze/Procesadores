import java.util.*;

public class Fichero {
    private static Fichero instancia;
    private List<String> tramosrama;

    //Nombres de los campos
    //List<String> nombreCampos;

    //Dato temporal a estudiar
    private ArrayList<String> datosActuales;

    public static Fichero getInstancia(){
        if(instancia == null){
            instancia = new Fichero();
        }
        return instancia;
    }

    public Fichero(){
        this.tramosrama = new ArrayList<String>();
        this.datosActuales = new ArrayList<String>();
    }

    public void introducirDatoActual(String datoActual){
        ArrayList<String> elementosFichero = (ArrayList) tramosrama;
        this.datosActuales.add(datoActual);
        elementosFichero.add(generarString(datosActuales));
    }

    private String generarString(ArrayList<String> elementosActuales){
        String elementosconcatenados = "";
        for(String elemento: elementosActuales){
            elementosconcatenados += "/" + elemento;
        }
        return elementosconcatenados;
    }

    public void eliminarUltimoElementoAñadido(){
        if(datosActuales.size() != 0){
            datosActuales.remove(datosActuales.size()-1);
        }
    }

    public List<String> getTramosrama() {
        return tramosrama;
    }

    public void setTramosrama(List<String> tramosrama) {
        this.tramosrama = tramosrama;
    }

    

}