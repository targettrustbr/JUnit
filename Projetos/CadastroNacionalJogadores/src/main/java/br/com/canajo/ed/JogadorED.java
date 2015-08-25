package br.com.canajo.ed;

import java.io.Serializable;
import java.util.Calendar;

import br.com.canajo.enums.Categoria;

/**
 * Representa um Jogador.
 */
public class JogadorED implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Nome do Jogador.
     */
    private String nome;

    /**
     * Nome da Mãe do Jogador.
     */
    private String nomeMae;

    /**
     * Data de nascimento para verificar a idade e compatibilidade com a
     * categoria.
     */
    private Calendar nascimento;

    /**
     * Categoria atual do jogador.
     */
    private Categoria categoria;

    /**
     * Está com contrato vigente.
     */
    private boolean contratado;

    /**
     * Indica que o jogador está contratado mas está lesionado.
     */
    private boolean departamentoMedico;

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Calendar getNascimento() {
	return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
	this.nascimento = nascimento;
    }

    public Categoria getCategoria() {
	return categoria;
    }

    public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
    }

    public boolean isContratado() {
	return contratado;
    }

    public void setContratado(boolean contratado) {
	this.contratado = contratado;
    }

    public boolean isDepartamentoMedico() {
	return departamentoMedico;
    }

    public void setDepartamentoMedico(boolean departamentoMedico) {
	this.departamentoMedico = departamentoMedico;
    }

    public String getNomeMae() {
	return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
	this.nomeMae = nomeMae;
    }

}
