package com.airlion.airlion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.airlion.airlion.modelo.ModeloAeronave;
import com.airlion.airlion.repository.ModeloAeronaveRepository;

@RestController
@RequestMapping("/modeloaeronave/")
public class ModeloAeronaveController {
	
	@Autowired
	private ModeloAeronaveRepository modeloAeronaveRepository;
	
	@GetMapping
	public List<ModeloAeronave> listaModeloAeronaves(String nome, String fabricante) {
		List<ModeloAeronave> listaModeloAeronaves = new ArrayList<>();
		
		if (nome != null ) {
			listaModeloAeronaves = (ArrayList<ModeloAeronave>) modeloAeronaveRepository.findBynome(nome);		
		} else if (fabricante != null) {
			listaModeloAeronaves = (ArrayList<ModeloAeronave>) modeloAeronaveRepository.findByfabricante(fabricante);
	 	} else {
			listaModeloAeronaves = (ArrayList<ModeloAeronave>) modeloAeronaveRepository.findAll();
		}
		return listaModeloAeronaves;
	}

}