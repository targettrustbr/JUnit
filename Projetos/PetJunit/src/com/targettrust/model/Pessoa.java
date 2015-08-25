package com.targettrust.model;

import java.util.Date;

import com.targettrust.valida.ValidacaoException;

/**
 * Classe de exemplo do Curso de Fundamentos Java
 * 
 * @author Cássio Trindade
 * @since Maio/2014
 * 
 * 
 */
public abstract class Pessoa  {
	private long codigo;
	protected String identificador;
	protected String nome;
	private Date dataCadastro;
	private Date dataNascimento;
	private Animal animal;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parametroCodigo
	 * @param parametroIdentificador
	 * @param parametroAnimal
	 * @param parametroNome
	 * @param parametroDataCadastro
	 * @param parametroDataNascimento
	 */
	public Pessoa(long parametroCodigo, String parametroIdentificador,
			String parametroNome, Date parametroDataCadastro,
			Date parametroDataNascimento) {
		this.codigo = parametroCodigo;
		this.identificador = parametroIdentificador;
		this.nome = parametroNome;
		this.dataCadastro = parametroDataCadastro;
		this.dataNascimento = parametroDataNascimento;
	}

	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return this.identificador;
	}

	/**
	 * @return the nome
	 */
	public abstract String getNome();

	/**
	 * @param parametroIdentificador
	 *            the identificador to set
	 */
	public void setIdentificador(String parametroIdentificador) {
		this.identificador = parametroIdentificador;
	}

	/**
	 * @param parametroNome
	 *            the nome to set
	 */
	public void setNome(String parametroNome) {
		this.nome = parametroNome;
	}

	/**
	 * @param parametroAnimal
	 *            the animal to set
	 * @throws ValidacaoException
	 */
	public void setAnimal(Animal parametroAnimal) throws ValidacaoException {
		if (parametroAnimal == null)
			throw new ValidacaoException("Não existe animal para essa pessoa");
		this.animal = parametroAnimal;
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param parametroCodigo
	 *            the codigo to set
	 */
	public void setCodigo(long parametroCodigo) {
		this.codigo = parametroCodigo;
	}

	/**
	 * @return the dataCadastro
	 */
	public Date getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param parametroDataCadastro
	 *            the dataCadastro to set
	 */
	public void setDataCadastro(Date parametroDataCadastro) {
		this.dataCadastro = parametroDataCadastro;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param parametroDataNascimento
	 *            the dataNascimento to set
	 */
	public void setDataNascimento(Date parametroDataNascimento) {
		this.dataNascimento = parametroDataNascimento;
	}
	
	public Animal getAnimal() {
	    return animal;
	}
}
