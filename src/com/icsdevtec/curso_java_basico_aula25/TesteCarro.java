package com.icsdevtec.curso_java_basico_aula25;

import com.icsdevtec.curso_java_basico_aula25.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		 Carro corolla= new Carro();	 
		 corolla.marca="toiota";
		 corolla.modelo="cross";
		 corolla.qdtPassageiros=5;
		 corolla.tanqueCombustivel=36;
		 corolla.consCombustivel =11.8;
		 
		 
		 System.out.println(corolla.marca);
		 System.out.println(corolla.modelo);

		  corolla.exibirAutonomia(); // exibição de metodo sem retorno
	}

}
