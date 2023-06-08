package com.icsdevtec.curso_java_basico_aula43.teste;

import java.util.Arrays;
import java.util.Objects;

/*  Classe aluno herda da classe pessoas, os atributos da classe pessoa,
 *  com uso do *extends* cria se a herança da classe
 *  A classe Pessoa  torna se a *Super classe* ou * Classe Pai* ou *classe mãe*  das classes aluno e professor
 *
 * Herança e Polimorfismo:
 * 
 * */
public class Aluno {

	// atributos da classe

	private String curso;
	private double[] notas;

	// Construto da Super classe: o super() referencia o contrutor da super classe
	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
	}

	// gettes e Settes
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

	public void metodoQualquerTeste() {
		//super.setCpf("5465446546");// extente direto da super classe

		//this.setCpf("546546464");// também extende da super classe
	}

	public String obterEtiquetaEndereco() {

		String end ="Endereço do aluno : ";
		//end+=super.getEndereco();
		return end;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
		
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Aluno other = (Aluno) obj;
		
		if(curso.equalsIgnoreCase(other.getCurso())){
			return true;
		}
		return false;
	}
	
	/*public String toString(){
		
		String cur = curso +"\n";
		for(double nota : notas) {
			cur+= " Nota " + nota +" "; 
		}
		return cur ;
	}*/
	
	
	
}
