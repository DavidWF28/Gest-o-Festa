package com.algaworks.festa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algaworks.festa.DAO.ConvidadosDAO;
import com.algaworks.festa.model.Convidado;

@Service
public class ConvidadosService {
	
	@Autowired
	private ConvidadosDAO convidadosRep;
	
	
	public List<Convidado>findAll(){
		return this.convidadosRep.findAll();
	}
	
	public Convidado save( Convidado convidado) {
		return this.convidadosRep.save(convidado);
	}

}
