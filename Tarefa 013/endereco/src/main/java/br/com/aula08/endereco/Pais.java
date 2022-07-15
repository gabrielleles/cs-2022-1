package br.com.aula08.endereco;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe reppresenta um País e é 
 * criada para trabalhar com seus atibutos.
 * @author Gabriel Leles
 * @date 15/07/2022 
 * @version 2.0 tarefa008
 */
@Getter
@Setter
public class Pais {
	
    String nome;
    ArrayList<Estado> estado;

}