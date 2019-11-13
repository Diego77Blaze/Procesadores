parser grammar GramaticacompilerParser;

options{
    tokenVocab = GramaticacompilerLexer;
    language = Java;
}


prog: (include|expr|asignacion|crearfuncion)+ ;  
include: (keywordinclude nomlib (punto nomlib)* puntocoma)+;
asignacion: tipo? nombrevariable asignador expr puntocoma?;
variable: tipo? nombrevariable asignador expr;
funcionwhile: keywordwhile abrirparentesis exprlog cerrarparentesis func;
funcionfor: keywordfor abrirparentesis (variable|nombrevariable) (puntocoma exprlog) (puntocoma variable|nombrevariable (add1|substract1)) cerrarparentesis func;
funcionswitch: keywordswitch abrirparentesis expr cerrarparentesis cuerposwitch;
cuerposwitch: (keywordcase expr dospuntos codigo+ keywordbreak? puntocoma)+ (keyworddefault dospuntos expr+ keywordbreak)?;
condicionales: keywordcond abrirparentesis exprlog cerrarparentesis func;
numeros: entero | flotante;
devolver: keywordreturn abrirparentesis (expr|llamarfuncion)? cerrarparentesis puntocoma;
codigo: (asignacion|llamarfuncion|funcionwhile|funcionfor|funcionswitch);
func: keywordbegin (codigo )* devolver? keywordend;
cabecerafuncion: keywordfunc (nombrefuncion|keywordmain) abrirparentesis (tipo expr (coma tipo expr)*)? cerrarparentesis dospuntos tiporetorno ;
tiporetorno: tipo;
crearfuncion: cabecerafuncion func;
llamarfuncion: (nombrefuncion abrirparentesis parametros cerrarparentesis puntocoma? | funcionfor | funcionwhile);
parametros: expr (coma expr)*;
expr:   expr (opdiv|opmult) expr 
    |   expr (opsuma|opresta) expr
    |   llamarfuncion
    |   nombrevariable 
    |   cadena (opsuma expr)*
    |   numeros
    |   abrirparentesis expr cerrarparentesis
    ;
exprlog: expr oplog expr;  


tipo: TIPONUMERO|TIPOCADENA|TIPOVOID;
asignador: ASIGNACION;
entero: DIGITO+;
flotante:  DIGITO+ PUNTO DIGITO+
    |   PUNTO DIGITO+
    ;
nombrevariable: ID;
nombrefuncion: ID;
nomlib: ID;
punto: PUNTO;
puntocoma: PC;
coma: COMA;
dospuntos: DOSPUNTOS;
abrirparentesis: PI;
cerrarparentesis: PD;
add1: ADD1;
substract1: SUBSTRACT1;
cadena: CADENA;
opsuma: ADD;
opresta:MINUS;
opmult:PRODUCT;
opdiv:DIVISION;
oplog:(MENORQUE|MAYORQUE|IGUALQUE|DISTINTOQUE);


//keywords falta condiciones
keywordinclude: INCLUDE;
keywordwhile: WHILE;
keywordfor: FOR;
keywordcond: CONDICIONES;
keywordmain: MAIN;
keywordfunc: FUNCTION;
keywordreturn: DEVOLVER;
keywordbegin: BEGIN;
keywordend: END;
keywordswitch: SWITCH;
keywordcase: CASE;
keywordbreak: BREAK;
keyworddefault: DEFAULT;
keywordendswitch: ENDSWITCH;    
