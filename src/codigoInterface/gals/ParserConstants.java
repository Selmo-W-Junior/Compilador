package codigoInterface.gals;

public interface ParserConstants
{
    int START_SYMBOL = 48;

    int FIRST_NON_TERMINAL    = 48;
    int FIRST_SEMANTIC_ACTION = 84;

    int[][] PARSER_TABLE =
    {
        { -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, 24, -1, -1, -1, -1, 21, 23, -1, 20, -1, -1, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 26, 27, 28, 29, 32, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 35, 35, 35, 35, 35, 35, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, 35, -1, -1, -1, -1, 35, 35, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9, -1,  7, -1,  8, -1, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1,  3, -1,  3, -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        {  5,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1,  5,  5,  5, -1, -1, -1,  4, -1,  4, -1,  4, -1, -1, -1, -1, -1,  4,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 19, -1, -1, 18, 18, -1, 18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 44, 44, 44, 44, 44, 44, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, 44, -1, -1, -1, -1, 44, 44, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, 45, -1, 45, -1, 45, 46, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 48, 48, 48, 48, 48, 48, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, 51, -1, -1, -1, -1, 48, 48, -1, -1 },
        { -1, 52, 52, 52, 52, 52, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, 52, 52, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, -1, 53, -1, 53, -1, 53, 53, 53, -1, 54, 54, 54, 54, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, 56, 57, 58, -1, -1, -1, -1 },
        { -1, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, -1, 60, -1, 60, -1, 60, 60, 60, -1, 60, 60, 60, 60, 61, 62, -1, -1 },
        { -1, 63, 63, 63, 63, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, -1, -1, 63, 63, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, 64, -1, 64, -1, 64, 64, 64, -1, 64, 64, 64, 64, 64, 64, 65, 66 },
        { -1, 67, 67, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, 67, 67, -1, -1 },
        { -1, 68, 69, 70, 71, 72, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 74, -1, -1, -1, -1, -1, -1, -1, -1, 75, 76, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 77, 78, 77, -1, 77, -1, 77, 77, 77, -1, 77, 77, 77, 77, 77, 77, 77, 77 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, 80, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 49, 21, 63 },
        { 50 },
        {  0 },
        { 62, 32, 64 },
        { 63 },
        {  0 },
        { 61 },
        { 54 },
        { 55 },
        { 57 },
        { 60 },
        { 51, 33, 69 },
        { 51, 34, 52, 65 },
        { 33, 53, 32, 66 },
        { 32, 66 },
        { 50 },
        {  0 },
        {  2, 68 },
        {  0 },
        { 30, 51 },
        { 19 },
        { 16 },
        { 10 },
        { 17 },
        { 11 },
        { 23 },
        {  3 },
        {  4 },
        {  5 },
        {  6 },
        { 27 },
        { 15 },
        {  7 },
        { 20, 35, 51, 36 },
        { 22, 35, 56, 36 },
        { 69, 71 },
        {  0 },
        { 30, 56 },
        { 18, 69, 34, 63, 58, 59, 14 },
        { 12, 69, 34, 63, 58 },
        {  0 },
        { 13, 63 },
        {  0 },
        { 28, 63, 29, 69 },
        { 72, 70 },
        {  0 },
        { 37, 72, 70 },
        { 38, 72, 70 },
        { 73 },
        { 27 },
        { 15 },
        { 39, 72 },
        { 76, 74 },
        {  0 },
        { 75, 76 },
        { 40 },
        { 41 },
        { 42 },
        { 43 },
        { 78, 77 },
        {  0 },
        { 44, 78, 77 },
        { 45, 78, 77 },
        { 80, 79 },
        {  0 },
        { 46, 80, 79 },
        { 47, 80, 79 },
        { 81, 82 },
        {  2 },
        {  3 },
        {  4 },
        {  5 },
        {  6 },
        {  7 },
        { 35, 69, 36 },
        { 44, 81 },
        { 45, 81 },
        {  0 },
        { 31, 83 },
        { 24 },
        { 25 },
        { 26 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "esperado EOF", //fim de programa
        "esperado identificador", //identificador
        "esperado constante_int", //cint
        "esperado constante_float", //cfloat
        "esperado constante_bin", //cbin
        "esperado constante_hexa", //chexa
        "esperado constante_str", //cstr
        "esperado comentario_de_linha", //comentario_de_linha
        "esperado comentario_de_bloco", //comentario_de_bloco
        "esperado bin", //bin
        "esperado bool", //bool
        "esperado elif", //elif
        "esperado else", //else
        "esperado endif", //endif
        "esperado false", //false
        "esperado float", //float
        "esperado hexa", //hexa
        "esperado if", //if
        "esperado int", //int
        "esperado input", //input
        "esperado main", //main
        "esperado output", //output
        "esperado str", //str
        "esperado toInt", //toInt
        "esperado toBin", //toBin
        "esperado toHexa", //toHexa
        "esperado true", //true
        "esperado repeat", //repeat
        "esperado until", //until
        "esperado \",\"",
        "esperado \".\"",
        "esperado \";\"",
        "esperado \"=\"",
        "esperado \":\"",
        "esperado \"(\"",
        "esperado \")\"",
        "esperado \"&\"",
        "esperado \"|\"",
        "esperado \"!\"",
        "esperado \"==\"",
        "esperado \"!=\"",
        "esperado \"<\"",
        "esperado \">\"",
        "esperado \"+\"",
        "esperado \"-\"",
        "esperado \"*\"",
        "esperado \"/\"",
        "esperado main", //<forma_geral_programa>
        "esperado variavel", //<declaracao_variaveis>
        "esperado variavel", //<lista_variaveis>
        "esperado identificador", //<lista_id>
        "esperado int float bin hexa bool str", //<tipo>
        "esperado constante_int constante_float constante_bin constante_hexa true false constante_string", //<valor>
        "esperado input", //<comando_entrada_de_dados>
        "esperado output", //<comando_saida_de_dados>
        "esperado expressão", //<lista_expressoes>
        "esperado if", //<comando_selecao>
        "esperado elif", //<comando_elif>
        "esperado else", //<comando_else>
        "esperado repeat", //<comando_repeticao>
        "esperado id", //<comando_atribuicao>
        "<comando> inválido", //<comando>
        "<lista_comandos> inválido", //<lista_comandos>
        "<lista_comando1> inválido", //<lista_comando1>
        "<lista_variavel1> inválido", //<lista_variavel1>
        "<lista_variavel2> inválido", //<lista_variavel2>
        "<identificador> inválido", //<identificador>
        "esperado , : = )", //<identificador1>
        "esperado expressão", //<expressao>
        "esperado expressão", //<expressao_>
        "<expressao2> inválido", //<expressao2>
        "esperado expressão", //<elemento>
        "esperado expressão", //<relacional>
        "esperado expressão", //<relacional_>
        "esperado == != < >", //<operador_relacional>
        "esperado expressão", //<aritmetica>
        "esperado expressão", //<aritmetica_>
        "esperado expressão", //<termo>
        "esperado expressão", //<termo_>
        "esperado expressão", //<fator>
        "esperado expressão", //<membro>
        "esperado expressão", //<membro_>
        "esperado expressão" //<membro__>
    };
}