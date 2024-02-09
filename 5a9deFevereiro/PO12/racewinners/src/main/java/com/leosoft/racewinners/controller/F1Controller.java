package com.leosoft.racewinners.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class F1Controller {

	private List<Vencedor> vencedores = new ArrayList<>();

	// Construtor que iniciar o método de carregar o arquivo .csv
	public F1Controller() {
		carregarDadosCSV();
	}

	private void carregarDadosCSV() {
		try {
			InputStream inputStream = getClass().getResourceAsStream("pilotos.csv");
			if (inputStream != null) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
				String linha;
				while ((linha = reader.readLine()) != null) {
					String[] dados = linha.split(";");
					if (dados.length >= 3) {
						vencedores.add(new Vencedor(dados[0], dados[1], Integer.parseInt(dados[2])));
					} else {
						System.err.println("Formato inválido da linha: " + linha);
					}
				}
			} else {
				System.err.println("Arquivo pilotos.csv não encontrado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Lista todos os vencedores
	@GetMapping("/todos")
	public List<Vencedor> listarTodosVencedores() {
		return vencedores;
	}

	// Lista todos os vencedores brasileiros
	@GetMapping("/brasileiros")
	public List<Vencedor> listarVencedoresBrasileiros() {
		List<Vencedor> brasileiros = new ArrayList<>();
		for (Vencedor v : vencedores) {
			if (v.getPais().equalsIgnoreCase("Brasil")) {
				brasileiros.add(v);
			}
		}
		return brasileiros;

	}

	// Lista dos top 5 vencedores
	@GetMapping("/top5")
	public ArrayList<Vencedor> listarTop5() {

		List<Vencedor> lista = vencedores;

		// Crie um Comparator para comparar objetos com base no atributoInteiro
		Comparator<Vencedor> comparador = Comparator.comparingInt(Vencedor::getVitorias);

		// Ordene a lista usando o Comparator
		Collections.sort(lista, comparador.reversed());

		ArrayList<Vencedor> top5 = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			top5.add(lista.get(i));
		}

		return top5;
	}
	
	// Lista dos top 10 vencedores
		@GetMapping("/top10")
		public ArrayList<Vencedor> listarTop10() {

			List<Vencedor> lista = vencedores;

			// Crie um Comparator para comparar objetos com base no atributoInteiro
			Comparator<Vencedor> comparador = Comparator.comparingInt(Vencedor::getVitorias);

			// Ordene a lista usando o Comparator
			Collections.sort(lista, comparador.reversed());

			ArrayList<Vencedor> top10 = new ArrayList<>();

			for (int i = 0; i < 10; i++) {
				top10.add(lista.get(i));
			}

			return top10;
		}
		
		// Lista numero de vitórias por pais (Ordem decrescente)
				@GetMapping("/porpais")
				public ArrayList<Vencedor> listarPorPais() {

					List<Vencedor> lista = vencedores;

					// Crie um Comparator para comparar objetos com base no Pais
					Comparator<Vencedor> comparador = Comparator.comparing(Vencedor::getPais);

					// Ordene a lista usando o Comparator
					Collections.sort(lista, comparador.reversed());

					ArrayList<Vencedor> top10 = new ArrayList<>();

					for (int i = 0; i < 10; i++) {
						top10.add(lista.get(i));
					}

					return top10;
				}



}
