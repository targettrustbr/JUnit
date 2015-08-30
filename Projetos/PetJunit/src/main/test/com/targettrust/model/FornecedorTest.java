package com.targettrust.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe de testes para o Forneceder.
 * Exemplos de tratamento de exception com JUnit.
 * 
 * Para gerar CNPJ válidos use http://www.geradorcnpj.com/
 * @author Gilberto Lupatini
 */
public class FornecedorTest {
    
    Fornecedor fornecedor;

    @Before
    public void setUp() throws Exception {
	fornecedor = new Fornecedor();
    }

    @Test
    public void test() {
	String cnpj = "39.270.367/0001-60";
	fornecedor.setIdentificador(cnpj);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testCnpjNulo() {
	String cnpj = "1010101";
	fornecedor.setIdentificador(cnpj);
    }
    
    @Test
    public void testCnpjNuloTestandoMensagem() {
	try {
	    fornecedor.setIdentificador("1010101");
	    //Não pode passar com esse CNPJ
	    Assert.fail("CNPJ devia ser inválido");
	} catch (IllegalArgumentException e) {
	    //Teste se a mensagem corresponde também
	    Assert.assertTrue("Mensagem do erro: Teste de CNPJ falhou", e.getMessage().equals("CNPJ Invalido"));
	}

    }

}
