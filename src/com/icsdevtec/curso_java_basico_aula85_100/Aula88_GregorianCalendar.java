package com.icsdevtec.curso_java_basico_aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88_GregorianCalendar {

	public static void main(String[] args) {
		Calendar hoje1 = Calendar.getInstance();  //singleton 
		GregorianCalendar hoje = new GregorianCalendar();
		
		imprimirData(hoje);
		
		// bissexto ou não
		System.out.println("\n"+hoje.isLeapYear(2023));
		
		GregorianCalendar hoje2 = new GregorianCalendar(2023,6,4);
		imprimirData(hoje2);

	}
	
	private static void  imprimirData(Calendar hoje) {
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minutos= hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é :%02d/%02d/%d %02d:%02d:%02d",dia, (mes+1),ano,hora,minutos,segundos);
	}

}
