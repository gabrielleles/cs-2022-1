package br.com.aula08.endereco;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bairro {
     String nome;
	 ArrayList<Endereco> enderecos;
	 Cidade cidade;    
}
