package br.com.targetrust.ed;

/**
 * Classe que representa os procedimentos realizados durante uma consulta.
 * 
 * @author Gilberto Lupatini
 */
public class Procedimento {

    private String descricao;
    private double valor;
    private boolean pago;

    public Procedimento() {
	super();
    }

    public Procedimento(String descricao, double valor) {
	super();
	this.descricao = descricao;
	this.valor = valor;
    }

    public String getDescricao() {
	return descricao;
    }

    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }

    public double getValor() {
	return valor;
    }

    public void setValor(double valor) {
	this.valor = valor;
    }

    public boolean isPago() {
	return pago;
    }

    public void setPago(boolean pago) {
	this.pago = pago;
    }

}
