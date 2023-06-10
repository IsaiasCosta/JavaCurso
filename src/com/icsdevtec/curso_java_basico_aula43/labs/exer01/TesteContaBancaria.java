package com.icsdevtec.curso_java_basico_aula43.labs.exer01;

public class TesteContaBancaria {

	public static void main(String[] args) {

		System.out.println("\n****** TESTE DE CONTA BANCARIA ******\n");
		ContaBancaria conta = new ContaBancaria();
		conta.setNomeCliente("Isaias  costa e Silva");
		conta.setNumConta("003339-9");
		// conta.setSaldo();
		conta.depositarDinheiro(260.000);
		realizarSaque(conta, 140.000);
		realizarSaque(conta, 190.000);
		System.out.println(conta);
		
		
		System.out.println("\n****** TESTE DE CONTA BANCARIA POUPANÇA ******\n");
		
		
		 ContaPoupanca contaPoupanca = new ContaPoupanca();
	        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
	        contaPoupanca.setNumConta("22222");
	        contaPoupanca.setDiaRedimento(9);	        
	        contaPoupanca.depositarDinheiro(240.000);
	        
	        realizarSaque(contaPoupanca, 120.000);	        
	        realizarSaque(contaPoupanca, 190.000);
	        
	        
		
		if (contaPoupanca.atualizarSaldo(0.5)) {
			System.out.println("rendimento aplicado, novo saldo é de  = "+contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento novo saldo não calculado, saldo atual é de = "+contaPoupanca.getSaldo());
		}
		
		System.out.println(contaPoupanca);
		System.out.println("\n****** TESTE DE CONTA BANCARIA ESPECIAL ******\n");
		
		
		 ContaEspecial contaEspecial = new ContaEspecial();
		 contaEspecial.setNomeCliente("Cliente Conta Especial");
		 contaEspecial.setNumConta("22222");
	     contaEspecial.setLimite(5000);	        
	        contaEspecial.depositarDinheiro(240000);
	        
	        realizarSaque(contaEspecial, 12000);
	        realizarSaque(contaEspecial, 15000);	        
	        realizarSaque(contaEspecial, 18000);

	}

	// metodo statico
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.SacarSaldo(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente, " + valor + "; saldo atual = " + conta.getSaldo());
		}
	}

}
