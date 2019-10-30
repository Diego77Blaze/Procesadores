parser grammar GramaticacompilerParser;

options{
    tokenVocab = GramaticacompilerLexer;
    language = Java;
}


prog: (include|expr|asignacion|crearfuncion)+ ;  
include: (INCLUDE nomlib (PUNTO nomlib)* PC)+;
asignacion: tipo? nombrevariable ASIGNACION expr PC?;
variable: tipo? ID ASIGNACION expr;
tipo: TIPONUMERO|TIPOCADENA|TIPOVOID;
funcionwhile: WHILE PI exprlog PD func;
funcionfor: FOR PI (variable|ID) (ASIGNACION exprlog) (ASIGNACION variable|ID ((ADD ADD)|(MINUS MINUS))) PD func;
numeros: entero | flotante;
entero: DIGITO+;
flotante:  DIGITO+ PUNTO DIGITO+
    |   PUNTO DIGITO+
    ;
devolver: DEVOLVER PI (expr|llamarfuncion)? PD PC;
codigo: (asignacion|llamarfuncion|funcionwhile|funcionfor);
func: BEGIN (codigo )* devolver? END ;
nombrevariable: ID;
nombrefuncion: ID;
nomlib: ID;
cabecerafuncion: FUNCTION nombrefuncion PI (tipo expr (COMA tipo expr)*)? PD DOSPUNTOS tipo ;
crearfuncion: cabecerafuncion func;
llamarfuncion: (nombrefuncion PI expr (COMA expr)* PD PC? | funcionfor | funcionwhile);
parametro: expr;
expr:   expr (PRODUCT|DIVISION) expr
    |   expr (ADD|MINUS) expr
    |   llamarfuncion
    |   nombrevariable 
    |   CADENA (ADD expr)*
    |   numeros
    |   PI expr PD
    ;
exprlog: expr (MENORQUE|MAYORQUE|IGUALQUE|DISTINTOQUE) expr;