package br.com.targetrust.ed;

/**
 * Classe que representa a pessoa que irá realizar uma consulta.
 * 
 * @author Gilberto Lupatini
 */
public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;

    public Paciente(String nome, String cpf, String telefone) {
	this.nome = nome;
	this.cpf = cpf;
	this.telefone = telefone;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getCpf() {
	return cpf;
    }

    public void setCpf(String cpf) {
	this.cpf = cpf;
    }

    public String getTelefone() {
	return telefone;
    }

    public void setTelefone(String telefone) {
	this.telefone = telefone;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Paciente other = (Paciente) obj;
	if (cpf == null) {
	    if (other.cpf != null)
		return false;
	} else if (!cpf.equals(other.cpf))
	    return false;
	return true;
    }
}
