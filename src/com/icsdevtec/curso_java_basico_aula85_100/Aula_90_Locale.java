package com.icsdevtec.curso_java_basico_aula85_100;

import java.text.NumberFormat;
import java.util.Locale;


public class Aula_90_Locale {

	public static void main(String[] args) {
  	
		//dd/MM/yyyy
		//MM/dd/yyyy
		//1.000,02 = brasil
		//1,000.02 = eua
		
		
		Locale locale =  Locale.getDefault();
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		
		for (Locale loc : locales) {
		
			System.out.println("Nome do Locale : " + loc.getDisplayName());
			System.out.println("Codigo da lingua:  " + loc.getLanguage());
			System.out.println("Lingua : " + loc.getDisplayLanguage());
			System.out.println("Cod País :"+loc.getCountry());
			System.out.println("País : "+loc.getDisplayCountry());
			System.out.println("=================================");
		}
		
		Locale br = new Locale("pt","Brazil");
		
		System.out.println(br);
		
		
		Locale.setDefault(br);
		System.out.println(locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(600000000000d));
		
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(600000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(nf2.format(600000000000d));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(br);
		System.out.println(nf3.format(600000000000d));
	}

}
