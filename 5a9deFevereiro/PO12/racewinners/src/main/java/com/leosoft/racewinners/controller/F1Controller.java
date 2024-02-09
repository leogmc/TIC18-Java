package com.leosoft.racewinners.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class F1Controller {
	
	private List<Vencedor> vencedores = new ArrayList<>();
	
	//Construtor que iniciar o método de carregar o arquivo .csv
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

	
	@GetMapping("/todos")
	public List<Vencedor> listarTodosVencedores() {
	    return vencedores;
	}

	
	
	
	
	

//	
//	@RequestMapping("/")
//	@ResponseBody
//	public String hello() {
//		return "Home";
//	}

}
