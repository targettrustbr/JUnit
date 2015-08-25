package br.com.targetrust.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.targetrust.ed.Paciente;

/**
 * Simula uma classe de persistencia para paciente.
 * 
 * @author Gilberto Lupatini
 */
public class PacienteBD {

	private List<Paciente> pacientes = new ArrayList<Paciente>();
	
	public List<Paciente> listaPacientes() {
		return pacientes;
	}

	public void adicionaPaciente(Paciente paciente) {
		pacientes.add(paciente);
	}

	public void removePaciente(Paciente paciente) {
		pacientes.remove(paciente);
	}
}
