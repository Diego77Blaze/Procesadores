lexer grammar GramaticacompilerLexer;


//palabras reservadas
INCLUDE: 'include';
MAIN: 'main';
FUNCTION: 'function';
TIPONUMERO: 'numero';
TIPOCADENA: 'cadena';
TIPOVOID: 'void';
BEGIN: 'begin';
END: 'end';
DEVOLVER: 'devolver';
WHILE: 'while';
FOR:'for';
SWITCH:'switch';
CASE: 'case';
BREAK: 'break';
DEFAULT:'default';
ENDSWITCH:'endswitch';

IF: 'if';
ELSE: 'else';
IFELSE: IF ' ' ELSE;
CONDICIONES: IF | ELSE | IFELSE;


//Puntuacion
DOSPUNTOS: ':';
PUNTO: '.';
COMA: ',';
PI: '(';
PD: ')';
PC: ';';
BB:'_';
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
ADD1: '++';
SUBSTRACT1: '--';


//Data structures
NEWLINE : [\r\n\t]+ ->skip; 
CADENA: '"' (ESC|.)*? '"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));};
fragment ESC: '\\' [btnr"\\];
ID: [a-zA-Z0-9_]+;
DIGITO: [0-9]+;
WS: ([\t\n\r]+|' '+) ->skip;
COMENTARIO_LINEA: '//' .*? '\n' ->skip;
COMENTARIO_LINEA2:   '/*' .*? '*/' ->skip;
COMENTARIO_BLOQUE1: '/***' .*? '***/' ->skip;
COMENTARIO_BLOQUE2: '/**' .*? '**/' ->skip;