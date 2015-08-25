package com.targettrust.model;

import java.util.Date;

public class Consulta {
	private Animal animal;
	private Date dataConsulta;
	private Boolean cancelada;
	private Float preco;

	public Consulta() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param parametroAnimal
	 * @param parametroDataConsulta
	 * @param parametroCancelada
	 * @param parametroPreco
	 */
	public Consulta(Animal parametroAnimal, Date parametroDataConsulta,
			Boolean parametroCancelada, Float parametroPreco) {
		this.animal = parametroAnimal;
		this.dataConsulta = parametroDataConsulta;
		this.cancelada = parametroCancelada;
		this.preco = parametroPreco;
	}


	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return this.animal;
	}

	/**
	 * @return the dataConsulta
	 */
	public Date getDataConsulta() {
		return this.dataConsulta;
	}

	/**
	 * @return the cancelada
	 */
	public Boolean getCancelada() {
		return this.cancelada;
	}

	/**
	 * @param parametroAnimal
	 *            the animal to set
	 */
	public void setAnimal(Animal parametroAnimal) {
		this.animal = parametroAnimal;
	}

	/**
	 * @param parametroDataConsulta
	 *            the dataConsulta to set
	 */
	public void setDataConsulta(Date parametroDataConsulta) {
		this.dataConsulta = parametroDataConsulta;
	}

	/**
	 * @param parametroCancelada
	 *            the cancelada to set
	 */
	public void setCancelada(Boolean parametroCancelada) {
		this.cancelada = parametroCancelada;
	}

	/**
	 * @return the preco
	 */
	public Float getPreco() {
		return this.preco;
	}

	/**
	 * @param parametroPreco the preco to set
	 */
	public void setPreco(Float parametroPreco) {
		this.preco = parametroPreco;
	}


}
