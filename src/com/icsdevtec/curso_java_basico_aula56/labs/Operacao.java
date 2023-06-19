package com.icsdevtec.curso_java_basico_aula56.labs;

public enum Operacao {

	SOMAR("+") {
		@Override
		public double execultarOperacao(double num1, double num2) {

			return num1 + num2;
		}
	},
	SUBTRAIR("-") {
		@Override
		public double execultarOperacao(double num1, double num2) {
			return num1 - num2;
		}
	},
	DIVIDIR("/") {
		@Override
		public double execultarOperacao(double num1, double num2) {
			return num1 / num2;
		}
	},
	MULTIPLICAR("*") {
		@Override
		public double execultarOperacao(double num1, double num2) {
			return num1 * num2;
		}
	};

	// atributo
	private String simbolo;
	// Construtor

	private Operacao(String simbolo) {
		this.simbolo = simbolo;
	}

	// metodo ToString
	public String toString() {
		return this.simbolo;
	}

	// metodo abstrato
	public abstract double execultarOperacao(double num1, double num2);

}
