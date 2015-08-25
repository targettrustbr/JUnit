package br.com.targettrust.taxi.util;

/**
 * Tarifas de taxi.
 * 
 * @author Gilberto Lupatini
 */
public enum Cidade {

    PORTO_ALEGRE(4.52, 2.26, 3.30),
    SAO_PAULO(4.50, 2.75, 3.10),
    MANAUS(4.00, 2.40, 2.90);

    private double bandeirada;
    private double precoBandeira1;
    private double precoBandeira2;
    
    private Cidade(double bandeirada, double precoBandeira1, double precoBandeira2) {
	this.bandeirada = bandeirada;
	this.precoBandeira1 = precoBandeira1;
	this.precoBandeira2 = precoBandeira2;
    }

    public double getBandeirada() {
	return bandeirada;
    }

    public double getPrecoBandeira1() {
	return precoBandeira1;
    }

    public double getPrecoBandeira2(){
	return precoBandeira2;
    }
    
}
