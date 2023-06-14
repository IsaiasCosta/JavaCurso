package com.icsdevtec.curso_java_basico_aula47;

/*
 * 
 * Não tratar  erros:  fazem q execução do programa terminar.
 * 
 * Tratar erros: permite que o programa executre uma determinada logica caso o erro ocorra.
 * 
 * permitem que o programa continue a execução.
 * 
 * */
public class Exception {

	public static void main(String[] args) {

		try {

			int[] vetor = new int[4];
			System.out.println("Antes da execptios");
			vetor[4] = 1;

			System.out.println("Texto não impresso");
		} catch (java.lang.ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exeção ao acessa o indice do vetor que não existe !!!");
		}
		System.out.println("Texto impresso após exeção !!!");
	}
}
