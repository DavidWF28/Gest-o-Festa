package com.algaworks.festa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.service.ConvidadosService;



@Controller
@RequestMapping("/convidados")
public class ConvidadosController {
	
	@Autowired
	private ConvidadosService convidadosService;
	
	@GetMapping
	public ModelAndView listar(){
		ModelAndView mv= new ModelAndView("ListaConvidados");
		mv.addObject("convidado", new Convidado());
		mv.addObject("listaConvidado", this.convidadosService.findAll());
		return mv;	
	}
	
	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidadosService.save(convidado);
		return "redirect:/convidados";
	}
}
	


