package com.icsdevtec.curso_java_basico_aula20;


import java.util.Scanner;


public class Exer_03 {
	/**
	 * @param args
	 */
    public static void main(String[] args) {
    	
     Scanner scan = new Scanner(System.in);
        int[][] numerosMatriz = new int[3][3];

       

        // Preenchendo a matriz com valores do teclado
        System.out.println("Digite os valores para preencher a matriz 3x3:");

        for (int i = 0; i < numerosMatriz.length; i++) {
            for (int j = 0; j < numerosMatriz[i].length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                numerosMatriz[i][j] = scan.nextInt();
            }
        }

        // Contando os números pares e ímpares
        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numerosMatriz[i][j] % 2 == 0) {
                    countPares++;
                } else {
                    countImpares++;
                }
            }
        }

        System.out.println("Quantidade de números pares: " + countPares);
        System.out.println("Quantidade de números ímpares: " + countImpares);
    }

}
