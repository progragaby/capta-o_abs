package br.itb.projeto.captacaoabs.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.itb.projeto.captacaoabs.model.entity.Usuario;
import br.itb.projeto.captacaoabs.model.service.UsuarioService;

@Controller
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	private UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}

     @GetMapping("/todos")
     public String getAll(ModelMap model) {
    	 
    	 List<Usuario> usuarios = usuarioService.findAll();
    	 
    	 model.addAttribute("usuarios", usuarios);
    	 
    	 return "usuarios";
    	 
    	 
    	 
     }
     
     @GetMapping("/logar")
 	@ResponseBody
 	public ResponseEntity<Object> logar(@RequestParam(name = "usuario") String usuario, @RequestParam String senha) {

 		System.out.println("dados: " + usuario + "  " + senha);

 		// adm.setNome(admService.findAdm(nome, senha));

 		String teste = loginService.findOneLogin(usuario, senha);

 		String[] parcial = teste.split(",");

 		Login login = new Login(Long.parseLong(parcial[0]), parcial[1], parcial[2]);

 		System.out.println(login.getUsuario());

 		return ResponseEntity.status(HttpStatus.OK).body(login);

 	}


}