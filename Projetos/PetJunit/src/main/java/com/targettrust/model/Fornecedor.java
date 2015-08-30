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
    public Fornecedor(long parametroCodigo, String parametroIdentificador, String parametroNome, java.sql.Date parametroDataCadastro,
	    java.sql.Date parametroDataNascimento, boolean parametroAtivo, String parametroMaterial) {
	super(parametroCodigo, parametroIdentificador, parametroNome, parametroDataCadastro, parametroDataNascimento);
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
     * @param parametroIdentificador
     *            the identificador to set
     */
    public void setIdentificador(String parametroIdentificador) {
	if (parametroIdentificador != null && validaCNPJ(parametroIdentificador))
	    super.identificador = parametroIdentificador;
	else
	    throw new IllegalArgumentException("CNPJ Invalido");
    }

    private boolean validaCNPJ(String cnpj) {
	//http://www.guj.com.br/java/212033-validar-cnpj
	if (!cnpj.substring(0, 1).equals("")) {
	    try {
		cnpj = cnpj.replace('.', ' ');// onde há ponto coloca espaço
		cnpj = cnpj.replace('/', ' ');// onde há barra coloca espaço
		cnpj = cnpj.replace('-', ' ');// onde há traço coloca espaço
		cnpj = cnpj.replaceAll(" ", "");// retira espaço
		int soma = 0, dig;
		String cnpj_calc = cnpj.substring(0, 12);

		if (cnpj.length() != 14) {
		    return false;
		}
		char[] chr_cnpj = cnpj.toCharArray();
		/* Primeira parte */
		for (int i = 0; i < 4; i++) {
		    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
			soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
		    }
		}
		for (int i = 0; i < 8; i++) {
		    if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9) {
			soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
		    }
		}
		dig = 11 - (soma % 11);
		cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
		/* Segunda parte */
		soma = 0;
		for (int i = 0; i < 5; i++) {
		    if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9) {
			soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
		    }
		}
		for (int i = 0; i < 8; i++) {
		    if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9) {
			soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
		    }
		}
		dig = 11 - (soma % 11);
		cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);
		return cnpj.equals(cnpj_calc);
	    } catch (Exception e) {
		return false;
	    }
	} else {
	    return false;
	}
    }

    @Override
    public String getNome() {
	// TODO Auto-generated method stub
	return "Fornecedor " + this.nome;
    }

    private static int calcularDigito(String str, int[] peso) {
	int soma = 0;
	for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
	    digito = Integer.parseInt(str.substring(indice, indice + 1));
	    soma += digito * peso[peso.length - str.length() + indice];
	}
	soma = 11 - soma % 11;
	return soma > 9 ? 0 : soma;
    }

}
