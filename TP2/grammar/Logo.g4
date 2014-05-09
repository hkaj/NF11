grammar Logo; 

@header {
  package logoparsing.grammar;
}

INT : '0' | [1-9][0-9]* ;
WS : [ \t\r\n]+ -> skip ;	
FUNCTION_ID : [a-zA-Z][0-9a-zA-Z]*;
DECLARATION_ID : '"'[a-zA-Z][0-9a-zA-Z]*;
ID : ':'[a-zA-Z][0-9a-zA-Z]*;

variable: DECLARATION_ID;

programme : liste_functions liste_instructions 
;

liste_instructions :
  (instruction)*	   
;

liste_functions : (function_declaration)* 
;

function_declaration : 'function' FUNCTION_ID'(' variable* ')' '[' 
	programme ('return' expr)? 
']' # functionDeclaration
;

expr:
  expr '*' expr # mult
  | expr '/' expr # div
  | expr '+' expr # add
  | expr '-' expr # sub 
  | expr '<' expr # inf
  | expr '>' expr # sup
  | expr '==' expr # equal
  | expr '!=' expr # nequal
  | '(' expr ')' # par
  | INT # int
  | ID  # id
  | FUNCTION_ID'(' expr* ')' # function
  | 'loop' # loop
;
 
instruction :
    'av' expr # av
  | 're' expr # re
  | 'td' expr # td
  | 'tg' expr # tg
  | 'fpos' expr expr # fpos
  | 'fcc' expr # fcc
  | 'lc' # lc
  | 'bc' # bc
  | 've' # ve
  | 'set' DECLARATION_ID expr # set
  | 'if' expr '[' liste_instructions ']' ('[' liste_instructions ']')? # if
  | 'repeat' expr '[' liste_instructions ']' # repeat
  | 'while' expr '[' liste_instructions ']' # while
  | FUNCTION_ID'(' expr* ')' # procedure
;