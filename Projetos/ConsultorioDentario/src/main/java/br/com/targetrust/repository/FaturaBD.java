package br.com.targetrust.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.targetrust.ed.Fatura;

/**
 * Simula uma classe de persistencia para fatura.
 * 
 * @author Gilberto Lupatini
 */
public class FaturaBD {

    List<Fatura> faturas = new ArrayList<Fatura>();
    
    public void adicionarFatura(Fatura fatura) {
	faturas.add(fatura);
    }

    public List<Fatura> consultarFaturas() {
	return faturas;
    }
}
