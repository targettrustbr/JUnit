package br.com.targettrust.taxi.util;

/**
 * Classe de cálculo de tarifa de taxi.
 * 
 * @author Gilberto Lupatini
 */
public class CalculaTarifa {

    public double calcula(Cidade cidade, double distanciaEmKm){
	double precoBandeira = cidade.getPrecoBandeira1();
	return calculaInternal(cidade, distanciaEmKm, precoBandeira);
    }

    public Double calculaBandeira2(Cidade cidade, double distanciaEmKm) {
	double precoBandeira = cidade.getPrecoBandeira2();
	return calculaInternal(cidade, distanciaEmKm, precoBandeira);
    }

    private double calculaInternal(Cidade cidade, double distanciaEmKm, double precoBandeira) {
	double bandeirada = cidade.getBandeirada();
	return bandeirada + (distanciaEmKm * precoBandeira);
    }
}
