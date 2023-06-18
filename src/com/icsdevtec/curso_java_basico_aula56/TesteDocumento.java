package com.icsdevtec.curso_java_basico_aula56;

public class TesteDocumento {

	public static void main(String[] args) {
		
		/*for(TipoDocumento doc: TipoDocumento.values()){
			System.out.println(doc + " = " +doc.geraNumeroTeste());
		}*/
		
		Pessoa pessoa = new Pessoa();
		pessoa.setTipoDocumento( Enum.valueOf(TipoDocumento.class,"CPF"));
		pessoa.setNumeroDoc(pessoa.getTipoDocumento().geraNumeroTeste());
		System.out.println("CPF : " + pessoa);
		System.out.println("====== ======== Documentos ");
		pessoa.setTipoDocumento( Enum.valueOf(TipoDocumento.class,"CNPJ"));
		pessoa.setNumeroDoc(pessoa.getTipoDocumento().geraNumeroTeste());
		System.out.println("CNPJ : " + pessoa);
	}

}
