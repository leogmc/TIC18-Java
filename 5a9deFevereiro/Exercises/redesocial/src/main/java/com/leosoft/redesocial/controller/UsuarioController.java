package com.leosoft.redesocial.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leosoft.redesocial.controller.DTO.UsuarioDTO;
import com.leosoft.redesocial.modelo.Usuario;

@RestController
public class UsuarioController {
	
	
//	@RequestMapping("/listausuarios")
//	public ArrayList<Usuario> listUsuarios() {
//		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
//		Usuario u1 = new Usuario((long)21,"leogmc","leo@gmail.com","1234");
//		Usuario u2 = new Usuario((long)20,"lufecr","luiz@gmail.com","7890");
//		Usuario u3 = new Usuario((long)30,"matue","30praum@gmail.com","7777");
//		
//		usuarios.add(u1);
//		usuarios.add(u2);
//		usuarios.add(u3);
//		
//		return usuarios;
//	}
	
	@RequestMapping("/listausuarios")
	public ArrayList<UsuarioDTO> listUsuarios() {
		ArrayList<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
		usuarios.add(new UsuarioDTO (new Usuario((long)21,"leogmc","leo@gmail.com","1234")));
		usuarios.add(new UsuarioDTO (new Usuario((long)20,"lufecr","luiz@gmail.com","7890")));
		usuarios.add(new UsuarioDTO (new Usuario((long)30,"matue","30praum@gmail.com","7777")));

		
		return usuarios;
	}

}
