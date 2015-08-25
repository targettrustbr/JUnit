package br.com.targetrust.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.targetrust.ed.Consulta;

/**
 * Simula uma classe de persistencia para consulta.
 * 
 * @author Gilberto Lupatini
 */
public class ConsultaBD {

	private List<Consulta> consultas = new ArrayList<Consulta>();
	
	public List<Consulta> listaConsultasAgendadas() {
		return consultas;
	}

	public void adicionaAgendamento(Consulta consulta) {
		consultas.add(consulta);
	}

	public void removeAgendamento(Consulta consulta) {
		consultas.remove(consulta);
	}
}
