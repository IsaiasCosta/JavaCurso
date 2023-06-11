package com.icsdevtec.curso_java_basico_aula45.teste;

/**
 * Conversão de Objectos (Casting) : Converter uma subclasse para o tipo
 * superclasse ou vice-versa
 * 
 * Upcasting e Downcasting
 * 
 */
public class CastingInstaceof {

	public static void main(String[] args) {
		// exemplo de Upcasting

		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno;// upcasting

		Pessoa aluno3 = (Pessoa) new Aluno();

		Aluno aluno2 = (Aluno) pessoaAluno; // downcasting

		Pessoa aluno4 = new Pessoa();

		Aluno aluno5 = (Aluno) aluno4;
	}

}
