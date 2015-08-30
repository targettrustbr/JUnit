package com.targettrust.repositorio;

import java.util.List;

import com.targettrust.model.Animal;

/**
 * Simula um DAO para teste de MOCK.
 * 
 * @author Gilberto Lupatini
 */
public interface AnimalDAO {

    public Animal consultarAnimalPeloNome(String nome);

    public List<Animal> listarAnimaisCadastrados();
}
