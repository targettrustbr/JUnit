package br.com.targetrust.rn;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.targetrust.ed.Paciente;
import br.com.targetrust.service.PacienteRN;

/**
 * Classe de teste para Paciente.
 * 
 * @author Gilberto Lupatini
 */
public class PacienteRNTest {

    private PacienteRN pacienteRN;

    @Before
    public void setUp() {
	pacienteRN = new PacienteRN();
    }

    @Test
    public void testCadastroPaciente() {
	cadastrarPacientes();

	int size = pacienteRN.listaPacientes().size();
	assertTrue("A lista de pacientes tem size: " + size, size == 6);
    }

    @Test
    public void testBuscaPacientePeloNomeSemResultado() {
	cadastrarPacientes();

	List<Paciente> pacientesComEsseNome = pacienteRN.buscaPaciente("João Inácio");
	assertEquals("Paciente não devia estar cadastrado!", 0, pacientesComEsseNome.size());
    }

    @Test
    public void testBuscaPacientePeloNome() {
	cadastrarPacientes();

	List<Paciente> pacientesComEsseNome = pacienteRN.buscaPaciente("Maria");
	List<String> nomesEncontrados = new ArrayList<String>();
	for (Paciente paciente : pacientesComEsseNome) {
	    nomesEncontrados.add(paciente.getNome());
	}

	String[] pacientes = { "Maria Oliveira", "Maria dos Santos" };
	assertArrayEquals(pacientes, nomesEncontrados.toArray());
    }

    @Test
    public void testBuscaPacienteIs() {
	cadastrarPacientes();

	Paciente paciente1 = pacienteRN.listaPacientes().get(1);

	Assert.assertThat(paciente1, is(CoreMatchers.notNullValue()));
    }

    @Test
    public void testBuscaPacienteAny() {
	cadastrarPacientes();

	Paciente paciente1 = pacienteRN.listaPacientes().get(1);
	Assert.assertThat(paciente1, CoreMatchers.any(Paciente.class));
    }

    @Test
    public void testBuscaPacienteAnyOf() {
	cadastrarPacientes();

	Paciente paciente1 = pacienteRN.listaPacientes().get(1);
	Assert.assertThat(paciente1, is(anyOf(nullValue(), instanceOf(Paciente.class))));
    }

    @Test
    public void testBuscaPacienteAllOff() {
	cadastrarPacientes();

	List<Paciente> pacientesComEsseNome = pacienteRN.buscaPaciente("João");
	Paciente paciente1 = pacienteRN.listaPacientes().get(1);

	Assert.assertThat(pacientesComEsseNome.get(0), CoreMatchers.allOf(CoreMatchers.notNullValue(), CoreMatchers.equalTo(paciente1)));
    }

    @Test
    public void testBuscaPacienteIsEqualsTo() {
	cadastrarPacientes();

	List<Paciente> pacientesComEsseNome = pacienteRN.buscaPaciente("Maria Oliveira");

	// assertArrayEquals("Maria Oliveira",
	// pacientesComEsseNome.get(0).getNome());
	Assert.assertThat("Maria Oliveira", is(equalTo(pacientesComEsseNome.get(0).getNome())));
    }

    @Test
    public void testBuscaPacienteEveryItem() {
	cadastrarPacientes();

	List<Paciente> pacientesComEsseNome = pacienteRN.buscaPaciente("Maria");

	List<String> nomesEncontrados = new ArrayList<String>();
	for (Paciente paciente : pacientesComEsseNome) {
	    nomesEncontrados.add(paciente.getNome());
	}

	Assert.assertThat(nomesEncontrados, everyItem(containsString("Maria")));
    }

    @Test
    public void testBuscaPacienteBoth() {
	cadastrarPacientes();

	List<Paciente> pacientesComEsseNome = pacienteRN.buscaPaciente("Fábio");

	List<String> nomesEncontrados = new ArrayList<String>();
	for (Paciente paciente : pacientesComEsseNome) {
	    nomesEncontrados.add(paciente.getNome());
	}

	// Assert.assertThat(nomesEncontrados, is(both(notNullValue())));
    }

    @Test
    public void testBuscaPacienteHasItems() {
	cadastrarPacientes();

	List<Paciente> pacientesComEsseNome = pacienteRN.buscaPaciente("João");

	Assert.assertThat(pacientesComEsseNome, hasItems(pacienteRN.listaPacientes().get(1)));
    }

    /**
     * Utiliário para cadastrar base de dados de teste.
     */
    private void cadastrarPacientes() {
	pacienteRN.cadastrarPaciente(new Paciente("Maria Oliveira", "101.000.000-00", "(51) 9981 9791"));
	pacienteRN.cadastrarPaciente(new Paciente("João da Silva", "010.000.000-00", "(51) 9999 9999"));
	pacienteRN.cadastrarPaciente(new Paciente("Felipe Almeida", "100.000.000-00", "(51) 9991 9991"));
	pacienteRN.cadastrarPaciente(new Paciente("Maria dos Santos", "101.000.000-00", "(51) 9981 9791"));
	pacienteRN.cadastrarPaciente(new Paciente("Fábio Felipe Oliveira", "101.000.000-00", "(51) 9981 9791"));
	pacienteRN.cadastrarPaciente(new Paciente("Fábio Oliveira Ortiz", "101.000.000-00", "(51) 9981 9791"));
    }

}
