package com.icsdevtec.curso_java_basico_aula29;

import com.icsdevtec.curso_java_basico_aula29.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		 Carro corolla= new Carro();	 
		 corolla.marca="toiota";
		 corolla.modelo="cross";
		// corolla.qdtPassageiros=0;
		 corolla.tanqueCombustivel=36;
		 corolla.consCombustivel =11.8;
		
		System.out.println(corolla.qdtPassageiros);

	}

}
