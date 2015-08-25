package br.com.targetrust.service;

import java.util.List;

import br.com.targetrust.ed.Consulta;
import br.com.targetrust.ed.Fatura;
import br.com.targetrust.ed.Paciente;
import br.com.targetrust.ed.Procedimento;
import br.com.targetrust.repository.FaturaBD;

/**
 * Classe que agrupa as regras de negócio (RN) para a Fatura.
 * 
 * @author Gilberto Lupatini
 */
public class FaturaRN {

    /**
     * Instancia outra classe responsável por gerenciar os dados das faturas.
     */
    FaturaBD faturaBD = new FaturaBD();

    public Fatura abreFatura(Consulta consulta) {

	if (consulta == null || consulta.getPaciente() == null) {
	    throw new RuntimeException("Paciente deve ser informado!");
	}

	Fatura fatura = new Fatura();
	fatura.setPaciente(consulta.getPaciente());
	faturaBD.adicionarFatura(fatura);
	return fatura;
    }

    public double fechaFatura(Consulta consulta) {

	List<Fatura> faturas = faturaBD.consultarFaturas();

	double valorTotal = 0;
	for (Fatura fatura : faturas) {
	    if (fatura.getPaciente().equals(consulta.getPaciente())) {
		List<Procedimento> procedimentos = fatura.getProcedimentos();

		if (procedimentos == null) {
		    continue;
		}

		for (Procedimento procedimento : procedimentos) {
		    if (!procedimento.isPago()) {
			valorTotal += procedimento.getValor();
		    }
		}
	    }
	}

	return valorTotal;
    }

    public void pagarComCartao(Paciente paciente) {

	List<Fatura> faturas = faturaBD.consultarFaturas();

	for (Fatura fatura : faturas) {
	    if (fatura.getPaciente().equals(paciente)) {
		List<Procedimento> procedimentos = fatura.getProcedimentos();

		if (procedimentos == null) {
		    continue;
		}

		for (Procedimento procedimento : procedimentos) {
		    procedimento.setPago(true);
		}
	    }
	}

    }

}