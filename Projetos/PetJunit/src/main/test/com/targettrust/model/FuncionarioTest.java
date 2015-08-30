package com.targettrust.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe simples de teste para o Modelo Funcionario.
 * 
 * @author Gilberto Lupatini
 */
public class FuncionarioTest {

    Funcionario funcionario;
    
    /**
     * Normalmente o método que deve ser executado antes, chama-se setUp.
     */
    @Before
    public void setUp(){
	funcionario = new Funcionario();
    }

    /**
     * Normalmente o método que deve ser executado antes, chama-se tearDown.
     */
    @After
    public void tearDown(){
	System.out.println("Teste finalizado... Posso usar esse método para liberar conexões, recursos em geral.. :D ");
    }

    /**
     * Testa o cálculo de salário composto pelas horas X valor da hora.
     */
    @Test
    public void testSalario() {
	funcionario.setSalario(180);//horas
	
	float salarioTotal = funcionario.getSalario();
	
	//Salario corresponde as horas trabalhadas (10) * valor hora do funcionario
	double salarioCorreto = (180 * Funcionario.VALOR_HORA);
	Assert.assertEquals(salarioTotal, salarioCorreto , 1);
    }

    
}
