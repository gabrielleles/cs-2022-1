package br.com.aula08.endereco;

import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaFisica {
	
	String nome;
    String sexo;
    Date dataNascimento;
    ArrayList<Endereco> enderecos;

}
