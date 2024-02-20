package com.airlion.airlion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.airlion.airlion.modelo.ModeloAeronave;
import com.airlion.airlion.repository.ModeloAeronaveRepository;

@RestController
public class ModeloAeronaveController {
	
	@Autowired
	private ModeloAeronaveRepository modeloAeronaveRepository;
	
	@RequestMapping("/listamodeloaeronaves")
	public List<ModeloAeronave> listaModeloAeronaves() {
		List<ModeloAeronave> listaModeloAeronaves = (ArrayList<ModeloAeronave>) modeloAeronaveRepository.findAll();
		return listaModeloAeronaves;
	}

}