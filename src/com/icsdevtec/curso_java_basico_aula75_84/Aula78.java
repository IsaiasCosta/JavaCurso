package com.icsdevtec.curso_java_basico_aula75_84;

public class Aula78 {

	public static void main(String[] args) {
		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);

		System.out.println("ola equals ola2 = " + ola.equals(ola2)); // false
		System.out.println("ola equals ola3 = " + ola.equals(ola3)); // true
		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2));// true

		System.out.println("ola == ola1 " + (ola == ola2));
		System.out.println("ola == ola3 " + (ola == ola3));

		System.out.println("ola == ola4 " + (ola == ola4));
		System.out.println("ola equals ola4 = " + ola.equals(ola4));

		String banana = "banana";
		String ana = "ana";
		String ban = "ban";

		System.out.println("regionMatches = " + banana.regionMatches(1, ana, 0, 3));
		System.out.println("regionMatches = " + banana.regionMatches(2, ana, 1, 2));
		System.out.println("regionMatches = " + banana.regionMatches(true, 0, ban, 0, 3));

		System.out.println(banana.endsWith(ana));
		System.out.println(banana.endsWith(ban));

		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		// - 1 quando é > b
		// 0 quando é a == b
		//  1 ou >1quando a<b
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo));

	}

}
