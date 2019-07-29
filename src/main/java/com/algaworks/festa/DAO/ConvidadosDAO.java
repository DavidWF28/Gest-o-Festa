package com.algaworks.festa.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.festa.model.Convidado;

public interface ConvidadosDAO extends JpaRepository<Convidado, Long> {
	
	public List<Convidado>findAll();
	
	

}
