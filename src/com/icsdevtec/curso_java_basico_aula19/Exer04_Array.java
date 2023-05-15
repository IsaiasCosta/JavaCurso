/**
 * 
 */
package com.icsdevtec.curso_java_basico_aula19;

import java.util.Scanner;
/**
 * @author icsdevtec
 *
 */
public class Exer04_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner  sca= new Scanner(System.in);

		    int [] elementosA = new int[15];
		    double[] elementosB = new double[elementosA.length];
		     
		      for(int i=0;i<elementosA.length;i++){
		        System.out.println(" Entre com os valores da posição dos  Elementos ==> " + i);
		        elementosA[i]=sca.nextInt();
		        elementosB[i]= Math.sqrt(elementosA[i]);
		       
		      }
		      System.out.println("Elementos do elementos do Vetor A ");
		      for( int i =0; i <elementosA.length; i++){
		        System.out.println("ElementosA  " + elementosA[i] +" X 2");
		      }
		      System.out.println("Elementos do elementos do Vetor B  ");
		      for( int i =0; i <elementosB.length; i++){
		        System.out.println("ElementosB  " + elementosB[i]);
		      }


	}

}
