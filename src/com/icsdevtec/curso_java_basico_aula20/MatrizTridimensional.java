/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula20;

/**
 * @author icsdevtec
 *
 *         eixo x : linha 0 1 2 | eixo y :colunas 0 1 2 | eixo z :dimensão 0 1 2
 *         eixo x : linha 0 1 2 | eixo y :colunas 0 1 2 | eixo z :dimensão 0 1 2
 *         eixo x : linha 0 1 2 | eixo y :colunas 0 1 2 | eixo z :dimensão 0 1 2
 * 
 */

public class MatrizTridimensional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][][] matrizTridimensional = new int[3][3][3];
		System.out.println("Matriz Tridimensional");
		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					System.out.println(" | " + i + " | " + j + " | " + k );
					System.out.println("____________");
					matrizTridimensional[i][j][k] = i + j + k;
				
				}
				System.out.println("=============");
			}

		}
		
		 int soma =0 ; 
		 int somaPares= 0;
		 int somaImpares= 0;
		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
				 soma+=	matrizTridimensional[i][j][k] ;
				 if(matrizTridimensional[i][j][k]%2 ==0) {
					 somaPares+=matrizTridimensional[i][j][k];
				
				 }else {
					 somaImpares+=matrizTridimensional[i][j][k];
				}
				}

			}

		}
	
		 System.out.println("Soma dos Pares  = " +somaPares);
		 System.out.println(" ============= ");
		 System.out.println("Soma dos Impares =  " +somaImpares);
		 System.out.println(" ============= ");
		 System.out.println("Soma Total = " + soma);

	}

}
