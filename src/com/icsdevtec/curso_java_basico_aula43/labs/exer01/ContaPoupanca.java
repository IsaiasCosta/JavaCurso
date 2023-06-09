package com.icsdevtec.curso_java_basico_aula43.labs.exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	// Atributo
	private int diaRedimento;

	// Getters e Setters
	public int getDiaRedimento() {
		return diaRedimento;
	}

	public void setDiaRedimento(int diaRedimento) {
		this.diaRedimento = diaRedimento;
	}

	// Metodo toString

	@Override
	public String toString() {

		return "**** Conta Poupanca ****\nDia do Redimento = " + diaRedimento +"\n" + super.toString();

	}

	public boolean atualizarSaldo(double taxaRedimento) {

		Calendar hoje = Calendar.getInstance();
		if (diaRedimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			// saldo+=saldo*taxaRedimento;
			 this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRedimento));
			return true;
		}
		return false;
	}

}
