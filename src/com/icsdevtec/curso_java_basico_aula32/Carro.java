package com.icsdevtec.curso_java_basico_aula32;


/* Metodo settes: são responsaveis por atribuir valor,  são  do tipo publico
 *  
 * Metodo gettes são responsaveis por obter valor,  são  do tipo publico
 * 
 * */

public class Carro {

	private String marca;
	private String modelo;
	private int qdtPassageiros;
	private double tanqueCombustivel;
	private double consCombustivel;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQdtPassageiros() {
		return qdtPassageiros;
	}
	public void setQdtPassageiros(int qdtPassageiros) {
		this.qdtPassageiros = qdtPassageiros;
	}
	public double getTanqueCombustivel() {
		return tanqueCombustivel;
	}
	public void setTanqueCombustivel(double tanqueCombustivel) {
		this.tanqueCombustivel = tanqueCombustivel;
	}
	public double getConsCombustivel() {
		return consCombustivel;
	}
	public void setConsCombustivel(double consCombustivel) {
		this.consCombustivel = consCombustivel;
	}

	

}
