grammar gramaticapei;

//axioma
prog:   (include NEWLINE+)*
    |   (asignacion NEWLINE+)*
    |   (crearfuncion NEWLINE+)*
    |   (expr NEWLINE+)*
    |   (comentarios NEWLINE+)*
    |   NEWLINE+
    ;
//asignacion
asignacion: tipo? ID ':=' expr comentarios? ';';
variable: tipo? ID ':=' expr;

//reservadas
INCLUDE: 'include';
include: INCLUDE LETRA+ ('.'(LETRA+|'*'));
FUNCTION: 'function'; 
TIPONUMERO: 'numero';
TIPOCADENA: 'cadena';
TIPOVOID: 'void';
tipo: TIPONUMERO|TIPOCADENA|TIPOVOID;
ID: LETRA+;
BEGIN: 'begin';
END: 'end';
WHILE: 'while';
while: WHILE PI exprlog PD (comentarios?NEWLINE)+ func;
IF: 'if';
if: IF PI exprlog PD NEWLINE+ func;
DEVOLVER: 'devolver';
FOR:'for';
for: FOR PI(variable|ID) (';' exprlog) (';' variable|ID (('+' '+')|('-' '-'))) PD (comentarios?NEWLINE)+ func;

condicionales: nombrecond PI exprlog PD (comentarios?NEWLINE)+ func;
nombrecond: IF|ELSE|IFELSE;

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
crearfuncion: FUNCTION ID PI (tipo? ID? (',' tipo ID)?)* PD ':' tipo (comentarios?NEWLINE)+  func;

//codigo
codigo: (asignacion|llamarfuncion|while);

//interior funciones
func: BEGIN NEWLINE+ (codigo NEWLINE)+ END NEWLINE+;


//llamada funciones
llamarfuncion: ((ID PI (expr(',' expr)*)? PD ';'NEWLINE+)| for | while | condicionales); 

//expresiones
expr:   expr ('*'|'/') expr
    |   expr ('+'|'-') expr
    |   expr ('>'|'<'|'<='|'>='|'=='|'!=') expr
    |   llamarfuncion
    |   ID
    |   string
    |   numero  
    |   PI expr PD
    ;
exprlog: expr ('>'|'<'|'<='|'>='|'=='|'!=') expr;

//comentarios
comentarios:    COMENTARIO_LINEA
    |   COMENTARIO_BLOQUE1
    |   COMENTARIO_BLOQUE2
    |   COMENTARIO_LINEA2
    ;
COMENTARIO_LINEA: '//' .*? '\n'->skip;
COMENTARIO_LINEA2:   '/*' .*? '*/' ->skip;
COMENTARIO_BLOQUE1: '/***' .*? '***/'->skip;
COMENTARIO_BLOQUE2: '/**' .*? '**/' ->skip;


//Espacios en blanco, tabuladores
WS: [ \t\n\r]+ ->skip;