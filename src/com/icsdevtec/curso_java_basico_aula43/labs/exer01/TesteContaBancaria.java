package com.icsdevtec.curso_java_basico_aula43.labs.exer01;

public class TesteContaBancaria {

	public static void main(String[] args) {

		/*System.out.println("****** TESTE DE CONTA BANCARIA ******");
		ContaBancaria conta = new ContaBancaria();
		conta.setNomeCliente("Isaias  costa e Silva");
		conta.setNumConta("003339-9");
		// conta.setSaldo();
		conta.depositarDinheiro(260.000);
		realizarSaque(conta, 140.000);
		realizarSaque(conta, 190.000);
		System.out.println(conta);*/
		
		
		System.out.println("****** TESTE DE CONTA BANCARIA POUPANÇA ******");
		 ContaPoupanca contaPoupanca = new ContaPoupanca();
	        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
	        contaPoupanca.setNumConta("22222");
	        contaPoupanca.setDiaRedimento(8);
	        
	        contaPoupanca.depositarDinheiro(100);
	        
	        realizarSaque(contaPoupanca, 50);
	        
	        realizarSaque(contaPoupanca, 70);
		
		if (contaPoupanca.atualizarSaldo(0.5)) {
			System.out.println("rendimento aplicado, novo saldo é de  = "+contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento novo saldo não calculado, saldo atual é de = "+contaPoupanca.getSaldo());
		}
		
		System.out.println(contaPoupanca);
		

	}

	// metodo statico
	private static void realizarSaque(ContaBancaria conta2, double valor) {
		if (conta2.SacarSaldo(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta2.getSaldo());
		} else {
			System.out.println("Saldo insuficiente, " + valor + "; saldo atual = " + conta2.getSaldo());
		}
	}

}
