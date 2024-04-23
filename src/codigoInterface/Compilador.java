package codigoInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compilador {

	public static void main(String[] args) {
        String entrada = "{\n" +
                "isso é um comentário\n" +
                "}\n" +
                "output area (\n" +
                "10001.00 \n";

        String saida = compilar(entrada);
        System.out.println(saida);
    }

    public static String compilar(String entrada) {
        StringBuilder saida = new StringBuilder();

        // Processar a entrada
        List<String> tokens = new ArrayList<>();
        List<String> classes = new ArrayList<>();
        List<String> lexemas = new ArrayList<>();

        boolean dentroComentario = false;

        String[] linhasEntrada = entrada.split("\n");
        for (String linha : linhasEntrada) {
            if (linha.startsWith("{")) {
                dentroComentario = true;
                continue;
            }

            if (linha.startsWith("}")) {
                dentroComentario = false;
                continue;
            }

            if (!dentroComentario && !linha.trim().isEmpty()) {
                String[] partes = linha.split("\\s+");
                for (String parte : partes) {
                    tokens.add(analisarToken(parte));
                    classes.add(analisarClasse(parte));
                    lexemas.add(parte);
                }
            }
        }

        // Construir a saída
        saida.append("linha\n");
        for (int i = 0; i < tokens.size(); i++) {
            saida.append(tokens.get(i)).append("\n");
        }
        for (int i = 0; i < classes.size(); i++) {
            saida.append(classes.get(i)).append("\n");
        }
        for (int i = 0; i < lexemas.size(); i++) {
            saida.append(lexemas.get(i)).append("\n");
        }
        saida.append("programa compilado com sucesso");

        return saida.toString();
    }

    private static String analisarToken(String lexema) {
        if (lexema.matches("\\d+(\\.\\d+)?")) {
            return "constante_int";
        } else if (lexema.matches("\\d+\\.\\d+")) {
            return "constante_float";
        } else if (lexema.equals("(") || lexema.equals(")")) {
            return "símbolo especial";
        } else {
            return "identificador";
        }
    }

    private static String analisarClasse(String lexema) {
        if (lexema.equals("(") || lexema.equals(")")) {
            return "símbolo especial";
        } else if (lexema.matches("\\d+(\\.\\d+)?")) {
            return "constante_int";
        } else if (lexema.matches("\\d+\\.\\d+")) {
            return "constante_float";
        } else if (lexema.equals("output") || lexema.equals("area")) {
            return "palavra reservada";
        } else {
            return "identificador";
        }
    }
}
