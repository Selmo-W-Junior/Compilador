package codigoInterface;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;

import codigoInterface.CompilerAssets.LexicalError;
import codigoInterface.CompilerAssets.Lexico;
import codigoInterface.CompilerAssets.Token;

public class CompilerController {
	
	//TODO - TROCAR NO GALS OS VALORES, LEMBRANDO QUE PALAVRA RESERVADA É IDENTIFICADOR

    public String compilar(String texto) {
        StringBuilder lexemas = new StringBuilder();
        try {
            Lexico lexico = new Lexico();
            lexico.setInput(texto);
            Token t = null;
            lexemas.append(String.format("%-10s%-18s%s\n", "linha", "classe", "lexema"));
            while ((t = lexico.nextToken()) != null) {
                int linha = getLineNumber(texto, t.getPosition());
                lexemas.append(String.format("%-8s%-20s%s%n", linha,
                        getClasse(t.getId(), t.getPosition(), t.getLexeme()), t.getLexeme()));
            }
            lexemas.append(String.format("%n        %s", "programa compilado com sucesso"));
        } catch (LexicalError e) {
            int linha = getLineNumber(texto, e.getPosition());
            String lexema = e.getLexeme() != null ? (e.getLexeme() + " ") : "";
            lexemas.append(String.format("Erro na linha " + linha + " - "+ lexema +" " + e.getMessage()));
        }
        
        return lexemas.toString();
    }
    
    private int getLineNumber(String texto, int offset) {
        int lineNumber = 1;
        for (int i = 0; i < offset && i < texto.length(); i++) {
            if (texto.charAt(i) == '\n') {
                lineNumber++;
            }
        }
        return lineNumber;
    }

    public String getClasse(int id, int posicao, String lexema) throws LexicalError {
        Map<Integer, String> classeMap = new HashMap<>();
       // classeMap.put(2, "palavra_reservada");
        classeMap.put(2, "identificador");
        classeMap.put(3, "constante_int");
        classeMap.put(4, "constante_float");
        classeMap.put(5, "constante_bin");
        classeMap.put(6, "constante_hexa");
        classeMap.put(7, "constante_string");
        classeMap.put(8, "comentario_linha");
        classeMap.put(9, "comentario_bloco");
        
        classeMap.put(10, "palavra_reservada");
        classeMap.put(11, "palavra_reservada");
        classeMap.put(12, "palavra_reservada");
        classeMap.put(13, "palavra_reservada");
        classeMap.put(14, "palavra_reservada");
        classeMap.put(15, "palavra_reservada");
        classeMap.put(16, "palavra_reservada");
        classeMap.put(17, "palavra_reservada");
        classeMap.put(18, "palavra_reservada");
        classeMap.put(19, "palavra_reservada");
        classeMap.put(20, "palavra_reservada");
        classeMap.put(21, "palavra_reservada");
        classeMap.put(22, "palavra_reservada");
        classeMap.put(23, "palavra_reservada");
        classeMap.put(24, "palavra_reservada");
        classeMap.put(25, "palavra_reservada");
        classeMap.put(26, "palavra_reservada");
        classeMap.put(27, "palavra_reservada");
        classeMap.put(28, "palavra_reservada");
        classeMap.put(29, "palavra_reservada");
        
        
        classeMap.put(30, "simbolo especial");
        classeMap.put(31, "simbolo especial");
        classeMap.put(32, "simbolo especial");
        classeMap.put(33, "simbolo especial");
        classeMap.put(34, "simbolo especial");
        classeMap.put(35, "simbolo especial");
        classeMap.put(36, "simbolo especial");
        classeMap.put(37, "simbolo especial");
        classeMap.put(38, "simbolo especial");
        classeMap.put(39, "simbolo especial");
        classeMap.put(40, "simbolo especial");
        classeMap.put(41, "simbolo especial");
        classeMap.put(42, "simbolo especial");
        classeMap.put(43, "simbolo especial");
        classeMap.put(44, "simbolo especial");
        classeMap.put(45, "simbolo especial");
        classeMap.put(46, "simbolo especial");
        classeMap.put(47, "simbolo especial");
        
        return classeMap.getOrDefault(id, " simbolo desconhecido");
    }
}
