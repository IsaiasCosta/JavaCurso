package com.icsdevtec.curso_java_basico_aula71;

/*
 * 
 * 
 * 
 * 
 * **/
public class Thread_Sincronizar {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		
		MinhaThreadSoma t1 = new MinhaThreadSoma(" nº_01 " , array);

		MinhaThreadSoma t2 = new MinhaThreadSoma(" nº_02 " , array);

		MinhaThreadSoma t3 = new MinhaThreadSoma(" nº_03 " , array);

		
	}

}
