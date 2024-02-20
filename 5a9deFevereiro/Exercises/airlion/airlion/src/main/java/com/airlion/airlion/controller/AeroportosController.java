package com.airlion.airlion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airlion.airlion.modelo.Aeroporto;
import com.airlion.airlion.repository.AeroportoRepository;

@RestController
@RequestMapping("/aeroportos/")
public class AeroportosController {
	
	@Autowired
	private AeroportoRepository aeroportoRepository;
	
	@GetMapping
	public List<Aeroporto> listaAeroportos(String icao, String nome) {
		List<Aeroporto> listaAeroportos = new ArrayList<>();
		
		if(nome != null) {
			listaAeroportos = (ArrayList<Aeroporto>) aeroportoRepository.findBynome(nome);
		} else if (icao != null){
			listaAeroportos = (ArrayList<Aeroporto>) aeroportoRepository.findByicao(icao);
		} else {
			listaAeroportos =  (ArrayList<Aeroporto>) aeroportoRepository.findAll();
		}
			
		return listaAeroportos;	
	}

	
	
}
