package com.targettrust.model;


public class Fornecedor extends Pessoa {
	private boolean ativo;
	private String material;

	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param parametroCodigo
	 * @param parametroIdentificador
	 * @param parametroAnimal
	 * @param parametroNome
	 * @param parametroDataCadastro
	 * @param parametroDataNascimento
	 * @param parametroAtivo
	 * @param parametroMaterial
	 */
	public Fornecedor(long parametroCodigo, String parametroIdentificador, String parametroNome,
			java.sql.Date parametroDataCadastro,
			java.sql.Date parametroDataNascimento, boolean parametroAtivo,
			String parametroMaterial) {
		super(parametroCodigo, parametroIdentificador, 
				parametroNome, parametroDataCadastro, parametroDataNascimento);
		this.ativo = parametroAtivo;
		this.material = parametroMaterial;
	}


	/**
	 * @return the ativo
	 */
	public boolean isAtivo() {
		return this.ativo;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return this.material;
	}

	/**
	 * @param parametroAtivo
	 *            the ativo to set
	 */
	public void setAtivo(boolean parametroAtivo) {
		this.ativo = parametroAtivo;
	}

	/**
	 * @param parametroMaterial
	 *            the material to set
	 */
	public void setMaterial(String parametroMaterial) {
		this.material = parametroMaterial;
	}

	
	/**
	 * @param parametroIdentificador the identificador to set
	 */
	public void setIdentificador(String parametroIdentificador) {
		if(validaCNPJ(parametroIdentificador))
			super.identificador = parametroIdentificador;
		else
			System.out.println("CNPJ Invalido");
	}

	
	private boolean validaCNPJ(String parametroIdentificador) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Fornecedor "+this.nome; 
	}
	
	
}
