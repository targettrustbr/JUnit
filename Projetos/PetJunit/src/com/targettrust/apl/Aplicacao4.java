package com.targettrust.apl;

public class Aplicacao4 {

	public static void main(String[] args) {
		Impressora impressoraHP = new Impressora();
		
		impressoraHP.setNomeImpressora("Imressora HP");
		impressoraHP.setLigaIpressora(true);
		impressoraHP.imprimir();
		impressoraHP.enviarImpressao("manualJavaFundamentos.docx");
	}
}
