package com.icsdevtec.curso_java_basico_aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria {

	// Atributo
	private double limite;

	// Getters e Setters
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// ToString

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "\n" + super.toString() + "]";
	}

	public boolean SacarSaldo(double valor) {

		double saldoLimite = this.getSaldo() + limite;
		if ((saldoLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}

		return false;
	}

}
