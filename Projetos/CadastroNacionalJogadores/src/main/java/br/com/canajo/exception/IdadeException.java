package br.com.canajo.exception;

/**
 * Exceção específica para idade inválida para o jogo.
 * 
 * @author Gilberto Lupatini
 */
public class IdadeException extends Exception {

    private static final long serialVersionUID = 1L;

    public IdadeException(String message) {
	super(message);
    }

}
