package com.targettrust.servico;

import java.util.ArrayList;
import java.util.List;

import com.targettrust.model.Animal;
import com.targettrust.model.Especie;
import com.targettrust.repositorio.AnimalDAO;

public class AnimalRN {

    AnimalDAO animalDAO;
    
    public void setAnimalDAO(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }
    
    public Animal consultarAnimalPeloApelido(String apelidoDoAnimal){
	return animalDAO.consultarAnimalPeloNome(apelidoDoAnimal);
    }

    public boolean validarEspecieDoAnimal(String apelidoDoAnimal, Especie especieEsperada){
	Animal animalPeloNome = animalDAO.consultarAnimalPeloNome(apelidoDoAnimal);
	
	//Teste se a espécie corresponde
	if(especieEsperada.equals(animalPeloNome.getEspecie())){
	    return true;
	}
	
	return false;
    }

    public List<Animal> listarAnimaisPorEspecie(Especie especie) {
	
	//Lista todos os animais.
	List<Animal> todosOsAnimais = animalDAO.listarAnimaisCadastrados();
	
	//Cria uma lista para colocar os animais da especie
	List<Animal> animaisDaEspecie = new ArrayList<Animal>();

	//Verifica cada animal e adiciona os da espécie.
	for (Animal animal : todosOsAnimais) {
	    if(especie.equals(animal.getEspecie())){
		animaisDaEspecie.add(animal);
	    }
	}
	
	//Retorna os animais da espécie
	return animaisDaEspecie;
    }

}
