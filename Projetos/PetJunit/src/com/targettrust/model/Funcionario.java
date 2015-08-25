package com.targettrust.model;

import java.util.Date;

public class Funcionario extends Pessoa {
	protected float salario;
	private final float VALOR_HORA = 15f;
	private String cargo;
	private Funcionario gerente;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param parametroCodigo
	 * @param parametroIdentificador
	 * @param parametroAnimal
	 * @param parametroNome
	 * @param parametroDataCadastro
	 * @param parametroDataNascimento
	 * @param parametroSalario
	 * @param parametroCargo
	 */
	public Funcionario(long parametroCodigo, String parametroIdentificador,String parametroNome,
			Date parametroDataCadastro, Date parametroDataNascimento,
			float parametroSalario, String parametroCargo) {
		super(parametroCodigo, parametroIdentificador, parametroNome, parametroDataCadastro, parametroDataNascimento);
		this.salario = parametroSalario;
		this.cargo = parametroCargo;
	}


	/**
	 * @return the salario
	 */
	public float getSalario() {
		return  this.salario * VALOR_HORA;
	}
	/**
	 * @return the salario
	 * @param valor hora
	 */
	
	public float getSalario(float valorHora) {
		return  this.salario * valorHora;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return this.cargo;
	}

	/**
	 * @return the gerente
	 */
	public Funcionario getGerente() {
		return this.gerente;
	}

	/**
	 * @param parametroSalario
	 *            the salario to set
	 */
	public final void setSalario(float parametroSalario) {
		this.salario = parametroSalario;
	}

	/**
	 * @param parametroCargo
	 *            the cargo to set
	 */
	public void setCargo(String parametroCargo) {
		this.cargo = parametroCargo;
	}

	/**
	 * @param parametroGerente
	 *            the gerente to set
	 */
	public void setGerente(Funcionario parametroGerente) {
		this.gerente = parametroGerente;
	}


	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Funcionário "+this.nome; 
	}

}
