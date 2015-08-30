package com.targettrust.servico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.targettrust.model.Animal;
import com.targettrust.model.Especie;
import com.targettrust.repositorio.AnimalDAO;
import com.targettrust.valida.ValidacaoException;

@RunWith(MockitoJUnitRunner.class)
public class AnimalRNTest {

    AnimalRN animalRN;
    
    @Mock
    AnimalDAO animalDAOMock;
    
    @Before
    public void setUp() throws Exception {
	animalRN = new AnimalRN();
	animalRN.setAnimalDAO(animalDAOMock);
    }

    @Test
    public void testExemploBasicoComMockito() throws ValidacaoException {
	//Crio um animal exemplo
	Animal cachorroMeg = new Animal("Meg", 10, 14, true, Especie.Mamíferos);

	//Digo ao mockito que quando eu chamar o DAO, passando o cachorro MEG, retorne o animal de exemplo criado.
	Mockito.when(animalDAOMock.consultarAnimalPeloNome("Meg")).thenReturn(cachorroMeg);

	//Faço a busca pelo nome para testar o funcionamento do mockito.
	Animal animalConsultado = animalRN.consultarAnimalPeloApelido("Meg");
	
	Assert.assertEquals(cachorroMeg.getApelido(), animalConsultado.getApelido());
    }

    @Test
    public void testValidaEspecie() throws ValidacaoException {
	//Crio um réptil exemplo
	Animal rex = new Animal("Rex", 10, 14, true, Especie.Répteis);

	//Digo ao mockito que quando eu chamar o DAO, passando o Rex, retorne o animal de exemplo criado.
	Mockito.when(animalDAOMock.consultarAnimalPeloNome("Rex")).thenReturn(rex);

	//Quero validar se a espécie está correta
	Assert.assertTrue("Espécie Incorreta", animalRN.validarEspecieDoAnimal("Rex", Especie.Répteis));
    }

    @Test
    public void testValidaEspecieInvalida() throws ValidacaoException {

	//Crio um réptil exemplo
	Animal bob = new Animal("Bob", 10, 14, true, Especie.Mamíferos);

	//Digo ao mockito que quando eu chamar o DAO, passando o Bob, retorne o animal de exemplo criado.
	Mockito.when(animalDAOMock.consultarAnimalPeloNome("Bob")).thenReturn(bob);

	//Quero validar se a espécie está correta
	Assert.assertFalse("A deveria apontar a Espécie como Incorreta", animalRN.validarEspecieDoAnimal("Bob", Especie.Aves));
    }
}