package com.icsdevtec.curso_java_basico_aula36;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
		contato.setNome("Isaias");
		//contato.setEndereco("Rua: Mandarin ");
		
		// Criar o objeto endereço
		
		Endereco end = new Endereco();
		
		end.setNomeRua("Rua: Mandarin");
		end.setNumero("122");
		end.setComplemento("Apto - 101B");
		end.setCidade("Contagem");
		end.setCep("32145-370");
		end.setEstado("Mg");
		
		contato.setEndereco(end);
		
		//contato.setTelefone("(31)98989-9558");
		//Criar o objeto Telefone
		
		 Telefone tef = new Telefone();
		 tef.setDdd("(31)");
		 tef.setNumero("98989-9558");
		 tef.setTipo("Celular");
		 
		 Telefone tef2 = new Telefone();
		 tef2.setDdd("(31)");
		 tef2.setNumero("97939-5458");
		 tef2.setTipo("Fixo");
		
		 
		  // Relacionamento tem muitos usa o array
		 
		 Telefone[] telefones = new Telefone[2];
		 telefones[0]=tef;
		 telefones[1]=tef2;
		 
		 
		 contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());	
		if(contato!=null && contato.getEndereco() !=null) {
		System.out.println(contato.getEndereco().getCidade());	
		}
		
		/*if(contato!= null && contato.getTelefone()!=null){
			System.out.println(contato.getTelefone().getDdd()+""+ contato.getTelefone().getNumero()+": "+contato.getTelefone().getTipo());
		}*/
		
		if(contato != null && contato.getTelefones()!=null){
			for(Telefone t: contato.getTelefones()) {
				System.out.println(t.getDdd()+""+t.getNumero()+": "+t.getTipo());
			}
		}
	
		
		
		/*System.out.println(end.getNomeRua());
		System.out.println(end.getNumero());
		System.out.println(end.getComplemento());
		System.out.println(end.getCidade());
		System.out.println(end.getCep());
		System.out.println(end.getEstado());*/

	}

}
