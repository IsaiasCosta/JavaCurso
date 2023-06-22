package com.icsdevtec.curso_java_basico_aula60;

public class EscopoVariaveis {

	private int valor;// atributo

	public int getValor() { // Metodo get
		return valor;
	}

	public void setValor(int valor) { // Metodo get
		this.valor = valor;
	}

	public int calcularValor(int valor) { // Metodo - passando parametro

		valor = valor + 10;
		return valor;
	}

	public int teste() {
		int valor = 5;
		if (true) {
			valor--;
		}
		this.valor = valor; // referencial valor global ; atributo da classe

		return valor;
	}

	public void outroTeste() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		// i++; //erro compilação

		int j;
		for (j = 0; j < 10; j++) {
			System.out.println(j);
		}
		System.out.println(j);// valor J = 20
	}

	private void maisUmTeste() {
		boolean flag = true;
		if (flag) {
			int umaVariavel = 10;
			umaVariavel++;

			System.out.println(umaVariavel);
		}
		// System.out.println(umaVariavel); //Erro de compilação
	}

	private void maisUmOutroTeste(int num) {
		int total = 0;
		try {
			int outroNum = 0;
			total = num / outroNum;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			total++;
			// outroNum; //erro de compilação

			// e.printStackTrace(); //erro de compilação
		}
		num++;
	}
}
