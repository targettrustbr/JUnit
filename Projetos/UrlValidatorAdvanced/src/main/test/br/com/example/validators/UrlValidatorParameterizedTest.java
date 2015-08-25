package br.com.example.validators;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Classe de validação para url com parametrização.
 * 
 * Exemplos de URLs em https://mathiasbynens.be/demo/url-regex
 * 
 * @author Gilberto Lupatini
 */
@RunWith(Parameterized.class)
public class UrlValidatorParameterizedTest {

    UrlValidator urlValidator;

    @Before
    public void setUp(){
	urlValidator = new UrlValidator();
    }

    @Parameters(name= "{index}: isValid({0})={1}")
    public static List<Object[]> getParametros(){
	return Arrays.asList(new Object[][]{
		{"http://google.com", true},
		{"http://www.foo.bar./", false},
		{"h://test.com", false},
		{"https://test.com", true},
		{"http://foo.com/blah", true}
	});
    }

    public String url;
    public boolean valido;

    public UrlValidatorParameterizedTest(String url, boolean valido) {
	this.url = url;
	this.valido = valido;
    }
    
    @Test
    public void testURL() {
	Assert.assertEquals("A URL '" + url + "' está quebrando!", urlValidator.validaUrl(url), valido);
    }

}
