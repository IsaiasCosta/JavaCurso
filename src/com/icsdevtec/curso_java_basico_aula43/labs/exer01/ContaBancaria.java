package com.icsdevtec.curso_java_basico_aula43.labs.exer01;

public class ContaBancaria {
	// Atributos
	private String nomeCliente;
	private String numConta;
	private double saldo;

	// Construtores
	public ContaBancaria() {
	}

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		saldo = saldo;
	}

	// Metodos Gettes e Setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		saldo = saldo;
	}

	// Metodo toString

	@Override
	public String toString() {
		return "Nome do Cliente = " + nomeCliente + "\nNúmero da Conta = " + numConta + "\nSaldo da Conta = " + saldo;
	}

	// Metodos da Classe
	public boolean SacarSaldo(double valor) {
		if ((saldo - valor) >= 0) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public double depositarDinheiro(double valor) {
		saldo += valor;
		return saldo;
	}

}
