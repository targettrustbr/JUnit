package com.targettrust.apl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.targettrust.model.Agenda;
import com.targettrust.model.Animal;
import com.targettrust.model.Consulta;
import com.targettrust.model.Especie;
import com.targettrust.valida.ValidacaoException;

public class Aplicacao3 {

	public static void main(String[] args) throws ParseException,
			ValidacaoException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		try {

			Animal cao = new Animal("Rex", 45f, -120, true, Especie.Mamíferos);
			Animal gato = new Animal("Draco", 45f, 120, true, Especie.Mamíferos);
			Animal cao1 = new Animal("Byte", 45f, 120, true, Especie.Mamíferos);

			Consulta con1 = new Consulta(cao, sdf.parse("14/06/2014 10:00"),
					false, 150f);
			Consulta con2 = new Consulta(cao, sdf.parse("21/06/2014 08:30"),
					false, 150f);
			Consulta con3 = new Consulta(cao1, sdf.parse("18/06/2014 11:00"),
					false, 150f);
			Consulta con4 = new Consulta(gato, sdf.parse("21/06/2014 10:00"),
					false, 150f);
			Consulta con5 = new Consulta(gato, sdf.parse("12/06/2014 09:00"),
					false, 150f);
			Consulta con6 = new Consulta(cao1, sdf.parse("21/06/2014 10:00"),
					false, 150f);

			Agenda a = new Agenda();

			a.incluiAgenda(con1);
			a.incluiAgenda(con2);
			a.incluiAgenda(con3);
			a.incluiAgenda(con4);
			a.incluiAgenda(con5);
			a.incluiAgenda(con6);

			a.listaConsultas();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
