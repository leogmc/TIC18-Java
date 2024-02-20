package com.leosoft.redesocial.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leosoft.redesocial.controller.DTO.UsuarioDTO;
import com.leosoft.redesocial.modelo.Usuario;
import com.leosoft.redesocial.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario/")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping
	public List<UsuarioDTO> listaUsuarios(String nome) {
		List<Usuario> listaUsuarios = new ArrayList<>();
		//Verifica se o parametro é nulo
		if (nome == null) {
			listaUsuarios = (ArrayList<Usuario>) usuarioRepository.findAll();
		} else {
			listaUsuarios = (ArrayList<Usuario>) usuarioRepository.findBynome(nome);
		}
		List<UsuarioDTO> lista = new ArrayList<UsuarioDTO>();
		for (Usuario u : listaUsuarios) {
			UsuarioDTO ud = new UsuarioDTO(u);
			lista.add(ud);
		}
		return lista;
	}
}
