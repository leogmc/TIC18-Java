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
	// RECEBER DOIS PARAMETROS, SE UM FOR NULO... SE O OUTRO FOR NULO...
	public List<ModeloAeronave> listaModeloAeronaves(String parametro) {
		List<ModeloAeronave> listaModeloAeronaves = new ArrayList<>();
		
		//Verifica se o parametro é nulo
		if (parametro == null) {
		List<ModeloAeronave> listaModeloAeronaves = (ArrayList<ModeloAeronave>) modeloAeronaveRepository.findAll();
		} else if (parametro == "fabricante") {
			listaModeloAeronaves = (ArrayList<ModeloAeronave>) modeloAeronaveRepository.findByfabricante(parametro);
		}
		
		
		return listaModeloAeronaves;
	}

}