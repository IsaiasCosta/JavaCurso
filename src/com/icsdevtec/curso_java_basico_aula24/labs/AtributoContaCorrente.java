package com.icsdevtec.curso_java_basico_aula24.labs;

public class AtributoContaCorrente {

	public static void main(String[] args) {
		 
		ContaCorrente conta = new ContaCorrente();
		
		conta.numConta="00253339-6";
		conta.agencia="0893";
		conta. especial=true;
		conta.limiteEspecial=25.548;
		conta.saldo=3.895;
		
		
		
		System.out.println("Nº da conta: " +conta.numConta );
		System.out.println("Nº da Agencia : " +conta.agencia );
		System.out.println("Conta é especial ? : " +conta. especial );
		System.out.println("Limite dessa conta : " +conta.limiteEspecial );
		System.out.println("Salda da conta : " +conta.saldo );

	}

}
