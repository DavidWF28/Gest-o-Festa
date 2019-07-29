package com.algaworks.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Convidado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private long codigo;
	
	private String nome;
	
	private Integer quantidadedeAcompanhantes;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadedeAcompanhantes() {
		return quantidadedeAcompanhantes;
	}

	public void setQuantidadedeAcompanhantes(Integer quantidadedeAcompanhantes) {
		this.quantidadedeAcompanhantes = quantidadedeAcompanhantes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
