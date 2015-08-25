package br.com.canajo.service;

import java.util.Calendar;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import br.com.canajo.enums.Categoria;
import br.com.canajo.exception.IdadeException;
import br.com.canajo.exception.RegistroJaCadastrado;

/**
 * Classe de testes do JogadorRN.
 * 
 * @author Gilberto Lupatini
 */
public class JogadorRNTest {

    JogadorRN jogadorRN;

    @Before
    public void setUp() throws Exception {
	jogadorRN = new JogadorRN();
    }

    @Test
    public void testCadastrarJogadorOk() throws IdadeException, RegistroJaCadastrado {
	Calendar nascimento = new DateTime(2003, 02, 10, 0, 0).toGregorianCalendar();
	jogadorRN.cadastrarJogador("João da Silva", "Maria da Silva", nascimento , Categoria.SUB12);
    }

    @Test(expected=RegistroJaCadastrado.class)
    public void testCadastrarJogadorDuplicado() throws IdadeException, RegistroJaCadastrado {
	Calendar nascimento = new DateTime(2003, 02, 10, 0, 0).toGregorianCalendar();
	jogadorRN.cadastrarJogador("João da Silva", "Maria da Silva", nascimento , Categoria.SUB12);
    }

    @Test(expected=IdadeException.class)
    public void testCadastrarJogadorIdadeInvalida() throws IdadeException, RegistroJaCadastrado {
	Calendar nascimento = new DateTime(2003, 02, 10, 0, 0).toGregorianCalendar();
	jogadorRN.cadastrarJogador("João da Silva", "Maria da Silva", nascimento , Categoria.SUB17);
    }

}
