package com.icsdevtec.curso_java_basico_aula75_84;

public class Aula80 {

	public static void main(String[] args) {
		String teste = "Isso é um teste.";

		System.out.println(teste);
		System.out.println(" substring = " + teste.substring(10));
		System.out.println(" substring = " + teste.substring(10, 15));

		String ola = "olá";
		String mundo = "mundo";
		String olaMundo = ola.concat(" " + mundo);
		System.out.println(olaMundo);
		
		String espacos =" i s p a ç o" ;
		String semEspaco = espacos.replace('i', 'e');
		System.out.println(semEspaco);
		
		semEspaco=semEspaco.replaceAll(" ","");
		System.out.println(semEspaco);
		
		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());
		

	}

}
