package com.icsdevtec.curso_java_basico_aula46.labs;

public class Piramide extends FiguraD3 {

	private double altura;

	private double arestaBase;

	private double arestaApotema;

	private int numPoligno;

	private FiguraD2 base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getArestaApotema() {
		return arestaApotema;
	}

	public void setArestaApotema(double arestaApotema) {
		this.arestaApotema = arestaApotema;
	}

	public FiguraD2 getBase() {
		return base;
	}

	public void setBase(FiguraD2 base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		if (base!=null) {
			return (numPoligno * ((arestaBase * arestaApotema) / 2))+base.calcularArea();
		}
		return 0;
	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			return (base.calcularArea() * altura / 3);
		}
		return 0;
	}

	public int getNumPoligno() {
		return numPoligno;
	}

	public void setNumPoligno(int numPoligno) {
		this.numPoligno = numPoligno;
	}
}
