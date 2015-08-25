package br.com.canajo.exception;

/**
 * Exceção específica para jogador já cadastrado para o jogo.
 * 
 * @author Gilberto Lupatini
 */
public class RegistroJaCadastrado extends Exception {

    private static final long serialVersionUID = 1L;

    public RegistroJaCadastrado(String message) {
	super(message);
    }
}
