package com.icsdevtec.curso_java_basico_aula66;

import java.util.Iterator;

import com.icsdevtec.curso_java_basico_aula61.Contato;

public class GabargeCollection {

	public static void obterMemoriaUsada() {	
		
		final int MB = 1024*1024;
		
			Runtime runtime =Runtime.getRuntime();
			System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB +" MB");

	}
	public static void main(String[] args) {
		Contato[] contatos = new Contato[1000];

		for (int i = 0; i < contatos.length; i++) {
			Contato contato = new Contato("Contato" + i, "1235-98964" + i, "conato" + i + "@email.com");
			contatos[i] = contato;
		}
		System.out.println("Contatos criados"+ contatos.toString());
		
		obterMemoriaUsada();
		contatos = null;
		
		Runtime.getRuntime().runFinalization();
		
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memoria" + contatos);
		
		obterMemoriaUsada();
	}

}
