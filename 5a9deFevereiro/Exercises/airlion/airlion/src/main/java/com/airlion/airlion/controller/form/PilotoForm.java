package com.airlion.airlion.controller.form;

import com.airlion.airlion.modelo.Piloto;

public class PilotoForm {
	
	private Long id;
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public PilotoForm() {
		super();
	}
	public PilotoForm(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//Métodos
	public Piloto toPiloto(){
		Piloto piloto = new Piloto();
		
		piloto.setId(id);
		piloto.setNome(nome);
		
		return piloto;
	}
	
	
}
