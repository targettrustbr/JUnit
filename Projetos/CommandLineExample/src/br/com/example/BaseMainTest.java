package br.com.example;


/**
 * Classe Main para execução via linha de Comando. Para executar use:
 * 
 * java -cp "lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:bin/" BaseMainTest
 * 
 * @author Gilberto Lupatini
 */
public class BaseMainTest {

	public static void main(String[] args) {
		executaBaseTest();
	}

	private static void executaBaseTest() {
		org.junit.runner.JUnitCore.main("br.com.example.BaseTest");
	}

}
