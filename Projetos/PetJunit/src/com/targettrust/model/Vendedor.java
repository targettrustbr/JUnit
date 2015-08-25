package com.targettrust.model;

import java.util.Date;

public class Vendedor extends Funcionario {
	private float comissao;

	/**
	 * @return the comissao
	 */
	
	public Vendedor() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param parametroCodigo
	 * @param parametroIdentificador
	 * @param parametroNome
	 * @param parametroDataCadastro
	 * @param parametroDataNascimento
	 * @param parametroSalario
	 * @param parametroCargo
	 * @param parametroComissao
	 */
	public Vendedor(long parametroCodigo, String parametroIdentificador,
			String parametroNome, Date parametroDataCadastro,
			Date parametroDataNascimento, float parametroSalario,
			String parametroCargo, float parametroComissao) {
		super(parametroCodigo, parametroIdentificador, parametroNome,
				parametroDataCadastro, parametroDataNascimento,
				parametroSalario, parametroCargo);
		this.comissao = parametroComissao;
	}



	public float getComissao() {
		return comissao;
	}

	/**
	 * @param parametroComissao the comissao to set
	 */
	public void setComissao(float parametroComissao) {
		this.comissao = parametroComissao;
	}

	public float getSalario() {
	float salario =	super.getSalario() + getComissao();
		return salario;
		
	}
	
    public float calcularSalario() {
        float total = salario + comissao;
        return total;
    }
}
