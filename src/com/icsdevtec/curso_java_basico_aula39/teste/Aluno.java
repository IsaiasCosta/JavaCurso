package com.icsdevtec.curso_java_basico_aula39.teste;

import com.icsdevtec.curso_java_basico_aula39.Pessoa;

/*  Classe aluno herda da classe pessoas, os atributos da classe pessoa,
 *  com uso do *extends* cria se a herança da classe
 *  A classe Pessoa  torna se a *Super classe* ou * Classe Pai* ou *classe mãe*  das classes aluno e professor
 * */
public class Aluno extends Pessoa {
	
	//atributos da classe 

	private String curso;
	private double[] notas;
	
	// Construto da Super classe: o super() referencia o contrutor da super classe
	public Aluno() {
		super();	
	}

	public Aluno(String nome, String endereco, String telefone,String curso) {
		super(nome, endereco, telefone);
		this.curso=curso;
	}

	 //gettes e Settes
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	// metodos 

	public double CalcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public  void metodoQualquerTeste() {
		 super.setCpf("5465446546");//extente direto da super classe
		 
		 this.setCpf("546546464");//também extende da super classe
	}
	
	public void VerificarAcesso() {
		this.nomeVisibilidade ="";
		super.nomeVisibilidade ="";
	}
}
