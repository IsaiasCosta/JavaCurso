package com.icsdevtec.curso_java_basico_aula54;

public enum DiaSemana {

	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

	// atributo

	private int valor;

	// construtor - passando o parametro

	DiaSemana(int valor) {
		this.valor = valor;

	}
//metodo
	public int getValor() {
		return this.valor;
	}

}
