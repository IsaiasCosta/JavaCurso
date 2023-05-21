/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula20;

/**
 * @author icsdevtec
 *
 *         Matriz : é uam tabela de dimensões Linhas x Colunas elementos -
 * 
 *         |_10 |7.0_|9.0|9.5_| |_10_|7.8_|9.3|9.8_| |_10_|5.4_|6.3|7.8_|
 *         |_10_|9.4_|6.3|3.8_|
 * 
 */
public class Matrizes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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

		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println(" Nota : ==> " + notasAlunos[i][j] + " do  Aluno : ==> " + j);

			}
			System.out.println(" ============= ");
		}

		System.out.println("Calculando a média de cada aluno ");

		double soma = 0;

		for (int i = 0; i < notasAlunos.length; i++) {

			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println(" ============= ");
			System.out.println(" Média do aluno " + i + " é = " + (soma / 4));
		}

		double[][] notasAlunos2 = { { 10, 9.4, 6.3, 3.8 }, { 10, 7.8, 9.3, 9.8 } };

	
		for (int i = 0; i < notasAlunos2.length; i++) {
			for (int j = 0; j < notasAlunos2[i].length; j++) {
			System.out.println(" \n====== Notas dos alunos 2 =======\n ");
				System.out.println(" Nota : ==> " + notasAlunos2[i][j] + " do  Aluno : ==> " + j);
				 
			}

		}
	}
}
