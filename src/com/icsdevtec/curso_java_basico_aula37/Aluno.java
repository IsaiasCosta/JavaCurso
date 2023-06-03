package com.icsdevtec.curso_java_basico_aula37;

/*  Classe aluno herda da classe pessoas, os atributos da classe pessoa,
 *  com uso do *extends* cria se a herança da classe
 *  A classe Pessoa  torna se a *Super classe* ou * Classe Pai* ou *classe mãe*  das classes aluno e professor
 * */
public class Aluno extends Pessoa {
	
	//atributos da classe 

	private String curso;
	private double[] notas;

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

}
