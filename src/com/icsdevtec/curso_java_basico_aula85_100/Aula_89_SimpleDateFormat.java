package com.icsdevtec.curso_java_basico_aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

import com.icsdevtec.curso_java_basico_aula54.Data;

public class Aula_89_SimpleDateFormat {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy- HH:mm:ss a z");
		Calendar data = new GregorianCalendar(2022,3,15,16,35,45);
		System.out.println(sdf.format(data.getTime()));
		
		
		Date hoje = new Date();
		
		System.out.println(sdf.format(hoje));
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		
		String minhaData = "20/02/2023";
		try {
			Date minhaDataEmDate =sdf1.parse(minhaData);
			System.out.println(minhaDataEmDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(minhaData);
	}

}
