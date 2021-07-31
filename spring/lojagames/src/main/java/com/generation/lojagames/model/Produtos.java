package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity 	 //Companheiro do create table 
@Table(name = "tb_produtos")	 //Create table 
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		//auto_increment
	private long id;
	
	@NotBlank	//Não nulo e não vazio
	@Size(min = 1, max = 100)
	private String nome; 

	@Min(1) 	//Valor minimo 1 
	private double preco;
	
	private boolean disponivel;

	@ManyToOne						//ManyToOne criando uma chave estrangeira
	private Categoria categoria;	//O tipo do dado deve ser o mesmo nome da classe que eu quero relacionar
									//O tipo dado deve ser o mesmo nome da classe
									//Não esquecer dos getters and setters da categoria
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
