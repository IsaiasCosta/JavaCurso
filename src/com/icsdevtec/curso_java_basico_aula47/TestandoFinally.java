package com.icsdevtec.curso_java_basico_aula47;
/*Finally: sempre sera execultado sempre será impresso após try ou o catch*/
public class TestandoFinally {

	public static void main(String[] args) {
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));
			} catch (ArithmeticException execption) {
				System.out.println("Erro ao dividir por zero");
			} catch (ArrayIndexOutOfBoundsException execption) {
				System.out.println("índice 5 fora dos limites ");

			} finally {
				System.out.println("Linha impressa sempre após o Try ou o Catch");
			}
		}
	}

}
