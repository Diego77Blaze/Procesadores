grammar migramatica;

//cadenas de caracteres
STRING: '"' (ESC|.)*? '"';
fragment ESC: '\\'[btnr"\\];
fragment NEWLINE: '\\'[nr"\\];

//expresiones
PROG:	((EXPR | ASIGNACION) NEWLINE)* ;
ASIGNACION: TIPO ID ':=' EXPR;
EXPR:	EXPR ('*'|'/') EXPR
    |	EXPR ('+'|'-') EXPR
    |   EXPR ('>'|'<'|'=='|'=!') EXPR
    |	INT EXPR
    |	'(' EXPR ')'
    |   ID EXPR
    |   LLAMARFUNCION EXPR
    ;


//puntuacion en los tokens
crearfuncion: 'function' ID PI TIPOENTRADA? (INT|STRING)? PD '.' TIPO '\n' BEGIN PROG DEVOLVER? END;
LLAMARFUNCION: ID PI (INT|STRING)? PD; 
PI:'(';
PD:')';
ID: [a-zA-Z]+;
INT: [0-9]+;
TIPOENTRADA: ('numero'|'cadena');
TIPO: ('void'|'cadena'|'numero');
BEGIN: 'begin';
END: 'end';
DEVOLVER: 'devolver';



//keywords lenguaje
PRINTF: 'printf(' STRING ')';
SPRINTF: 'sprintf(' '"'FORMATO'"' ','STRING ')';
FORMATO: '%'[CDIEeFgGosuxXpn%];
INCLUDE: 'include' STRING ';';



//identificadores:
IDz: [a-zA-Z][a-zA-Z0-9];
IDF: ID_LETRA(ID_LETRA|DIGITO)*;
fragment ID_LETRA: [a-zA-Z];
fragment DIGITO:[0-9];

//comentarios
COMENTARIO_LINEA: '//' .*? '\n'
                |   '/*' .*? '*/' ->skip
                ;
COMENTARIO_BLOQUE1: '/***' .*? '***/'
                |   '/**' .*? '**/' ->skip
                ;

//Espacios en blanco, tabuladores
WS: [ \t\n\r]+ ->skip;