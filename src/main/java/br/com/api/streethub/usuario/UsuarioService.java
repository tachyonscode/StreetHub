package br.com.api.streethub.usuario;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

	@Autowired
	private UsuarioRepository ur;
	
	@Autowired
	private final UsuarioResponse response;
	
	//Metodo para listar todos os Usuarios
	public Iterable<Usuario> listar() {
		return ur.findAll();
		
	}
	
	//Metodo para buscar Usuario
	public ResponseEntity<?> buscarUsuario(Integer idUsuario) {
		Optional<Usuario> usuario = ur.findById(idUsuario);
		
		if (usuario.isPresent()) {
			return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
		} else {
			response.setMensagem("Usuario de id " + idUsuario + " não encontrado");
			return new ResponseEntity<UsuarioResponse>(response, HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	//Metodo para cadastrar ou alterar Usuario
	public ResponseEntity<?> cadastrarAlterar(Usuario u, String acao) {
		
		if(u.getNome().equals("")) {
			response.setMensagem("[Nome] não pode estar vazio");
			return new ResponseEntity<UsuarioResponse>(response, HttpStatus.BAD_REQUEST);
			
		} else if (u.getSobrenome().equals("")) {
			response.setMensagem("[Sobrenome] não pode estar vazio");
			return new ResponseEntity<UsuarioResponse>(response, HttpStatus.BAD_REQUEST);
			
		} else if (u.getEndereco().equals("")) {
			response.setMensagem("[Endereco] não pode estar vazio");
			return new ResponseEntity<UsuarioResponse>(response, HttpStatus.BAD_REQUEST);
		} else {
			
			if(acao.equals("cadsatrar")) {
				return new ResponseEntity<Usuario>(ur.save(u), HttpStatus.CREATED);
				
			} else {
				return new ResponseEntity<Usuario>(ur.save(u), HttpStatus.OK);
				
			}
			
		}
		
	}
	
	//Metodo para remover Usuario
	public ResponseEntity<UsuarioResponse> remover(Integer idUsuario) {
		Optional<Usuario> usuario = ur.findById(idUsuario);
		
		if (usuario.isPresent()) {
			ur.deleteById(idUsuario);
			response.setMensagem("Usuario de id " + idUsuario + " removido com sucesso");
			return new ResponseEntity<UsuarioResponse>(response, HttpStatus.OK);
		} else {
			response.setMensagem("Usuario de id " + idUsuario + " não encontrado");
			return new ResponseEntity<UsuarioResponse>(response, HttpStatus.NOT_FOUND);
		}
		
		
		
	}
	
}
