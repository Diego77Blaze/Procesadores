grammar gramaticapei;

//axioma
prog: (NEWLINE* (include|expr|asignacion|crearfuncion|comentarios) NEWLINE)+ ;  
//asignacion
asignacion: tipo? ID ':=' expr ';'? NEWLINE*;
variable: tipo? ID ':=' expr;
//include
INCLUDE: 'include';
include: (INCLUDE ID ('.' ID)* ';' NEWLINE*)*;
//reservadas
FUNCTION: 'function';
TIPONUMERO: 'numero';
TIPOCADENA: 'cadena';
TIPOVOID: 'void';
tipo: TIPONUMERO|TIPOCADENA|TIPOVOID;
BEGIN: 'begin';
END: 'end';
PORCENTAJE: '%';
DEVOLVER: 'devolver';

//while
WHILE: 'while';
funcionwhile: WHILE PI exprlog PD NEWLINE+ func;

//for
FOR:'for';
funcionfor: FOR PI (variable|ID) (';' exprlog) (';' variable|ID (('+' '+')|('-' '-'))) PD NEWLINE+ func;

//condiciones
condicionales: nombrecond PI exprlog PD NEWLINE+ func;
IF: 'if';
funcionif: IF PI exprlog PD NEWLINE+ func;
ELSE: 'else';
nombrecond: IF | ELSE | IFELSE;
IFELSE: IF ' ' ELSE;


//cadenas de caracteres
CADENA: '"' (ESC|.)*? '"';
fragment ESC: '\\' [btnr"\\];
NEWLINE : [\r\n\t]+ ; 
caracteresespeciales: 'á' | 'Á' | 'é' | 'É' | 'í' | 'Í' | 'ó' | 'Ó' | 'ú' | 'Ú' | 'ñ' | 'Ñ';

//variables
ID: [a-zA-Z]+;
DIGITO: [0-9]+;
numeros: entero | flotante;
entero: DIGITO+;
flotante:  DIGITO+ '.' DIGITO+
    |   '.' DIGITO+
    ;

//return
devolver: DEVOLVER PI (expr|llamarfuncion)? PD ';' NEWLINE*;


//parentesis y puntuación
PI: '(';
PD: ')';

//codigo
codigo: (asignacion|llamarfuncion|funcionwhile|funcionfor);

//interior funciones
func: BEGIN NEWLINE+ (codigo NEWLINE?)* devolver? END NEWLINE*;

//creacion funciones
crearfuncion: FUNCTION ID PI (tipo expr (',' tipo expr)*)? PD ':' tipo NEWLINE* func;

//llamada funciones
llamarfuncion: (ID PI expr (',' expr)* PD ';'? NEWLINE* | funcionfor | funcionwhile | condicionales);

//expresiones
expr:   expr ('*'|'/') expr
    |   expr ('+'|'-') expr
    |   llamarfuncion
    |   ID NEWLINE*
    |   CADENA NEWLINE* ('+' expr)*
    |   numeros NEWLINE*
    |   PI expr PD
    ;
exprlog: expr ('>'|'<'|'<='|'>='|'=='|'!=') expr;

//comentarios
comentarios:    COMENTARIO_LINEA
            |   COMENTARIO_BLOQUE1
            |   COMENTARIO_BLOQUE2
            |   COMENTARIO_LINEA2
            ;
COMENTARIO_LINEA: '//' .*? '\n' ->skip;
COMENTARIO_LINEA2:   '/*' .*? '*/' ->skip;
COMENTARIO_BLOQUE1: '/***' .*? '***/' ->skip;
COMENTARIO_BLOQUE2: '/**' .*? '**/' ->skip;


//Espacios en blanco, tabuladores
WS: ([\t\n\r]+|' '+) ->skip;
