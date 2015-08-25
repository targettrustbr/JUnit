package br.com.targetrust.service;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.targetrust.ed.Consulta;
import br.com.targetrust.ed.Fatura;
import br.com.targetrust.ed.Paciente;
import br.com.targetrust.ed.Procedimento;

/**
 * Classe de teste para Fatura.
 * 
 * @author Gilberto Lupatini
 */
public class FaturaRNTest {

    FaturaRN faturaRN;

    @Before
    public void setUp() throws Exception {
	faturaRN = new FaturaRN();
    }

    @Test
    public void testAbrirFatura() {
	Fatura fatura = abreFatura(new Consulta());
	assertThat(fatura, is(notNullValue()));
    }

    @Test(expected = Exception.class)
    public void testAbrirFaturaSemPaciente() {
	Consulta consulta = new Consulta();
	Fatura fatura = faturaRN.abreFatura(consulta);

	assertThat(fatura, is(notNullValue()));
    }

    @Test
    public void testFechaFatura() {
	Consulta consulta = new Consulta();
	Fatura fatura = abreFatura(consulta);
	faturaRN.fechaFatura(consulta);
    }

    @Test
    public void testeFechaFaturaFormaPagamentoCartao() {
	Consulta consulta = new Consulta();
	Fatura fatura = abreFatura(consulta);
	double valorTotal = faturaRN.fechaFatura(consulta);
	faturaRN.pagarComCartao(consulta.getPaciente());

	assertThat(faturaRN.fechaFatura(consulta), allOf(notNullValue(), equalTo(0d)));
    }

    @Test
    public void validaPrimitivo() {
	assertThat(2, anyOf(equalTo(1), equalTo(2), equalTo(3)));
    }

    @Test
    public void validaPrimitivoNot() {
	assertThat(4, not(anyOf(equalTo(1), equalTo(2), equalTo(3))));
    }

    private Fatura abreFatura(Consulta consulta) {
	Paciente paciente = new Paciente("João Paulo", "000.000.000-01", "(51) 9999 9999");
	consulta.setPaciente(paciente);
	Fatura fatura = faturaRN.abreFatura(consulta);

	List<Procedimento> procedimentos = new ArrayList<Procedimento>();

	procedimentos.add(new Procedimento("Anestesia", 100.00));

	fatura.setProcedimentos(procedimentos);

	return fatura;
    }

}
