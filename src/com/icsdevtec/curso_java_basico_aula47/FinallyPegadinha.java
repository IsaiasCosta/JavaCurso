package com.icsdevtec.curso_java_basico_aula47;
/*
 * System.exit(0): termina a execução do programa
 * 
 * 
 * */
public class FinallyPegadinha {

	public static void main(String[] args) {
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));
			} catch (ArithmeticException execption) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0);
			} catch (Throwable execption) {
				System.out.println("índice 5 fora dos limites ");
				System.exit(0);

			} finally {
				System.out.println("Linha impressa sempre após o Try ou o Catch");
				System.out.println();
			}
		}

	}

}
