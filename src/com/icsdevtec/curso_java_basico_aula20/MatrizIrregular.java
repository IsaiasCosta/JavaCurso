package com.icsdevtec.curso_java_basico_aula20;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class MatrizIrregular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o nº de pessoas entrevistada ");
		int numEntrevistas = scan.nextInt();
		String[][] nomesFilhos = new String[numEntrevistas][];
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Quantidade de Filhos ");
			int qdtFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qdtFilhos];
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do Filho " + (j + 1));
				nomesFilhos[i][j] = scan.next();
			}
		}
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("A pessoa " + (i+1 )+ " tem a quantidade de " + nomesFilhos[i].length + " Filhos");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Nomes dos Filhos ==>  " + nomesFilhos[i][j]);

			}

		}
	}

}
