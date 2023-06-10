package com.icsdevtec.curso_java_basico_aula44.teste;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

	private String raça;

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	// Metodos abstratos - usando o polimorfismos
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub

	}

	// metodos da inteface animald e estimacao
	// metodos da interface animal domesticavel
	@Override
	public void brincar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub

	}

	// metodos da interface animal domesticavel
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub

	}

}
