package br.com.canajo.util;

import br.com.canajo.ed.JogadorED;

/**
 * Comparator para o objeto JogadorED.
 * 
 * @author Gilberto Lupatini
 */
public class JogadorCompareUtil {

    public boolean compara(JogadorED jogadorA, JogadorED jogadorB) {
	if (jogadorA == null || jogadorB == null) {
	    return false;
	}

	if (jogadorA.getNome().equals(jogadorB.getNome())) {
	    // if (jogadorA.getNomeMae().equals(jogadorB.getNomeMae())) {
	    return true;
	    // }
	}

	return false;

    }

}
