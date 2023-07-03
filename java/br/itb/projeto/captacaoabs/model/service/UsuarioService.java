package br.itb.projeto.captacaoabs.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.itb.projeto.captacaoabs.model.entity.Usuario;
import br.itb.projeto.captacaoabs.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}
	
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
}
	
	public int acessar(String email) {
		Usuario usuario = usuarioRepository.finfByEmail(email);
		if (usuario != null) {
			if (usuario.getSenha().equals(senha)) {
			 return 1;
			}
			
		}
		
		return 0;
	}
	
/*	
	String msg = null;
	
	@GetMapping("/login")
	public String getLogin(ModelMap model) {
		
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("msg", msg);
		
		return "login";
	}
	
	
	@PostMapping("/acessar") {
	public String acessar(@RequestParam ("email") String email),
	@RequestParam 
		
	}
	
	/*
}
