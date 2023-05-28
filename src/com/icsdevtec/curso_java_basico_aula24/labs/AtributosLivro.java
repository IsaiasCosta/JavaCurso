package com.icsdevtec.curso_java_basico_aula24.labs;

public class AtributosLivro {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome="Watchmen";
		livro.autor="Alan Moore";
		livro.pagina=216;
		livro.Editora="Panini";
		livro.isbn="Panini";
		livro.anoLancamento=2022;
		System.out.println("======= ficha técnica ============");
		
		
		System.out.println("Nome do livro : " +livro.nome);
		System.out.println("Autor : "+ livro.autor);
		System.out.println("quantidade de páginas : " +livro.pagina);
		System.out.println("Editora : "+ livro.Editora);
		System.out.println("Isbn : "+ livro.isbn);
		System.out.println("Ano da publicação : "+ livro.anoLancamento);

	}

}
