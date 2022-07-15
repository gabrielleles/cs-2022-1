package br.com.aula08.endereco;

import java.util.ArrayList;

/**
 * Classe reppresenta um Endereço e é 
 * criada para trabalhar com seus atibutos.
 * @author Gabriel Leles
 * @date 15/07/2022 
 * @version 2.0 tarefa008
 */
public class Endereco {
	
	Integer numero;
    String complemento;
    Integer cep;
    Logradouro logradouro;
    ArrayList<PessoaFisica> pessoaFisica;
    TipoEndereco ti;
    Bairro bairro; 

}
