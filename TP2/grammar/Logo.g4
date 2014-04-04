grammar Logo; 

@header {
  package logoparsing.grammar;
}

INT : '0' | [1-9][0-9]* ;
WS : [ \t\r\n]+ -> skip ;

programme : liste_instructions 
;
liste_instructions :
  (instruction)+   
;

expr:
	expr ('*'|'/') expr # mult
  | INT # int
 ;
 
instruction :
    'av' expr # av
  | 'td' expr # td
  | 'tg' expr # tg
;