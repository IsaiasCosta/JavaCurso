package com.icsdevtec.curso_java_basico_aula46.teste;

public interface BancoDados extends SqlDcl,SqlDdl, SqlDml {

	void abrirConexao();

	void fecharConexao();
}
