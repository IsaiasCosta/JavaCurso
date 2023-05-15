package com.icsdevtec.curso_java_basico_aula17;

import java.util.Scanner;

/*. Faça um programa que leia um nome de usuário e a sua senha e não 
aceite a senha igual ao nome do usuário, mostrando uma mensagem 
de erro e voltando a pedir as informações.*/


public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean validarSenha =false;
		
		do {
			System.out.println("Enter com o nome do Usuario ");
			String nome = scan.next();
			System.out.println("Informa a senha ");
			String	senha =scan.next();
			if(senha.equalsIgnoreCase(nome)){			
				validarSenha=false;
				System.out.println("Sua senha deve ser diferente no nome do usuario " + nome);
			}else {
				
				System.out.println("Senha valida " + senha);
			}
			
			
		}while(!validarSenha);
		

	}

}
