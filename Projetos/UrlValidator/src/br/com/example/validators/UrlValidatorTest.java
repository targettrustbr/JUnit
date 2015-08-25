package br.com.example.validators;

import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de validação para url. Exemplos de URLs em https://mathiasbynens.be/demo/url-regex
 * 
 * @author Gilberto Lupatini
 */
public class UrlValidatorTest {

    UrlValidator urlValidator = new UrlValidator();

    @Test
    public void testGoogle(){
	Assert.assertTrue(urlValidator.validaUrl("http://google.com"));
    }

    @Test
    public void testPontoAntesDaBarra(){
	Assert.assertFalse(urlValidator.validaUrl("http://www.foo.bar./ "));
    }

    @Test
    public void testProtocoloErrado(){
	Assert.assertFalse(urlValidator.validaUrl("h://test.com"));
    }

    @Test
    public void testProtocoloHTTPS(){
	Assert.assertTrue(urlValidator.validaUrl("https://test.com"));
    }

    @Test
    public void testPath(){
	Assert.assertTrue(urlValidator.validaUrl("http://foo.com/blah"));
    }

}
