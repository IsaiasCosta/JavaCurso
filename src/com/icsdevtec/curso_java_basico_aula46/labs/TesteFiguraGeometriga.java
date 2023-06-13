package com.icsdevtec.curso_java_basico_aula46.labs;

public class TesteFiguraGeometriga {

	public static void main(String[] args) {

		
		 System.out.println("Figuras Geometrica ");
		// Intancias das Figura 3d
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		quadrado.setNome("Quadrado : ");
		
		Circulo circulo = new Circulo();
		circulo.setRaio(2);
		circulo.setNome("Circulo : ");
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(2);
		triangulo.setBase(3);
		triangulo.setNome(" Triangulo : ");
		
		// Intancias das Figura 3d
		Cubo cubo = new Cubo();
		cubo.setAresta(3);
		cubo.setNome("Cubo : ");
		
		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(3);
		cilindro.setRaio(2);
		cilindro.setNome("Cilindro : ");
		
		Piramide piramide = new Piramide();
		piramide.setAltura(3);
		piramide.setArestaApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoligno(4);
		piramide.setBase(quadrado);
		piramide.setNome("Piramide : ");
		FiguraGeometrica [] figuras = new FiguraGeometrica[6];
		figuras[0]= quadrado;
		figuras[1]= circulo;
		figuras[2]= triangulo;
		figuras[3]= cubo;
		figuras[4]= cilindro;
		figuras[5]= piramide;
		
		for (FiguraGeometrica figura : figuras) {
			System.out.println("--------------");
			System.out.println(figura.getNome());
			
			if(figura instanceof FiguraD2){
				FiguraD2 f2d = (FiguraD2)figura;
				System.out.println(f2d.calcularArea());
			}
			if(figura instanceof FiguraD3){
				FiguraD3 f3d = (FiguraD3)figura;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
		}
			
	}

}
