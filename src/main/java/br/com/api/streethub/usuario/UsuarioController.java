package br.com.api.streethub.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/streethub/usuario")
@RequiredArgsConstructor
public class UsuarioController {

private final UsuarioService service;
	
	@GetMapping
	public String helloMessage() {
		return "Hello world!!";
	}
	
}
