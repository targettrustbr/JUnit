package br.com.targetrust.service;

import java.util.ArrayList;
import java.util.List;

import br.com.targetrust.ed.Paciente;
import br.com.targetrust.repository.PacienteBD;

/**
 * Classe que agrupa as regras de negócio (RN) para o Paciente.
 * 
 * @author Gilberto Lupatini
 */
public class PacienteRN {

    /**
     * Instancia outra classe responsável por gerenciar os dados dos pacientes.
     */
    PacienteBD pacienteBD = new PacienteBD();

    /**
     * Busca pacientes pela particula informada.
     */
    public List<Paciente> buscaPaciente(String nome) {

	List<Paciente> todosOsPacientes = pacienteBD.listaPacientes();

	List<Paciente> pacientesEncontrados = new ArrayList<Paciente>();

	for (Paciente paciente : todosOsPacientes) {
	    if (paciente.getNome().contains(nome)) {
		pacientesEncontrados.add(paciente);
	    }
	}

	return pacientesEncontrados;
    }

    /**
     * Insere um novo paciente na base.
     */
    public void cadastrarPaciente(Paciente paciente) {
	pacienteBD.adicionaPaciente(paciente);
    }

    /**
     * Retorna todos os pacientes.
     */
    public List<Paciente> listaPacientes() {
	return pacienteBD.listaPacientes();
    }
}
