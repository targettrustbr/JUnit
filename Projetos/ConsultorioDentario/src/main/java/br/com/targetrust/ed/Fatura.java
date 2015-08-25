package br.com.targetrust.ed;

import java.util.List;

/**
 * Fechamento da Fatura de um paciente.
 * 
 * @author Gilberto Lupatini
 */
public class Fatura {

    private Paciente paciente;
    private List<Procedimento> procedimentos;

    public Paciente getPaciente() {
	return paciente;
    }

    public void setPaciente(Paciente paciente) {
	this.paciente = paciente;
    }

    public List<Procedimento> getProcedimentos() {
	return procedimentos;
    }

    public void setProcedimentos(List<Procedimento> procedimentos) {
	this.procedimentos = procedimentos;
    }

}
