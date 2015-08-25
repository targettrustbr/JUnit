package br.com.example.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validador de URLs.
 * 
 * @author Gilberto Lupatini
 */
public class UrlValidator {

    public boolean validaUrl(String urlString) {
	Pattern p = Pattern.compile("(http://|https://)(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?");
	Matcher m = p.matcher(urlString);

	return m.matches();
    }
} 
