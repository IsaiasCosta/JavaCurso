package com.icsdevtec.curso_java_basico_aula41.teste;


public class Teste {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		
		//pessoa.setEndereco("Rua: Vinte e 5 nº 89");
		aluno.setEndereco("Rua: Maranhão nº 56");
		professor.setEndereco("Rua: Tortoise nº4587");

		 /*System.out.println(aluno.obterEtiquetaEndereco()+"");
		 System.out.println(professor.obterEtiquetaEndereco()+"");*/
		
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}

}
