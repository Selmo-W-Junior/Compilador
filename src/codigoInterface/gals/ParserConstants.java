package codigoInterface.gals;

public interface ParserConstants
{
    int START_SYMBOL = 46;

    int FIRST_NON_TERMINAL    = 46;
    int FIRST_SEMANTIC_ACTION = 82;

    int[][] PARSER_TABLE =
    {
        { -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, 22, 24, -1, -1, -1, -1, 21, 23, -1, 20, -1, -1, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 26, 27, 28, 29, 32, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 35, 35, 35, 35, 35, 35, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, 35, -1, -1, -1, -1, 35, 35, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, 40, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9, -1,  7, -1,  8, -1, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  3, -1,  3, -1,  3, -1, -1, -1, -1, -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        {  5,  4, -1, -1, -1, -1, -1, -1, -1,  5,  5,  5, -1, -1, -1,  4, -1,  4, -1,  4, -1, -1, -1, -1, -1,  4,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 19, -1, -1, 18, 18, -1, 18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 44, 44, 44, 44, 44, 44, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, 44, -1, -1, -1, -1, 44, 44, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, 45, -1, 45, -1, 45, 46, 47, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 48, 48, 48, 48, 48, 48, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, 51, -1, -1, -1, -1, 48, 48, -1, -1 },
        { -1, 52, 52, 52, 52, 52, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, 52, 52, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, -1, 53, -1, 53, -1, 53, 53, 53, -1, 54, 54, 54, 54, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, 56, 57, 58, -1, -1, -1, -1 },
        { -1, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, -1, 60, -1, 60, -1, 60, 60, 60, -1, 60, 60, 60, 60, 61, 62, -1, -1 },
        { -1, 63, 63, 63, 63, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, -1, -1, 63, 63, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, 64, -1, 64, -1, 64, 64, 64, -1, 64, 64, 64, 64, 64, 64, 65, 66 },
        { -1, 67, 67, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, 67, 67, -1, -1 },
        { -1, 68, 69, 70, 71, 72, 73, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 74, -1, -1, -1, -1, -1, -1, -1, -1, 75, 76, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 77, 78, 77, -1, 77, -1, 77, 77, 77, -1, 77, 77, 77, 77, 77, 77, 77, 77 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, 80, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 47, 19, 61 },
        { 48 },
        {  0 },
        { 60, 30, 62 },
        { 61 },
        {  0 },
        { 59 },
        { 52 },
        { 53 },
        { 55 },
        { 58 },
        { 49, 31, 67 },
        { 49, 32, 50, 63 },
        { 31, 51, 30, 64 },
        { 30, 64 },
        { 48 },
        {  0 },
        {  2, 66 },
        {  0 },
        { 28, 49 },
        { 17 },
        { 14 },
        {  8 },
        { 15 },
        {  9 },
        { 21 },
        {  3 },
        {  4 },
        {  5 },
        {  6 },
        { 25 },
        { 13 },
        {  7 },
        { 18, 33, 49, 34 },
        { 20, 33, 54, 34 },
        { 67, 69 },
        {  0 },
        { 28, 54 },
        { 16, 67, 32, 61, 56, 57, 12 },
        { 10, 67, 32, 61, 56 },
        {  0 },
        { 11, 61 },
        {  0 },
        { 26, 61, 27, 67 },
        { 70, 68 },
        {  0 },
        { 35, 70, 68 },
        { 36, 70, 68 },
        { 71 },
        { 25 },
        { 13 },
        { 37, 70 },
        { 74, 72 },
        {  0 },
        { 73, 74 },
        { 38 },
        { 39 },
        { 40 },
        { 41 },
        { 76, 75 },
        {  0 },
        { 42, 76, 75 },
        { 43, 76, 75 },
        { 78, 77 },
        {  0 },
        { 44, 78, 77 },
        { 45, 78, 77 },
        { 79, 80 },
        {  2 },
        {  3 },
        {  4 },
        {  5 },
        {  6 },
        {  7 },
        { 33, 67, 34 },
        { 42, 79 },
        { 43, 79 },
        {  0 },
        { 29, 81 },
        { 22 },
        { 23 },
        { 24 }
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
        "esperado identificador main", //<forma_geral_programa>
        "esperado identificador main", //<declaracao_variaveis>
        "esperado identificador", //<lista_variaveis>
        "esperado identificador", //<lista_id>
        "esperado int float bin hexa bool str", //<tipo>
        "esperado constante_int constante_float constante_bin constante_hexa true false constante_string", //<valor>
        "esperado input", //<comando_entrada_de_dados>
        "esperado output", //<comando_saida_de_dados>
        "esperado expressão", //<lista_expressoes>
        "esperado if", //<comando_selecao>
        "esperado elif else endif", //<comando_elif>
        "esperado else endif", //<comando_else>
        "esperado repeat", //<comando_repeticao>
        "esperado identificador", //<comando_atribuicao>
        "esperado identificador if input output repeat", //<comando>
        "esperado identificador if input output repeat", //<lista_comandos>
        "esperado EOF identificador elif else endif if input output repeat until", //<lista_comando1>
        "esperado ; =", //<lista_variavel1>
        "esperado identificador main", //<lista_variavel2>
        "esperado , identificador", //<identificador>
        "esperado , : = )", //<identificador1>
        "esperado expressão", //<expressao>
        "esperado expressão", //<expressao_>
        "esperado , )", //<expressao2>
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
