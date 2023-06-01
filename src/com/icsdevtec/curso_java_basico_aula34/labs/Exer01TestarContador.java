package com.icsdevtec.curso_java_basico_aula34.labs;

public class Exer01TestarContador {

	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}
	
	public static void main(String[] args) {
		imprimirValor();
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
  
	}

}
