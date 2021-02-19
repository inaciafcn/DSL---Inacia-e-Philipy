grammar Colors;

prog : entrada+
     ;

entrada : VAR '=' exp    #Igualdade
        | 'combinar' exp #Combinar
        | 'mostrar' exp  #Mostrar
        ;

exp :   exp '+' exp #Combinacao
    |   VAR         #Var
    |   cores       #Cor
    ;

cores:   'azul'      #Azul
     |   'amarelo'   #Amarelo
     |   'vermelho'  #Vermelho
     |   'laranja'   #Laranja
     |   'verde'     #Verde
     |   'roxo'      #Roxo
     |   'cinza'     #Cinza
     ;

VAR : [a-zA-Z]+
    ; 

SPACE : [ \n\t\r] -> skip
      ;