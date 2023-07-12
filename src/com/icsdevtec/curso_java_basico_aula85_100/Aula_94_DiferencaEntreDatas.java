package com.icsdevtec.curso_java_basico_aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula_94_DiferencaEntreDatas {

	public static void main(String[] args) throws ParseException {

		diferencaDataAteJava7();
		System.out.println("***************************");
		diferencaDataAteJava8();
		System.out.println("***************************");
		diferencaDataAteJava8ComTempo();
		System.out.println("***************************");
		diferencaDataAteJava8ComChronoUnit();

	}

	public static void diferencaDataAteJava7() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date primeiraDt = sdf.parse("01/01/2019");
		Date segundaDt = sdf.parse("01/02/2019");

		long diffEmMil = Math.abs(segundaDt.getTime() - primeiraDt.getTime());

		long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);

		System.out.println(" Diferença entre o periodo da data - moderno " + diff);

		int dias = (int) (diffEmMil / (1000 * 60 * 60 * 24));
		System.out.println(" Diferença entre o periodo da data - legado " + dias);

	}

	// usando API java 8
	public static void diferencaDataAteJava8() {
		LocalDate data1 = LocalDate.of(2019, 01, 01);
		LocalDate data2 = LocalDate.of(2019, 02, 01);

		Period perido = Period.between(data1, data2);
		int dias = perido.getDays();
		int meses = perido.getMonths();
		int year = perido.getYears();
		System.out.println(" diferença em dias " + dias);
		System.out.println(" diferença em meses " + meses);
		System.out.println(" diferença em anos " + year);
		System.out.println(" Periodo " + perido);
	}

	public static void diferencaDataAteJava8ComTempo() {

		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);
		Duration duracao = Duration.between(data1, data2);
		long diff = duracao.toHours();
		System.out.println(" diferença em Horas " + diff);

	}

	public static void diferencaDataAteJava8ComChronoUnit() {

		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 12, 30);
		
		long diff = ChronoUnit.HOURS.between(data1, data2);
		
		long diffDias = ChronoUnit.DAYS.between(data1, data2);
		System.out.println(" diferença em Horas " + diff);
		System.out.println(" diferença em Dias " + diffDias);

	}

}
