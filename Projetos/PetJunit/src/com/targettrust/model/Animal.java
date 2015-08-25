package com.targettrust.model;

import com.targettrust.valida.ValidacaoException;

/**
 * Classe de exemplo do Curso de Fundamentos Java
 * 
 * @author Cássio Trindade
 * @since Maio/2014
 * 
 */
public class Animal {
	private Especie especie;
	private String apelido;
	private float peso;
	private int altura;
	private boolean vivo;

	public Animal() {
	}

	/**
	 * @param parametroApelido
	 * @param parametroPeso
	 * @param parametroAltura
	 * @param parametroVivo
	 * @param parametroEspecie
	 * @throws ValidacaoException
	 */
	public Animal(String parametroApelido, float parametroPeso,
			int parametroAltura, boolean parametroVivo, Especie parametroEspecie)
			throws ValidacaoException {
		this.apelido = parametroApelido;
		this.setPeso(parametroPeso);
		this.setAltura(parametroAltura);
		this.vivo = parametroVivo;
		this.especie = parametroEspecie;
	}

	/**
	 * @return the apelido
	 */
	public String getApelido() {
		return this.apelido;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return this.peso;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return this.altura;
	}

	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return this.vivo;
	}

	/**
	 * @param parametroApelido
	 *            the apelido to set
	 */
	public void setApelido(String parametroApelido) {
		this.apelido = parametroApelido;
	}

	/**
	 * @param parametroPeso
	 *            the peso to set
	 */
	public void setPeso(float parametroPeso) throws ValidacaoException {
		if (parametroPeso < 0 || parametroPeso > 200)
			throw new ValidacaoException(
					"Peso Invalido tem que estar entre 1 e 200kg");
		this.peso = parametroPeso;

	}

	/**
	 * @param parametroAltura
	 *            the altura to set
	 * @throws ValidacaoException
	 */
	public void setAltura(int parametroAltura) throws ValidacaoException {
		if (parametroAltura < 0)
			throw new ValidacaoException(
					"Altura Invalido, tem que ser maior que 0cm");
		this.altura = parametroAltura;

	}

	/**
	 * @param parametroVivo
	 *            the vivo to set
	 */
	public void setVivo(boolean parametroVivo) {
		this.vivo = parametroVivo;
	}

	/**
	 * @return the especie
	 */
	public Especie getEspecie() {
		return especie;
	}

	/**
	 * @param parametroEspecie
	 *            the especie to set
	 */
	public void setEspecie(Especie parametroEspecie) {
		this.especie = parametroEspecie;
	}

}
