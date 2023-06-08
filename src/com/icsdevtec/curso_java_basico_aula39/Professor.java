package com.icsdevtec.curso_java_basico_aula39;

/*  Classe Professsor herda da classe pessoas, os atributos da classe pessoa,
 *  com uso do *extends* cria se a herança da classe
 *  A classe Pessoa  torna se a *Super classe* ou * Classe Pai* ou *classe mãe*  das classes aluno e professor
 * 
 *   public: visibilidade geral idenpedente de pacote
 *   
 *   defaul: somente classes do proprio pacote, tem visibilidade
 *   
 *   private: visivel dentro da classe, não visivel por herança é possivel acessar
 *   
 *   protected: pareciso com o defauld , subclasse independente de onde estejama são acessadas
 * 
 * 
 * */
public class Professor extends Pessoa {

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

	public void verificarVisibilidade() {
		this.setNomeVisibilidade("aaaaaa");
	}
}
