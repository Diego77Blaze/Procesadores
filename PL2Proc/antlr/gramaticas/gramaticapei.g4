grammar gramaticapei;

//axioma
prog:   (include NEWLINE+)*
    |   (asignacion NEWLINE+)*
    |   (crearfuncionvoid NEWLINE+)*
    |   (crearfuncionnumero NEWLINE+)*
    |   (crearfuncioncadena NEWLINE+)*
    ;

//asignacion
asignacion: ID ':=' expr
          | tipo ID ':=' expr
          ;

//reservadas
INCLUDE: 'include';
include: INCLUDE LETRA+ ('.'(LETRA+|'*'));
FUNCTION: 'function';
TIPONUMERO: 'numero';
TIPOCADENA: 'cadena';
TIPOVOID: 'void';
tipo: TIPONUMERO|TIPOCADENA;
ID: (LETRA+DIGITO*)+;
BEGIN: 'begin';
END: 'end';
WHILE: 'while';
while: WHILE PI exprlog PD NEWLINE+ funcwhile;
DEVOLVER: 'devolver';

//cadenas de caracteres
LETRA: [a-zA-Z];
string: '"' (ESC|.)*? '"';
fragment ESC: '\\'[btnr"\\];
fragment NEWLINE: '\\'[nr"\\]; 

//numeros
DIGITO: [0-9];
numero: INT|FLOAT;
INT: DIGITO*;
FLOAT:  DIGITO+'.'DIGITO+
    |   '.' DIGITO+
    ;

//PARENTESIS
PI: '(';
PD: ')';

//creacion funciones
crearfuncionvoid: FUNCTION ID PI (tipo? ID? (',' tipo ID)?)* PD ':' TIPOVOID NEWLINE+  funcvoid;
crearfuncionnumero: FUNCTION ID PI(tipo? ID?(',' tipo ID)?)* PD ':' TIPONUMERO NEWLINE+ funcnum;
crearfuncioncadena: FUNCTION ID PI(tipo? ID?(',' tipo ID)?)* PD ':' TIPOCADENA NEWLINE+ funccad;

//codigo
codigo: (asignacion|llamarfuncion|while);

//interior funciones
funcvoid: BEGIN NEWLINE+ (codigo NEWLINE)+ END;
funcnum: BEGIN NEWLINE+ (codigo NEWLINE)+ DEVOLVER (ID|numero) END;
funccad:BEGIN NEWLINE+ (codigo NEWLINE)+ DEVOLVER (ID|string) END;
funcwhile: BEGIN NEWLINE+ (codigo NEWLINE)+ END;


//llamada funciones
llamarfuncion: ID PI (expr(',' expr)*)? PD; 

//expresiones
expr:   expr ('*'|'/') expr
    |   expr ('+'|'-') expr
    |   exprlog
    |   llamarfuncion
    |   ID
    |   string
    |   numero  
    |   PI expr PD
    ;
exprlog: expr ('>'|'<'|'<='|'>='|'=='|'!=') expr;

//comentarios
COMENTARIO_LINEA: '//' .*? '\n'->skip;
COMENTARIO_LINEA2:   '/*' .*? '*/' ->skip;
COMENTARIO_BLOQUE1: '/***' .*? '***/'->skip;
COMENTARIO_BLOQUE2: '/**' .*? '**/' ->skip;

//Espacios en blanco, tabuladores
WS: [ \t\n\r]+ ->skip;