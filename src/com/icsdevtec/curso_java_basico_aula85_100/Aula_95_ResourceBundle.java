package com.icsdevtec.curso_java_basico_aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula_95_ResourceBundle {

	public static void main(String[] args) {
		
		
		System.out.println("Locale Atual " + Locale.getDefault());
		
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
		
		System.out.println("Olá " + rb.getString("hello"));
		System.out.println("Mundo " + rb.getString("world"));

	}

}
