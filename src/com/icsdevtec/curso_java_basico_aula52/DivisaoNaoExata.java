package com.icsdevtec.curso_java_basico_aula52;

public class DivisaoNaoExata extends Exception {
	// atributo
	private int num;
	private int den;

	//construtor
	public DivisaoNaoExata(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

		//ToString
	@Override
	public String toString() {
		return "Resultado de " +num+ "/"+den+"não é inteiro" ;
	}	
}
