package com.icsdevtec.curso_java_basico_aula45.teste;

public class InstanceOf {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		if (pessoa instanceof Pessoa) {
			System.out.println("Objecto do tipo Pessoa");
		}
		if (aluno instanceof Aluno) {
			System.out.println("Objecto do tipo Aluno");
		}
		if (professor instanceof Professor) {
			System.out.println("Objecto do tipo Professor");
		}

	}

}
