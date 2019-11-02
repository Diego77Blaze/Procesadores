import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class ListenerBasico extends GramaticacompilerParserBaseListener{
    Fichero fichero = Fichero.getInstancia();

	@Override public void enterEveryRule(ParserRuleContext ctx){
		fichero.introducirDatoActual(GramaticacompilerParser.ruleNames[ctx.getRuleIndex()]);
	}
	@Override public void exitEveryRule(ParserRuleContext ctx){ 
		fichero.eliminarUltimoElemento();
	}
	@Override public void visitTerminal(TerminalNode node)
	{
		fichero.introducirDatoActual(fichero.getUltimoElemento() + ": " + node.getText());
		fichero.eliminarUltimoElemento();
	}
}