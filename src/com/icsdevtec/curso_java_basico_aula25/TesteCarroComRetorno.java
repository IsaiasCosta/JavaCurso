package com.icsdevtec.curso_java_basico_aula25;

public class TesteCarroComRetorno {

	public static void main(String[] args) {
		Carro corolla= new Carro();	 
		 corolla.marca="Toiota";
		 corolla.modelo="Cross";
		 corolla.qdtPassageiros=5;
		 corolla.tanqueCombustivel=36;
		 corolla.consCombustivel =7.9;
		 
		 
		 System.out.println(corolla.marca);
		 System.out.println(corolla.modelo);
		 
		 double autonomia= corolla.obterAutonomia();
		 
		 System.out.println("Autonomia " + autonomia);

	}

}
