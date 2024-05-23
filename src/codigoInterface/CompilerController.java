package codigoInterface;

import codigoInterface.gals.LexicalError;
import codigoInterface.gals.Lexico;
import codigoInterface.gals.SemanticError;
import codigoInterface.gals.Semantico;
import codigoInterface.gals.Sintatico;
import codigoInterface.gals.SyntaticError;

public class CompilerController {
	
	public String compilar(String texto) {
	    StringBuilder resultado = new StringBuilder();

	    Lexico lexico = new Lexico();
	    Sintatico sintatico = new Sintatico();
	    Semantico semantico = new Semantico();

	    lexico.setInput(texto);

	    try {
	        sintatico.parse(lexico, semantico);
	        resultado.append("programa compilado com sucesso");
	    } catch (LexicalError e) {
	        resultado.append(tratarErroLexico(e, texto));
	    } catch (SyntaticError e) {
	        resultado.append(tratarErroSintatico(e, texto, sintatico));
	    } catch (SemanticError e) {
	        resultado.append(tratarErroSemantico(e, texto));
	    }

	    return resultado.toString();
	}

	private String tratarErroLexico(LexicalError e, String texto) {
	    int linha = obterLinha(texto, e.getPosition());
	    String lexema = e.getLexeme() != null ? e.getLexeme() + " " : " ";
	    return String.format("Erro na linha %d - %s %s", linha, lexema, e.getMessage());
	}

	private String tratarErroSintatico(SyntaticError e, String texto, Sintatico sintatico) {
	    int linha = obterLinha(texto, e.getPosition());
	    return String.format("Erro na linha %d - encontrado %s %s", linha, sintatico.getToken(), e.getMessage());
	}

	private String tratarErroSemantico(SemanticError e, String texto) {
	    int linha = obterLinha(texto, e.getPosition());
	    return String.format("Erro na linha %d - %s", linha, e.getMessage());
	}
    
    private int obterLinha(String entrada, int position) {
        if (position < 0 || position > entrada.length()) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }

        int linha = 1; 

        for (int i = 0; i < position; i++) {
            if (entrada.charAt(i) == '\n') {
                linha++;
            }
        }

        return linha;
    }
}
