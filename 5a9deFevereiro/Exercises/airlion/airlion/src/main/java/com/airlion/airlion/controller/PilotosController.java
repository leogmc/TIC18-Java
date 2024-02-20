package com.airlion.airlion.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.airlion.airlion.modelo.Piloto;
import com.airlion.airlion.repository.PilotoRepository;

@RestController
@RequestMapping("/pilotos/")
public class PilotosController {

	@Autowired
	private PilotoRepository pilotoRepository;

	@GetMapping
	public List<Piloto> listaPilotos(String nome) {
		List<Piloto> listaPilotos = new ArrayList<>();

		// Verifica se o parametro é nulo
		if (nome == null) {
			listaPilotos = (ArrayList<Piloto>) pilotoRepository.findAll();

		} else {
			listaPilotos = (ArrayList<Piloto>) pilotoRepository.findBynome(nome);
		}
		return listaPilotos;
	}

}