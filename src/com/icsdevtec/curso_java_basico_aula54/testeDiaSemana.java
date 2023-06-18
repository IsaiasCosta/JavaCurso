package com.icsdevtec.curso_java_basico_aula54;

public class testeDiaSemana {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString() + " = " + dia.getValor());
		
		Data data = new Data(18,6,2023,DiaSemana.DOMINGO);
		System.out.println("Dia : " +data.getDia()+ " Mês:"+data.getMes()+ " Ano :" +data.getAno()+ " Dia da Semana: "+data.getDiaSemana());
		
	}

}
