package codigoInterface;

import codigoInterface.gals.LexicalError;
import codigoInterface.gals.Lexico;
import codigoInterface.gals.SemanticError;
import codigoInterface.gals.Semantico;
import codigoInterface.gals.Sintatico;
import codigoInterface.gals.SyntaticError;


public class CompilerController {

	
    public String compilar(String texto) {
    	StringBuilder lexemas = new StringBuilder();
    			
    	Lexico lexico = new Lexico();
		Sintatico sintatico = new Sintatico();
		Semantico semantico = new Semantico();
		
		lexico.setInput(texto);
			
		try {
			sintatico.parse(lexico, semantico);   
			lexemas = new StringBuilder().append("programa compilado com sucesso");
		} catch ( LexicalError e ) {
			int linha = obterLinha(texto, e.getPosition());
			String lexema = "";
          
			if (e.getLexeme() != null) {
				lexema = e.getLexeme() + " ";
			} else {
				lexema = " ";
			}
          
			lexemas = new StringBuilder().append(
					String.format("Erro na linha " + linha + " - "+ lexema +" " + e.getMessage())
			);
		} catch ( SyntaticError e ) {
			lexemas = new StringBuilder()
	                .append("Erro na linha ")
	                .append(obterLinha(texto, e.getPosition()))
	                .append(" - ")
	                .append("encontrado ")
	                .append(sintatico.getToken())
	                .append(" ")
	                .append(e.getMessage());
		} catch ( SemanticError e ) {
			lexemas = new StringBuilder()
	                .append("Erro na linha ")
	                .append(obterLinha(texto, e.getPosition()))
	                .append(" - ")
	                .append(e.getMessage());
		}
		
		return lexemas.toString();
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
