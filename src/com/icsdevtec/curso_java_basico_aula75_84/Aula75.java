package com.icsdevtec.curso_java_basico_aula75_84;

public class Aula75 {

	public static void main(String[] args) {

		String vazia = new String();
		System.out.println(vazia);

		String java = new String("JAVA");
		System.out.println(java);

		String java1 = new String(java);
		System.out.println(java1);

		char[] charJava = { 'J', 'A', 'V', 'A' };
		String java2 = new String(charJava);
		System.out.println(java2);

		char[] abcdef = { 'A', 'B', 'C', 'D', 'E', 'F' };
		String abc = new String(abcdef, 3, 3);
		System.out.println(abc);

		byte[] ascii = { 65, 66, 67, 68, 69 };
		String abcd = new String(ascii);
		System.out.println(abcd);

		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);

		String java3 = "JAVA";
		String java4 = "JAVA";
		System.out.println(java3);
		System.out.println(java4);

	}

}
