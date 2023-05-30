package com.icsdevtec.curso_java_basico_aula32;


/* Encapsulamento:
 * metodo sette para atribuir valor e metodo gette para obter valor
 * 
 * */

public class TesteCarro {

	public static void main(String[]args) {
		
		Carro van = new Carro();
	
	  van.setMarca("Fiat");
	  System.out.println(van.getMarca());
	
	}

}
