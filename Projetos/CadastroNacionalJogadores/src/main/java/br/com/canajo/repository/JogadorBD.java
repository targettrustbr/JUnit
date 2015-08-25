package br.com.canajo.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.canajo.ed.JogadorED;

/**
 * Camada de Persistência (fake) dos dados do Jogador.
 * 
 * @author Gilberto Lupatini
 */
public class JogadorBD {

    static List<JogadorED> jogadores = new ArrayList<JogadorED>();
    
    public void incluir(JogadorED jogador) {
	jogadores.add(jogador);
    }

    public JogadorED verificaSeJaExiste(String nome, Calendar nascimento, String nomeMae) {
	//Percorre a lista verificando se já existe. Simula um select em banco.
	for (JogadorED jogadorED : jogadores) {
	    if(jogadorED.getNome().equals(nome) && jogadorED.getNomeMae().equals(nomeMae) 
		    && jogadorED.getNascimento().compareTo(nascimento) == 0
		    
		    ){
		return jogadorED;
	    }
	}
	
	//Não existe.
	return null;
    }

}
