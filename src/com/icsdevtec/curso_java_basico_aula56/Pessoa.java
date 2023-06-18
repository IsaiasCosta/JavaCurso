package com.icsdevtec.curso_java_basico_aula56;

public class Pessoa {
	// atributos
	private TipoDocumento tipoDocumento;

	private String numeroDoc;

	// construtores

	public Pessoa(TipoDocumento tipoDocumento, String numeroDoc) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDoc = numeroDoc;

	}

	public Pessoa() {
		super();
	}

	// Metodos
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	// Metodo ToString
	@Override
	public String toString() {
		return "Pessoa [Tipo do Documento = " + tipoDocumento + ", Nº do Documento = " + numeroDoc + "]";
	}

}
