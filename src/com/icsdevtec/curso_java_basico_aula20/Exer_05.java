/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula20;

import java.util.Scanner;

/**
 * @author icsdevtec
 *
 */
public class Exer_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][9];

		boolean mesValido = false;

		boolean sair = false;
		boolean diaValido = false;

		boolean hrValida = false;
		int hora = 0;
		int dia = 0;
		int mes = 0;
		byte opcao;
		while (!sair) {
			System.out.println(" Digite 1 para adicionar o compromisso !!! ");
			System.out.println(" Digite 2 para verificar o compromisso !!! ");
			System.out.println(" Digite 0 para sair do Programa !!! ");
			opcao = scan.nextByte();

			switch (opcao) {

			// Adicionar o compromisso
			case 1: {

				while (!mesValido) {
					System.out.println("Entre o  mês do ano !!! ");
					mes = scan.nextInt();
					if (mes > 0 & dia <= 12) {
						mesValido = true;
					} else {
						System.out.println("Entre com um mês valido");
					}
				}
				while (!diaValido) {
					System.out.println("Entre o dia do mês !!! ");
					dia = scan.nextInt();
					if (dia > 0 & dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Entre com um dia valido");
					}
				}
				while (!hrValida) {
					System.out.println("Informe a hora do compromisso !!! ");
					hora = scan.nextInt();
					if (hora >= 0 & hora <= 8) {
						hrValida = true;
					} else {
						System.out.println("Hora invalida, digite novamente");
					}
				}
			}
			case 2: {
				while (!mesValido) {
					System.out.println("Entre o  mês do ano !!! ");
					mes = scan.nextInt();
					if (mes > 0 & dia <= 12) {
						mesValido = true;
					} else {
						System.out.println("Entre com um mês valido");
					}
				}
				while (!diaValido) {
					System.out.println("Entre o dia do mês !!! ");
					dia = scan.nextInt();
					if (dia > 0 & dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Entre com um dia valido");
					}
				}
				while (!hrValida) {
					System.out.println("Informe a hora do compromisso !!! ");
					hora = scan.nextInt();
					if (hora >= 0 & hora <=8) {
						hrValida = true;
					} else {
						System.out.println("Hora invalida, digite novamente");
					}
				}
			}
				// Verificar o compromisso
				
			
			
				System.out.println("Digite o compromisso ");
				compromissos[mes][dia][hora] = scan.next();
			case 3: {

				while (!diaValido) {
					System.out.println("Entre o dia do mês !!! ");
					dia = scan.nextInt();
					if (dia > 0 & dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Entre com um dia valido");
					}
				}
				while (!hrValida) {
					System.out.println("Informe a hora do compromisso !!! ");
					hora = scan.nextInt();
					if (hora >= 0 & hora <= 8) {
						hrValida = true;
					} else {
						System.out.println("Hora invalida, digite novamente");
					}
				}
			
				
				System.out.println("Compromissos agendado é ");
				System.out.println(compromissos[mes][dia][hora]);
				
			}
			case 0: {
				sair = true;
			}
				System.out.println("Opção Invalida digite novamente !!!");
			}
		}

	}

}
