package com.icsdevtec.curso_java_basico_aula40.teste;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		pessoa.setEndereco("Rua: Mandarin nº 122 Apt 101B");
		aluno.setEndereco("Rua: Ouro Preto nº 1652 Apt 501B");
		professor.setEndereco("Rua: Mandaro nº 127 Apt 181B");

		System.out.println(pessoa.obterEtiquetaEndereco() + "\n" + aluno.obterEtiquetaEndereco() + "\n"
				+ professor.obterEtiquetaEndereco());

	}

}
