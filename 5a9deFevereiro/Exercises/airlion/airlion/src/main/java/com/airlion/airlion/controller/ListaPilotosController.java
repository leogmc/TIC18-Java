package com.airlion.airlion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.airlion.airlion.modelo.Piloto;
import com.airlion.airlion.repository.PilotoRepository;

@RestController
public class ListaPilotosController {
	
	@Autowired
	private PilotoRepository pilotoRepository;
	
	@RequestMapping("/listapilotos")
	public List<Piloto> listaPilotos() {
		List<Piloto> listaPilotos = (ArrayList<Piloto>) pilotoRepository.findAll();
		return listaPilotos;
	}

}