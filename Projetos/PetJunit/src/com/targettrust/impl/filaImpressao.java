package com.targettrust.impl;

public interface filaImpressao {
	public boolean imprimir();
	public void enviarImpressao(String doc);
	public void parar();
	public boolean remover(String doc);
	public void refresh();
	public void pausa();
}
