package br.com.aula08.endereco;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe reppresenta um Estado e é 
 * criada para trabalhar com seus atibutos.
 * @author Gabriel Leles
 * @date 15/07/2022 
 * @version 2.0 tarefa008
 */
@Getter
@Setter
public class Estado {
	
	private String sigla;
    String nome;
    ArrayList<Cidade> cidades;
    Pais pais;

}
