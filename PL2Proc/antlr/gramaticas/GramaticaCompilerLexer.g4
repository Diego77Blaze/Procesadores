lexer grammar GramaticaCompilerLexer;
//palabras reservadas
INCLUDE: 'include';
FUNCTION: 'function';
TIPONUMERO: 'numero';
TIPOCADENA: 'cadena';
TIPOVOID: 'void';
BEGIN: 'begin';
END: 'end';
DEVOLVER: 'devolver';
WHILE: 'while';
FOR:'for';
IF: 'if';
ELSE: 'else';
IFELSE: IF ' ' ELSE;
CONDICIONES: IF | ELSE | IFELSE;
PI: '(';
PD: ')';
PC: ';';
ADD: '+';
MINUS: '-';
PRODUCT: '*';
DIVISION: '/';
ASIGNACION: ':=';
PORCENTAJE: '%';
MENORQUE: '<';
MAYORQUE: '>';
IGUALQUE: '==';
DISTINTOQUE: '!=';
DOSPUNTOS: ':';
PUNTO: '.';
COMA: ',';


//Data structures
NEWLINE : [\r\n\t]+ ; 
CADENA: '"' (ESC|.)*? '"';
fragment ESC: '\\' [btnr"\\];
ID: [a-zA-Z]+;
DIGITO: [0-9]+;
WS: ([\t\n\r]+|' '+) ->skip;
COMENTARIO_LINEA: '//' .*? '\n' ->skip;
COMENTARIO_LINEA2:   '/*' .*? '*/' ->skip;
COMENTARIO_BLOQUE1: '/***' .*? '***/' ->skip;
COMENTARIO_BLOQUE2: '/**' .*? '**/' ->skip;