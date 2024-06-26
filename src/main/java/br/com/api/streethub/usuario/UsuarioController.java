package br.com.api.streethub.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/streethub/usuario")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	private final UsuarioService us;
	
	@GetMapping
	private Iterable<Usuario> listar(){
		return us.listar();
	}
	
	@GetMapping("/{idUsuario}")
	private ResponseEntity<?> buscar(@PathVariable Integer idUsuario){
		return us.buscarUsuario(idUsuario);
	}
	
	@PostMapping
	private ResponseEntity<?> cadastrar(@RequestBody Usuario u) {
		return us.cadastrarAlterar(u, "cadastrar");
		 
	}
	
	@PutMapping
	private ResponseEntity<?> alterar(@RequestBody Usuario u) {
		return us.cadastrarAlterar(u, "alterar");
		 
	}
	
	@DeleteMapping("/{idUsuario}")
	private ResponseEntity<UsuarioResponse> remover(@PathVariable Integer idUsuario){
		return us.remover(idUsuario);
	}
	
}
