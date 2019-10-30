parser grammar GramaticacompilerParser;

options{
    tokenVocab = GramaticacompilerLexer;
    language = Java;
} 


prog: (NEWLINE* (include|expr|asignacion|crearfuncion|comentarios) NEWLINE)+ ;  
include: (INCLUDE nomlib (PUNTO nomlib)* PC NEWLINE*)*;
asignacion: tipo? nombrevariable ASIGNACION expr PC? NEWLINE*;
variable: tipo? ID ASIGNACION expr;
tipo: TIPONUMERO|TIPOCADENA|TIPOVOID;
funcionwhile: WHILE PI exprlog PD NEWLINE+ func;
funcionfor: FOR PI (variable|ID) (ASIGNACION exprlog) (ASIGNACION variable|ID ((ADD ADD)|(MINUS MINUS))) PD NEWLINE+ func;
numeros: entero | flotante;
entero: DIGITO+;
flotante:  DIGITO+ PUNTO DIGITO+
    |   PUNTO DIGITO+
    ;
devolver: DEVOLVER PI (expr|llamarfuncion)? PD PC NEWLINE*;
codigo: (asignacion|llamarfuncion|funcionwhile|funcionfor);
func: BEGIN NEWLINE+ (codigo NEWLINE?)* devolver? END NEWLINE*;
nombrevariable: ID;
nombrefuncion: ID;
nomlib: ID;
cabecerafuncion: FUNCTION nombrefuncion PI (tipo expr (COMA tipo expr)*)? PD DOSPUNTOS tipo NEWLINE*;
crearfuncion: cabecerafuncion func;
llamarfuncion: (nombrefuncion PI expr (COMA expr)* PD PC? NEWLINE* | funcionfor | funcionwhile);
parametro: expr;
expr:   expr (PRODUCT|DIVISION) expr
    |   expr (ADD|MINUS) expr
    |   llamarfuncion
    |   nombrevariable NEWLINE*
    |   CADENA NEWLINE* (ADD expr)*
    |   numeros NEWLINE*
    |   PI expr PD
    ;
exprlog: expr (MENORQUE|MAYORQUE|IGUALQUE|DISTINTOQUE) expr;
comentarios:    COMENTARIO_LINEA
            |   COMENTARIO_BLOQUE1
            |   COMENTARIO_BLOQUE2
            |   COMENTARIO_LINEA2
            ;