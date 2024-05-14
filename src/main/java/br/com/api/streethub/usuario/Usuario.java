package br.com.api.streethub.usuario;

import java.io.Serializable;

import br.com.api.streethub.reputacao.Reputacao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5749600936771522383L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	private Integer idReputacao;
	
	private String nome;
	
	private String sobrenome;
	
	private String endereco;
	
	private Integer telefone;
	
	private Integer ddd;
	
		
}
