package com.icsdevtec.curso_java_basico_aula68;

public class TesteThreadRunnable {

	public static void main(String[] args) {
		MinhaThreadRunnable runnable1 = new MinhaThreadRunnable("Thread 01", 500);
		
		MinhaThreadRunnable runnable2 = new MinhaThreadRunnable("Thread 02", 5000);
		
		MinhaThreadRunnable runnable3 = new MinhaThreadRunnable("Thread 03", 2000);
		
		//Thread t1 = new Thread(runnable);
		
		//t1.start();
		
	}

}
