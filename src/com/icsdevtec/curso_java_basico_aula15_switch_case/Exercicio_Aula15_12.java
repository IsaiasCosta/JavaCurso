package com.icsdevtec.curso_java_basico_aula15_switch_case;

import java.util.Scanner;

public class Exercicio_Aula15_12 {

	/* 12.Faça um programa para o cálculo de uma folha de pagamento,
	sabendo que os descontos são do Imposto de Renda, que depende do
	salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
	FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
	a empresa que deposita). O Salário Líquido corresponde ao Salário
	Bruto menos os descontos. O programa deverá pedir ao usuário o
	valor da sua hora e a quantidade de horas trabalhadas no mês.
	o Desconto do IR:
	o Salário Bruto até 900 (inclusive) - isento
	o Salário Bruto até 1500 (inclusive) - desconto de 5%
	o Salário Bruto até 2500 (inclusive) - desconto de 10%
	o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
	as informações, dispostas conforme o exemplo abaixo. No
	exemplo o valor da hora é 5 e a quantidade de hora é 220.
	 *
	 */
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da hora trabalhada !!!");
		Double horaTrabalhada =scan.nextDouble();
		System.out.println("Digite a quantidade de hora trabalhada do mês  !!");
		double quantHoraTrabMes =scan.nextDouble();
		double salBruto =  horaTrabalhada * quantHoraTrabMes;
		double  percentualIr =0;
		if (salBruto<=900) {
			percentualIr=0;
		}else if (salBruto >900 && salBruto<=1500) {
			percentualIr=5;	
		}else if (salBruto >1500 && salBruto<=2500) {
			percentualIr=10;	
		}else if (salBruto >1500) {
			percentualIr=20;	
		}
		 double ir = (salBruto/100)*percentualIr;
		 double inss= (salBruto/100)*10;
		 double fgts =  (salBruto/100)*11;
		 double desconto = ir+inss;
		 double salarioLiq = salBruto-desconto;
		 System.out.println("Salário bruto: (" +horaTrabalhada +" * "+quantHoraTrabMes+")  : R$"+salBruto );
		 System.out.println("(-) IR ("+percentualIr+"%)                 : R$"+ir);
		 System.out.println("(-) INSS (10%)                 : R$"+inss);
		 System.out.println("(-) FGTS (11%)                 : R$"+fgts);
		 System.out.println("Total de descontos             : R$"+ desconto);
		 System.out.println("Salario LIquido no mês         : R$"+ salarioLiq);
		 
	}

}
