/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula21;

import java.util.Random;

/**
 * @author icsdevtec Foreach ou For melhorado :
 * 
 */
public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] notas = new int[10];

		Random random = new Random();
		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(200);

		}
		System.out.println("Usando o for ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		System.out.println("Usando o for each");

		for (int nota : notas) {
			System.out.println(nota);
		}
		// exemplo 2

		double[][] notasAlunos = new double[4][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 7.8;
		notasAlunos[1][2] = 9.3;
		notasAlunos[1][3] = 9.8;

		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 5.4;
		notasAlunos[2][2] = 6.3;
		notasAlunos[2][3] = 7.8;

		notasAlunos[3][0] = 10;
		notasAlunos[3][1] = 9.4;
		notasAlunos[3][2] = 6.3;
		notasAlunos[3][3] = 3.8;
		// exemplo com array multidimensional - foreach
		for (double[] notaAluno : notasAlunos) {
			for (double nota : notaAluno) {
				System.out.println("" + nota);
			}
			System.out.println();
		}
	}

}
