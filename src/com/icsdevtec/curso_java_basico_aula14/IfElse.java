package com.icsdevtec.curso_java_basico_aula14;

 import java.util.*; 

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Informe o valor da mercadoria que esta levando  ");
		double  valorMercadoria = scan.nextDouble();
		
		/*if (idade >= 18 ) {
			System.out.println("VocÊ tem  " +idade + " anos, pode entrar");		
		}else {
			System.out.println("VocÊ tem  " +idade + " anos, não pode entrar");		
		}*/
		
		if(valorMercadoria<=10) {
			System.out.println("O valor pago por essa mercadoria foi de R$ " +valorMercadoria+ ", o  preço esta ótimo, vou levar mais um !");
		}else if (valorMercadoria>=10 && valorMercadoria <=17) {
			System.out.println("O valor pago por essa mercadoria foi de R$ " +valorMercadoria+ ", o  preço esta um pouco caro vou pedir desconto !");
			
		}else {
			System.out.println("O valor pago por essa mercadoria foi de R$ " +valorMercadoria+ ", o  preço muito caro não irei levar !");
			
		}
			
	}

}

//10 barato
//>10 até 17 desconto
//>17 muito caro
