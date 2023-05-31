package com.icsdevtec.curso_java_basico_aula34;

public class TesteMinhaCalculadora {

	static int result;

	public static void main(String[] args) {

		result = MinhaCalculadora.soma(5, 70);

		soma2Valores(6, 8);
	}

	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}
