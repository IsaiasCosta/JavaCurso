package com.icsdevtec.curso_java_basico_aula45.teste;

public class Teste2 {

	public static void main(String[] args) {

		Object obj1 = obterString();
		
		String s1=(String)obj1;
		System.out.println("s1 = " +s1);
		
		Object obj2 = "Downgasting";
		String s2 = (String) obj2;
		System.out.println("s2 = " + s2);
		
		
		Object obj3 = new Object(); //não funciona em tempo de execusão
		String s3 = (String) obj3;
		
		Object obj4 = obterInteiro(); //não funciona em tempo de execusão
		String s4=(String) obj4;
		
	}

	public static String obterString() {
		return "UpCasting";
	}
	public static int obterInteiro() {
		return 10;
	}


}
