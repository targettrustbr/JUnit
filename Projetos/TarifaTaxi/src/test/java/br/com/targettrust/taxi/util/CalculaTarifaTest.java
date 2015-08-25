package br.com.targettrust.taxi.util;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.text.DecimalFormat;

import org.junit.Before;
import org.junit.Test;

/**
 * Testes de Tarifa.
 * 
 * @author Gilberto Lupatini
 */
public class CalculaTarifaTest {

    CalculaTarifa calculaTarifa;
    
    @Before
    public void setUp() throws Exception {
	calculaTarifa = new CalculaTarifa();
    }

    @Test
    public void testCalculaTarifa() {
	Double tarifa = calculaTarifa.calcula(Cidade.PORTO_ALEGRE, 7.8);

	String tarifaFormatada = new DecimalFormat("0.00").format(tarifa);
	assertThat(tarifaFormatada, equalTo("22.15"));
    }

    @Test
    public void testCalculaTarifaManaus() {
	Double tarifa = calculaTarifa.calcula(Cidade.MANAUS, 7.8);

	String tarifaFormatada = new DecimalFormat("0.00").format(tarifa);
	assertThat(tarifaFormatada, equalTo("22.72"));
    }

    @Test
    public void testCalculaTarifaManausBandeira2() {
	//    MANAUS(4.00, 2.40, 2.90);
	Double tarifa = calculaTarifa.calculaBandeira2(Cidade.MANAUS, 7.8);

	String tarifaFormatada = new DecimalFormat("0.00").format(tarifa);
	assertThat(tarifaFormatada, equalTo("26.62"));
    }

}
