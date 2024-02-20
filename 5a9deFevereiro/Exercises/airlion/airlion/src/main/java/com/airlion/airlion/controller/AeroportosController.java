package com.airlion.airlion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlion.airlion.modelo.Aeroporto;
import com.airlion.airlion.repository.AeroportoRepository;

@RestController
public class AeroportosController {
	
	@Autowired
	private AeroportoRepository aeroportoRepository;
	
	@RequestMapping("/listaaeroportos")
	public List<Aeroporto> listaAeroportos() {
		List<Aeroporto> listaAeroportos = (ArrayList<Aeroporto>) aeroportoRepository.findAll();
		return listaAeroportos;
	}

}
