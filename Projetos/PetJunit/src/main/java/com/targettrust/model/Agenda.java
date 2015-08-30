package com.targettrust.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Consulta> consultas;

    public Agenda() {
	consultas = new ArrayList<>();
    }

    public void incluiAgenda(Consulta c) {
	if(c.getAnimal() == null){
	    throw new IllegalArgumentException("Animal deve ser informado para um consulta");
	}
	
	if (consultas.size() < 5) {
	    consultas.add(c);
	    System.out.println("Adicionado a Consulta para: " + c.getAnimal().getApelido());
	} else
	    System.out.println("**----------Consultas atingiram o limite de 5 datas");
    }

    public Consulta consultarPorApelido(String apelido) {

	if(apelido == null){
	    throw new IllegalArgumentException("Apelido deve ser informado.");
	}

	for (Consulta consulta : consultas) {
	    if(consulta != null && consulta.getAnimal() != null){
		if(apelido.equals(consulta.getAnimal().getApelido())){
		    return consulta;
		}
	    }
	}
	
	return null;
    }

    /**
     * @return the consultas
     */
    public ArrayList<Consulta> getConsultas() {
	return this.consultas;
    }

    /**
     * @param parametroConsultas
     *            the consultas to set
     */
    public void setConsultas(ArrayList<Consulta> parametroConsultas) {
	this.consultas = parametroConsultas;

    }

    public void listaConsultas() {

	StringBuilder sb = new StringBuilder();
	float soma = 0f;
	Animal animal;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
	System.out.println("Relatório de Consultas_________________________________");
	for (Consulta c : consultas) {
	    animal = c.getAnimal();
	    sb.append(animal.getApelido() + " -- " + animal.getEspecie() + "\n" + "\t Data:" + sdf.format(c.getDataConsulta()) + "\n");
	    soma += c.getPreco();
	}
	sb.append("\n_________________________________\n");
	sb.append("Total de Consultas:" + consultas.size() + " no valor de: " + soma);

	System.out.println(sb);
    }

}
