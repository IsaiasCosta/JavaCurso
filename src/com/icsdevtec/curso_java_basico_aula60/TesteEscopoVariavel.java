package com.icsdevtec.curso_java_basico_aula60;
import static java.lang.System.out;

public class TesteEscopoVariavel {

	public static void main(String[] args) {
		 
		EscopoVariaveis escopo = new EscopoVariaveis();
		escopo.setValor(10);
		
		out.println(escopo.getValor());
		out.println(escopo.calcularValor(20));
		out.println(escopo.getValor());
		out.println(escopo.teste());
		out.println(escopo.getValor());
		out.println("outro teste");
		escopo.outroTeste();
	
		
	}

}
