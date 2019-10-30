import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class ListenerBasico extends GramaticacompilerParserBaseListener{
    Fichero fichero = Fichero.getInstancia();

    @Override
    public void enterProg(GramaticacompilerParser.ProgContext ctx){
        fichero.introducirDatoActual("prog");
    }

    @Override public void exitProg(GramaticacompilerParser.ProgContext ctx){
        fichero.eliminarUltimoElementoAñadido();
    }

    @Override public void enterInclude(GramaticacompilerParser.IncludeContext ctx){
        fichero.introducirDatoActual("include");
    }

    @Override public void exitInclude(GramaticacompilerParser.LlamarfuncionContext ctx){
        fichero.eliminarUltimoElementoAñadido();
        //ctx.getParent().getRuleIndex();
    }
}