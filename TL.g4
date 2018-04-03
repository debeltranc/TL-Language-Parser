grammar TL;

// Parser rules

parse
 : from_input | from_file
 ;

from_input
 : stat TOKEN_NEWLINE
 ;

from_file
 : (stat|TOKEN_NEWLINE)* EOF
 ;

stat
 : simple_stat
 | compound_stat
 ;

compound_stat
 : if_stat
 | while_stat
 | for_stat
 | funcion
 ;

simple_stat
 : assignment
 | expr
 | log
 | leer
 | importar
 | retornar
 | atom TOKEN_NEWLINE
 ;

assignment
 : (variable|array) TOKEN_ASSIGN (assignment|expr)
 ;

if_stat
 : IF condition_block (TOKEN_NEWLINE)* (ELIF condition_block)* (TOKEN_NEWLINE)* (ELSE stat_block)?
 ;

while_stat
 : WHILE condition_block
 ;

for_stat
 : FOR ID IN expr stat_block
 ;

log
 : LOG TOKEN_PAR_IZQ expr TOKEN_PAR_DER
 ;

leer
  : LEER TOKEN_PAR_IZQ expr TOKEN_PAR_DER
  ;

funcion
 : FUNCION ID TOKEN_PAR_IZQ (parametro (TOKEN_COMA parametro)*)? TOKEN_PAR_DER (TOKEN_NEWLINE|stat)* END FUNCION
 ;

importar
 : IMPORTAR ID (TOKEN_POINT ID)*
 | DESDE ID IMPORTAR ID
 ;

retornar
 : RETORNO TOKEN_PAR_IZQ expr TOKEN_PAR_DER TOKEN_NEWLINE
 ;

condition_block
 : TOKEN_PAR_IZQ booleanexpr TOKEN_PAR_DER TOKEN_NEWLINE? stat_block
 ;

stat_block
 : (TOKEN_NEWLINE)* TOKEN_LLAVE_IZQ (stat|TOKEN_NEWLINE)* TOKEN_LLAVE_DER
 | (TOKEN_NEWLINE)* (stat TOKEN_NEWLINE)
 ;

array
 : TOKEN_COR_IZQ (expr (TOKEN_COMA expr)*)? TOKEN_COR_DER
 | TOKEN_COR_IZQ start=expr TOKEN_DOSP (step=expr TOKEN_DOSP)? end=expr TOKEN_COR_DER
 ;

accessarray
 : variable TOKEN_COR_IZQ expr TOKEN_COR_DER
 ;

variable
 : ID (TOKEN_POINT ID)* (TOKEN_PAR_IZQ (expr (TOKEN_COMA expr)*)? TOKEN_PAR_DER)?
 | ID (TOKEN_POINT ID)* TOKEN_COR_IZQ expr TOKEN_COR_DER
 ;

parametro
 : ID (TOKEN_ASSIGN expr)?
 ;

expr
 : aritmethicalexpr
 | booleanexpr
 ;

aritmethicalexpr
 : <assoc=right>left=aritmethicalexpr TOKEN_POT right=aritmethicalexpr
 | TOKEN_MENOS aritmethicalexpr
 | left=aritmethicalexpr op=(TOKEN_MUL|TOKEN_DIV|TOKEN_MOD) right=aritmethicalexpr
 | left=aritmethicalexpr op=(TOKEN_MAS|TOKEN_MENOS) right=aritmethicalexpr
 | TOKEN_PAR_IZQ aritmethicalexpr TOKEN_PAR_DER
 | atom
 ;

booleanexpr
 : TOKEN_NOT booleanexpr
 | left=booleanexpr op=(TOKEN_MENOR_IGUAL|TOKEN_MAYOR_IGUAL|TOKEN_MENOR|TOKEN_MAYOR) right=booleanexpr
 | left=booleanexpr op=(TOKEN_IGUAL_NUM|TOKEN_DIFF_NUM) right=booleanexpr
 | left=booleanexpr TOKEN_AND right=booleanexpr
 | left=booleanexpr TOKEN_OR right=booleanexpr
 | aritmethicalexpr
 | atom
 ;

atom
 : (TOKEN_INTEGER|TOKEN_FLOAT)
 | (TRUE|FALSE)
 | TOKEN_STRING
 | array
 | estructura
 | accessarray
 | variable
 ;

estructura
 : TOKEN_LLAVE_IZQ (keyvalue (TOKEN_COMA keyvalue)*)? TOKEN_LLAVE_DER
 ;

keyvalue
 : ID TOKEN_DOSP expr
 ;

// Lexer Rules

// Define palabras reservadas
WHILE: 'while';
FOR: 'for';
IF: 'if';
ELIF: 'else if';
ELSE: 'else';
LOG: 'log';
LEER: 'leer';
FUNCION: 'funcion';
FALSE: 'false';
TRUE: 'true';
IMPORTAR: 'importar';
IN: 'in';
RETORNO: 'retorno';
END: 'end';
DESDE: 'desde';
TODO: 'todo';

// Define simbolos y operadores
TOKEN_LLAVE_IZQ: '{';
TOKEN_LLAVE_DER: '}';
TOKEN_COR_IZQ: '[';
TOKEN_COR_DER: ']';
TOKEN_PAR_IZQ: '(';
TOKEN_PAR_DER: ')';
TOKEN_MAYOR: '>';
TOKEN_MENOR: '<';
TOKEN_MAYOR_IGUAL: '>=';
TOKEN_MENOR_IGUAL: '<=';
TOKEN_IGUAL_NUM: '==';
TOKEN_POINT: '.';
TOKEN_DIFF_NUM: '!=';
TOKEN_AND: '&&';
TOKEN_OR: '||';
TOKEN_NOT: '!';
TOKEN_MAS: '+';
TOKEN_MENOS: '-';
TOKEN_MUL: '*';
TOKEN_DIV: '/';
TOKEN_MOD: '%';
TOKEN_POT: '^';
TOKEN_ASSIGN: '=';
TOKEN_COMA: ',';
TOKEN_DOSP: ':';

TOKEN_STRING: '"'.*?'"';
// Otra versi�n TOKEN_STRING         :   '"' ( '\\' ('\\'|'\t'|'\r\n'|'\r'|'\n'|'"') | ~('\\'|'\t'|'\r'|'\n'|'"') )* '"';

COMMENTARIO: '#' .*? '\n' -> skip;
// Otra versi�n	 '#' ~[\r\n]* -> skip;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
TOKEN_INTEGER: [0-9]+;
TOKEN_FLOAT: [0-9]+'.'[0-9]+;

WS : [ \t\r]+ -> skip ; // skip spaces, tabs, newlines

TOKEN_NEWLINE: [\n]; //Lexically speaking newlines can be ignored, but it does make sense to take newlines into account syntax-wise
