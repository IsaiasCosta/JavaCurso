package com.icsdevtec.curso_java_basico_aula42.teste;

/*
 * Classe final: não pode ser estendida - exemplo: public class Aluno extend Pessoa
 *
 * */

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		// Pessoa aluno = new Aluno();
		// Pessoa professor = new Professor();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		//Exemplo:
		
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG="https://www.youtube.com/";
		System.out.println(Constantes.URL_BLOG);
	}

}
