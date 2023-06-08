package com.icsdevtec.curso_java_basico_aula43.teste;

public class Teste {

	
	 public static void main(String[]args) {
		 
		 
		 Aluno aluno = new Aluno();
		 
		 aluno.setCurso("Analise e desenvolvimento de Sistemas");
		 double[] notas= {2.5,5.6,8,9};
		 aluno.setNotas(notas);
		 
		 System.out.println(aluno);
		 
		 //equals
		 
		 String s1 =" exemplo 1";
		 String s2 =" exemplo 1";
		 //System.out.println( s1==s2);
		 System.out.println( s1.equals(s2));
		Aluno  aluno2 = new Aluno();
		 aluno2.setCurso("Analise e desenvolvimento de Sistemas");
		 double[] notas2= {2.8,7.6,12,9};
		 aluno2.setNotas(notas2);
		 System.out.println(aluno.equals(aluno2));
		 
		 
		 
		 
	 }
}
