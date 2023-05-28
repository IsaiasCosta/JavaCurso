package com.icsdevtec.curso_java_basico_aula24.labs;

public class AtributoLivroLivraria {

	public static void main(String[] args) {
		
		LivroLivraria  livrolivraria = new LivroLivraria ();
		livrolivraria .nome="Watchmen";
		livrolivraria .autor="Alan Moore";
		livrolivraria .pagina=216;
		livrolivraria .Editora="Panini";
		livrolivraria .isbn="Panini";
		livrolivraria .anoLancamento=2022;
		livrolivraria.preco = 59.99;
		System.out.println("======= ficha técnica ============");
		
		
		System.out.println("Nome do livrolivraria livraria  : " +livrolivraria .nome);
		System.out.println("Autor : "+ livrolivraria .autor);
		System.out.println("quantidade de páginas : " +livrolivraria .pagina);
		System.out.println("Editora : "+ livrolivraria .Editora);
		System.out.println("Isbn : "+ livrolivraria .isbn);
		System.out.println("Ano da publicação : "+ livrolivraria .anoLancamento);
		System.out.println("Preço do Livro : R$ "+ livrolivraria.preco);

	}

}
