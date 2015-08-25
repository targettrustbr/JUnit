package br.com.targetrust.ed;

import java.util.Calendar;

/**
 * Classe que representa um marcação de consulta.
 * 
 * @author Gilberto Lupatini
 */
public class Consulta {

    private Paciente paciente;
    private Calendar dataInicio;
    private Calendar dataFim;

    public Paciente getPaciente() {
	return paciente;
    }

    public void setPaciente(Paciente paciente) {
	this.paciente = paciente;
    }

    public Calendar getDataInicio() {
	return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
	this.dataInicio = dataInicio;
    }

    public Calendar getDataFim() {
	return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
	this.dataFim = dataFim;
    }

}
