package com.icsdevtec.curso_java_basico_aula70;

import com.icsdevtec.curso_java_basico_aula69.MinhaThreadRunnable;

public class Teste_Thread_Prioridade {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread nº_01" , 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread nº_02" , 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread nº_03" , 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);		
		Thread t3 = new Thread(thread3);
		
		t1.setPriority(5);
		t1.setPriority(3);
		t1.setPriority(1);
		//t1.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
