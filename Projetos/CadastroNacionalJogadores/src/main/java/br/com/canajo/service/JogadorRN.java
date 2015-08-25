package br.com.canajo.service;

import java.util.Calendar;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import br.com.canajo.ed.JogadorED;
import br.com.canajo.enums.Categoria;
import br.com.canajo.exception.IdadeException;
import br.com.canajo.exception.RegistroJaCadastrado;
import br.com.canajo.repository.JogadorBD;

/**
 * Camada que agrupa regras de negócio (RN) do Jogador.
 * 
 * @author Gilberto Lupatini
 */
public class JogadorRN {

    static JogadorBD jogadorBD = new JogadorBD();

    /**
     * Insere um novo jogador.
     * 
     * @param nome
     * @param nomeMae
     * @param nascimento
     * @param categoria
     * 
     * @throws IdadeException
     *             limite de idade da categoria.
     * @throws RegistroJaCadastrado
     */
    public void cadastrarJogador(String nome, String nomeMae, Calendar nascimento, Categoria categoria) throws IdadeException, RegistroJaCadastrado {

	JogadorED jogador = new JogadorED();
	jogador.setNome(nome);
	jogador.setNascimento(nascimento);
	jogador.setNomeMae(nomeMae);

	if (jogadorBD.verificaSeJaExiste(nome, nascimento, nomeMae) != null) {
	    throw new RegistroJaCadastrado("O Jogador já existe com esse mesmo nome, data de nascimento e nome de mãe");
	}

	alteraCategoriaJogador(jogador, categoria);

	jogadorBD.incluir(jogador);
    }

    private void alteraCategoriaJogador(JogadorED jogador, Categoria categoria) throws IdadeException {

	int idade = Years.yearsBetween(new LocalDate(jogador.getNascimento().getTimeInMillis()), LocalDate.now()).getYears();

	if (idade > categoria.getIdadeMaxima()) {
	    throw new IdadeException("O jogador " + jogador.getNome() + " tem idade superior ao permitido pela categoria " + categoria.name());
	}

	if (idade < categoria.getIdadeMinima()) {
	    throw new IdadeException("O jogador " + jogador.getNome() + " não tem idade para a categoria " + categoria.name());
	}
    }

}
