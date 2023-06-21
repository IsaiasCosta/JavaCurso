package com.icsdevtec.curso_java_basico_aula59;


import static java.lang.Math.pow;

import static java.lang.System.out;

import static java.lang.Math.sqrt;


public class StaticImport {

	public static void main(String[] args) {
		
		double a=2;
		double b=3;
		double c=4;
		
	    out.println(Math.pow(a, b));
		
		out.println(Math.sqrt(c));
		
		out.println(pow(a, b));
		out.println(sqrt(c));
		

	}

}
