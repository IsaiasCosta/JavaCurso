package com.icsdevtec.curso_java_basico_aula75_84;

public class Aula76 {

	public static void main(String[] args) {

		String curso = new String("Curso");

		String java = new String("Java");

		String cursoJava = curso + " " + java;
		System.out.println(cursoJava);

		String resultado2Com2 = "Resultado = " + (2 + 2);
		System.out.println(resultado2Com2);

		String resultado2Com2_ = "Resultado = " + 2 + 2;
		System.out.println(resultado2Com2_);

		String um = String.valueOf(1);
		System.out.println(um);

		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad "
				+ "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip"
				+ "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit"
				+ "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat"
				+ "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		System.out.println(concatenacao);

		String contatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit,";
		contatenacao2 += "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad ";
		contatenacao2 += "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip";
		contatenacao2 += "ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit";
		contatenacao2 += "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat";
		contatenacao2 += "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		System.out.println(contatenacao2);
	}

}
