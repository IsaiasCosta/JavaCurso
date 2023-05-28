package com.icsdevtec.curso_java_basico_aula24.labs;

public class AtributoContato {

	public static void main(String[] args) {
		
		
		Contato contato = new Contato();
		contato.nome = "Isaias";
		contato.email="icsdevtec@gmail.com";
		contato.endereco="Rua: Mandarin - nº 122";
		
		contato.telefones=new String[2];
		
		contato.telefones[0]="(31)98937-0967";
		contato.telefones[1]="(31)97108-7288";
		
		System.out.println(" : " +contato.nome);
		System.out.println(" : " +contato.email);
		System.out.println(" : " +contato.endereco);
		System.out.println(" : " +contato.telefones[0]);
		System.out.println(" : " +contato.telefones[1]);
		

	}

}
