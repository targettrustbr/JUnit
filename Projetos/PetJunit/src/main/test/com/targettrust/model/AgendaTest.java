package com.targettrust.model;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe de teste para o Modelo Agenda.
 * Exemplos de Utilizando Matchers.
 * 
 * @author Gilberto Lupatini
 */
public class AgendaTest {

    Agenda agenda;
    
    Animal animalExemplo;
    
    @Before
    public void setUp() throws Exception {
	agenda = new Agenda();
	animalExemplo = new Animal("Ruff", 30, 45, true, Especie.Mamíferos);
    }

    @Test
    public void testIncluiAgendaSeEhDiferenteDeNull() {
	Consulta consultaInclusao = new Consulta(animalExemplo, new Date(), false, 70F);
	agenda.incluiAgenda(consultaInclusao);
	
	//X notNullValue() tenta deixar mais semântico o teste
	Assert.assertThat(agenda.getConsultas(), CoreMatchers.notNullValue());
    }

    @Test
    public void testIncluiAgendaSeEhOMesmoObjeto() {
	Consulta consultaInclusao = new Consulta(animalExemplo, new Date(), false, 70F);
	agenda.incluiAgenda(consultaInclusao);
	
	//X is(equalsTo( Y )) tenta deixar mais semântico o teste
	Assert.assertThat(agenda.getConsultas().get(0), CoreMatchers.is(CoreMatchers.equalTo(consultaInclusao)));
    }

    @Test
    public void testIncluiAgendaSeEhOMesmoObjetoComIS() {
	Consulta consultaInclusao = new Consulta(animalExemplo, new Date(), false, 70F);
	agenda.incluiAgenda(consultaInclusao);
	
	//IS também faz comparações diretas
	Assert.assertThat(agenda.getConsultas().get(0), CoreMatchers.is(consultaInclusao));
    }

    @Test
    public void testIncluiAgendaMultiplosTestesEmUm() {
	Consulta consultaInclusao = new Consulta(animalExemplo, new Date(), false, 70F);
	agenda.incluiAgenda(consultaInclusao);
	
	//com allOf podemos testar vários critérios ao mesmo tempo ( funciona como um AND)
	Assert.assertThat(agenda.getConsultas().get(0), CoreMatchers.allOf(CoreMatchers.notNullValue(), CoreMatchers.is(consultaInclusao)));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testIncluiAgendaMultiplosQualquerUmValido() {
	Consulta consultaInclusao = new Consulta(animalExemplo, new Date(), false, 70F);
	agenda.incluiAgenda(consultaInclusao);
	
	//o anyOf é uma espécie de OR (neste caso nullValue é falso, mas o segundo critério é verdadeiro)
	Assert.assertThat(agenda.getConsultas().get(0), CoreMatchers.anyOf(CoreMatchers.nullValue(), CoreMatchers.is(consultaInclusao)));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testIncluiAgendaAninhados() {
	Consulta consultaInclusao = new Consulta(animalExemplo, new Date(), false, 70F);
	agenda.incluiAgenda(consultaInclusao);
	
	//multiplos níveis são permitidos. Os Matchers foram projetados para serem usados assim.
	Assert.assertThat(agenda.getConsultas().get(0).getAnimal().getEspecie(),
		CoreMatchers.anyOf(
			CoreMatchers.is(CoreMatchers.nullValue()),
			CoreMatchers.is(consultaInclusao.getAnimal().getEspecie()),
			CoreMatchers.allOf(
				CoreMatchers.any(Especie.class),
				CoreMatchers.notNullValue(),
				CoreMatchers.is(consultaInclusao.getAnimal().getEspecie()))));
    }

}
