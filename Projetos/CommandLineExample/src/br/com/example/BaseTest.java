package br.com.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de teste simples.
 * 
 * @author Gilberto Lupatini
 */
public class BaseTest {

    @Test
    public void testAvailableProcessos() {
	Assert.assertTrue("Não há mais processadores para a execução!", Runtime.getRuntime().availableProcessors() > 0);
    }

    @Test
    public void testFreeMemory() {
	Assert.assertTrue("Não há mais memória disponível para a execução!", Runtime.getRuntime().freeMemory() > 0);
    }
}
