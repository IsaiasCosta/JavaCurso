package com.icsdevtec.curso_java_basico_aula54;

public class Formulario {

	enum Genero {
		FEMININO('F'), MASCULINO('M');

		// atributo
		private char valor;

		// metodo
		Genero(char valor) {
			this.valor = valor;
		}
	}
  private String nome;
  private Genero genero;
}
