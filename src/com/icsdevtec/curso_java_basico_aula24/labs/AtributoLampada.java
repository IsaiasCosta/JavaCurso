package com.icsdevtec.curso_java_basico_aula24.labs;

public class AtributoLampada {

	public static void main(String[] args) {
		 Lampada led = new Lampada();
		 
		 led.modelo="A60";	 
		 led.tensao="Bivolt";
		 led.potencia=7;
		 led.cor="Amarela";
		 led.tipoLuz="Amarela";
		 led.garantiaMeses=36;
		 
		 led.tipos = new String[3];
		 
		 led.tipos[0] = "Abajur";
		 led.tipos[1] = "Lampeao";
		 led.tipos[2] = "Luminaria";
		 
		 System.out.println("Caracteristicas do Produto\n " );
		 System.out.println("Modelo : " + led.modelo +"\nTensão : "+led.tensao+"\nPotência :"+led.potencia+"\nCor da lamapda: "+led.cor
				 +"\nTipo de Luz(Cor): " + led.tipoLuz+"\nGarantia :"+led.garantiaMeses+ " Meses\nTipo da lampada :"+led.tipos[0]);
		 

	}

}
