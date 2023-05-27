/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula20;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] jogoVelha = new char[3][3];

		System.out.println("Jogador nº 1  = X ");
		System.out.println("Jogador nº 2  = O ");

		boolean ganhou = false;
		int jogador = 1;
		char sinal;
		int linha = 0, coluna = 0;
		// informado de quem é a vez de jogar
		while (!ganhou) {
			if (jogador % 2 == 1) {
				System.out.println("Jogador nº 1 sua vez de Jogar ");
				sinal = 'X';
			} else {
				System.out.println("Jogador nº 2 sua vez de Jogar");
				sinal = 'O';
			}
			// validando a linha

			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com uma linha valida [1, 2 ou 3] ");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;

				} else {
					System.out.println("Linha invalida, a linha deve ser 1,2 ou 3");
				}
			}
			// validando a coluna

			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com uma coluna valida [1, 2 ou 3] ");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;

				} else {
					System.out.println("Coluna invalida, a Coluna deve ser 1,2 ou 3");
				}
			}
			// controlando o tabuleiro
			linha--;
			coluna--;
    			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println(" A Posição escolhida, já esta oculpada, tente novamente ");
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogador++;
			}
			// Imprimindo o Tabuleiro

			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				System.out.println();
			}
			// Quem ganhou ou se houve empate
			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || // linha 1
					(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha 2
					(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // linha 3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna 1
					(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // coluna 2
					(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna 3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')) {
				ganhou = true;
				System.out.println("Jogador nº 1 ganhou !!!");
			} else {
				if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // linha 1
						(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // linha 2
						(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // linha 3
						(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // coluna 1
						(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || // coluna 2
						(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // coluna 3
						(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')) {
					ganhou = true;
					System.out.println("Jogador nº 2 ganhou !!!");
				}else if (jogador >9) {
					ganhou=true;
					System.out.println("Não houve ganhador, nesta jogada !!!");
				}
			}
		}

	}

}
