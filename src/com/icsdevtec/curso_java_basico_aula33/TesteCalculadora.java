package com.icsdevtec.curso_java_basico_aula33;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora cal = new MinhaCalculadora();
		System.out.println(cal.soma(8, 6)); 
		System.out.println(cal.soma(2.5, 6.8));
		System.out.println(cal.soma(8,9));
		System.out.println(cal.soma(9, 50, 90));

	}

}
