package br.com.targettrust.taxi.rules;

import java.util.Locale;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Criamos um rule para sobrescrever a mensagem de falha ao executar um teste.
 * 
 * @author Gilberto Lupatini
 */
public class LocaleRule implements TestRule {

    Locale localeDefault;

    @Override
    public Statement apply(final Statement base, final Description description) {
	return new Statement() {

	    @Override
	    public void evaluate() throws Throwable {
		localeDefault = Locale.getDefault();

		Locale.setDefault(Locale.ENGLISH);

		try {
		    base.evaluate();
		} catch (Throwable e) {
		    System.out.println("Falha ao executar método:" + description.getMethodName());
		    throw e;

		} finally {
		    Locale.setDefault(localeDefault);
		}
	    }
	};
    }

}
