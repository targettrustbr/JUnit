package com.targettrust.model;

import java.sql.Date;

import com.targettrust.model.Pessoa;

public class Cliente extends Pessoa {
	private Animal animal;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return this.animal;
	}

	/**
	 * @param parametroCodigo
	 * @param parametroIdentificador
	 * @param parametroNome
	 * @param parametroDataCadastro
	 * @param parametroDataNascimento
	 * @param parametroAnimal
	 */
	public Cliente(long parametroCodigo, String parametroIdentificador,
			String parametroNome, Date parametroDataCadastro,
			Date parametroDataNascimento, Animal parametroAnimal) {
		super(parametroCodigo, parametroIdentificador, parametroNome,
				parametroDataCadastro, parametroDataNascimento);
		this.animal = parametroAnimal;
	}

	/**
	 * @param parametroAnimal
	 *            the animal to set
	 */
	public void setAnimal(Animal parametroAnimal) {
		this.animal = parametroAnimal;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Cliente "+this.nome; 
	}

}
