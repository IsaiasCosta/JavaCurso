package com.icsdevtec.curso_java_basico_aula74;

public class DeadLock {

	public static void main(String[] args) {
		final String RECURSO1 = "Recurso_N°1";
		final String RECURSO2 = "Recurso_N°2";

		Thread t1 = new Thread() {

			public void run() {
				synchronized (RECURSO1) {
					System.out.println("Thread nº 1: bloqueou o Recurso nº1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					System.out.println("Thread nº 1:tentando acessar o Recurso nº2");
					
					synchronized (RECURSO2) {
						System.out.println("Thread nº 1: bloqueou o Recurso nº2");
					}
				}
			}
		};
		Thread t2 = new Thread() {

			public void run() {
				synchronized (RECURSO2) {
					System.out.println("Thread nº 2: bloqueou o Recurso nº2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					System.out.println("Thread nº 2:tentando acessar o Recurso nº1");
					
					synchronized (RECURSO1) {
						System.out.println("Thread nº 2: bloqueou o Recurso nº1");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
