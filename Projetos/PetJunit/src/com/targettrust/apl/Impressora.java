package com.targettrust.apl;

import com.targettrust.impl.filaImpressao;

public class Impressora implements filaImpressao{

	private String nomeImpressora;
	private boolean ligaIpressora;
	
	
	@Override
	public boolean imprimir() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public void enviarImpressao(String parametroDoc) {
		System.out.println("enviado para a impressora "+this.getNomeImpressora()+ " o documento " + parametroDoc);
	}

	@Override
	public void parar() {
		System.out.println("Impressao Parada");
		
	}

	@Override
	public boolean remover(String parametroDoc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void refresh() {
		System.out.println("Impressao Atualizada");
		
	}

	@Override
	public void pausa() {
		System.out.println("Impressao Pausada");
		
	}

	/**
	 * @return the nomeImpressora
	 */
	public String getNomeImpressora() {
		return nomeImpressora;
	}

	/**
	 * @param parametroNomeImpressora the nomeImpressora to set
	 */
	public void setNomeImpressora(String parametroNomeImpressora) {
		this.nomeImpressora = parametroNomeImpressora;
	}

	/**
	 * @return the ligaIpressora
	 */
	public boolean isLigaIpressora() {
		return ligaIpressora;
	}

	/**
	 * @param parametroLigaIpressora the ligaIpressora to set
	 */
	public void setLigaIpressora(boolean parametroLigaIpressora) {
		this.ligaIpressora = parametroLigaIpressora;
	}



}
