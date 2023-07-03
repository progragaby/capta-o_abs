package br.itb.projeto.captacaoabs.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.itb.projeto.captacaoabs.model.entity.Usuario;

@Repository
public interface UsuarioRepository 
extends JpaRepository<Usuario, Long> {
	
	Usuario finfByEmail(String email);
	
}