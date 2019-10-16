grammar Expr;		
prog:	((expr | asignacion) NEWLINE)* ;
asignacion: VARIABLE ':=' expr;
expr:	expr ('*'|'/') expr
    |	expr ('+'|'-') expr
    |   expr ('>'|'<'|'=='|'=!') expr
    |	INT
    |	'(' expr ')'
    |   OPERACION '('(expr(','expr)*)?')'
    |   VARIABLE
    ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;
OPERACION: 'cos'|'sen'|'tg';
VARIABLE: [a-zA-Z]+;
WS: ' '+ ->skip;