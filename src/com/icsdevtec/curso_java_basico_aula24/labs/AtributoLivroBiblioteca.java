package com.icsdevtec.curso_java_basico_aula24.labs;

import java.util.Date;

public class AtributoLivroBiblioteca {

	public static void main(String[] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome="Watchmen";
		livro.autor="Alan Moore";
		livro.pagina=216;
		livro.Editora="Panini";
		livro.isbn="Panini";
		livro.anoLancamento=2022;
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.AlugadoPara="Juliana";

		
		System.out.println("Nome do livrolivraria livraria  : " +livro .nome);
		System.out.println("Autor : "+ livro .autor);
		System.out.println("quantidade de páginas : " +livro.pagina);
		System.out.println("Editora : "+ livro.Editora);
		System.out.println("Isbn : "+ livro.isbn);
		System.out.println("Ano da publicação : "+ livro.anoLancamento);
		System.out.println("livro foi emprestado : " + livro.emprestado);
		System.out.println("livro foi emprestado na data : " + livro.dataEntrega);
		System.out.println("Quem alugou o livro : " + livro.AlugadoPara);
	}

}
