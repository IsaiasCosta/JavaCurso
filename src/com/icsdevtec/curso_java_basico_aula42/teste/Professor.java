package com.icsdevtec.curso_java_basico_aula42.teste;

/*  Classe Professsor herda da classe pessoas, os atributos da classe pessoa,
 *  com uso do *extends* cria se a herança da classe
 *  A classe Pessoa  torna se a *Super classe* ou * Classe Pai* ou *classe mãe*  das classes aluno e professor
 * */
public class Professor  {

	// Atributos

	private String nomeCurso;
	private double salario;

	// Gettes e Settes

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// metodos

	public double CalcularSalarioLiquido() {
		return 0;
	}

	public String obterEtiquetaEndereco() {

		String end2 = "Endereço do Professor : ";

		//end2 += super.getEndereco();
		return end2;
	}

	/*@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("");
		System.out.println(this.obterEtiquetaEndereco());
		
	}*/

}
