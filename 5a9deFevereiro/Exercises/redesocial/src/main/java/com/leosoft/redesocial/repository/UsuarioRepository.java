package com.leosoft.redesocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leosoft.redesocial.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}
