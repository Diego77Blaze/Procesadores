import java.io.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Exe{
    public static void main(String[] args) throws Exception {
        String ficheroentrada = "PL2-fibonacci.prog";
        TablaSimbolos fichero = TablaSimbolos.getInstancia();

        InputStream is = System.in;
        if(ficheroentrada!=null){
            is = new FileInputStream(ficheroentrada);
        }
        CharStream input = CharStreams.fromStream(is);
        GramaticacompilerLexer lexer = new GramaticacompilerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramaticacompilerParser parser = new GramaticacompilerParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();

        //Listener para recorrer el arbol
        ListenerBasico LB = new ListenerBasico();
        ParseTreeWalker treewalker = new ParseTreeWalker(); 
        treewalker.walk(LB, tree);

        
        PrintWriter salida = new PrintWriter("ImprimirArbol.txt");
        List<String> fileinput = fichero.getSolucion();
        for(int i = 0; i < fileinput.size(); i++){
            salida.println(fileinput.get(i));
        }
        salida.flush();
        salida.close();
    }
}
