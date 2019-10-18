grammar elementos;

//puntuación en los tokens
llamadafuncion: ID PI INT PD;

PI:'(';
PD:')';
ID: [a-zA-Z]+;
INT: [0-9]+;

//keywords lenguaje
IF: 'if'; //siempre van al principio de los símbolos terminales

//identificadores:
IDz: [a-zA-Z][a-zA-Z0-9];
IDF: ID_LETRA(ID_LETRA|DIGITO)*;
fragment ID_LETRA: [a-zA-Z];
fragment DIGITO:[0-9];

//Nnumeros
ENTERO: DIGITO+;
FLOTANTE: DIGITO+ '.' DIGITO*
    | '.' DIGITO+
    ;
numeros: ENTERO|FLOTANTE;

//cadenas de caracteres
CADENA: '"' (ESC|.)*? '"';
fragment ESC: '\\'[btnr"\\];

//comentarios
COMENTARIO_LINEA: '//' .*? '\n' ->skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' ->skip;

//Espacios en blanco, tabuladores
WS: [ \t\n\r]+ ->skip;