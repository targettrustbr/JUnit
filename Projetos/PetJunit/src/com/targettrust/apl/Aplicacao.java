package com.targettrust.apl;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.Date;

import com.targettrust.model.*;

/**
 * Classe de exemplo do Curso de Fundamentos Java
 * 
 * @author Cássio Trindade
 * @since Maio/2014
 * 
 */
public class Aplicacao {

	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Funcionario funcionario = new Funcionario(1l, "99664488", "João Ninguem de QualquerCoisa",new Date() ,sdf.parse("15/06/1993") , 12f, "Auxiliar");
		Vendedor vendedor = new Vendedor(2l, "4547895158", "Ze Vende Tudo", new Date() ,sdf.parse("15/06/1988"), 9l, "Vendedor", 200l);
		
		imprimeFuncionario(funcionario);
		imprimeVendedor(vendedor);

	}

	public static void imprimeFuncionario(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if (f == null) {
			System.out
					.println("Não existe funcionario para a imprimir relatorio");
		} else {
			System.out.println("Funcionario: " + f.getNome() + " - Identificador: "
					+ f.getIdentificador());
			System.out
					.println("-----------------------------------------------------------");
			System.out.println("Cargo: "+f.getCargo());
			System.out.println("Salario com Hora Fixa: "+f.getSalario());
			System.out.println("Salario com Hora variada: "+f.getSalario(25f));
			System.out.println("Data de Cadastro: "+sdf.format(f.getDataCadastro()));
			System.out.println("Data de Nascimento: "+sdf.format(f.getDataNascimento()));
		}
	}
	
	public static void imprimeVendedor(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if (f == null) {
			System.out
					.println("Não existe funcionario para a imprimir relatorio");
		} else {
			System.out.println("Funcionario: " + f.getNome() + " - Identificador: "
					+ f.getIdentificador());
			System.out
					.println("-----------------------------------------------------------");
			System.out.println("Cargo: "+f.getCargo());
			System.out.println("Salario com Hora variada: "+f.getSalario(25f));
			System.out.println("Salario + Comissão: "+f.getSalario());
			System.out.println("Data de Cadastro: "+sdf.format(f.getDataCadastro()));
			System.out.println("Data de Nascimento: "+sdf.format(f.getDataNascimento()));
		}
	}

}
