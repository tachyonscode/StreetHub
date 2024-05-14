package br.com.api.streethub.postagem;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Postagem implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8071226409456489858L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPostagem;
	
	private Integer idUsuario;
	
	private Integer idComentario;
	
	private String nomePost;
	
	private String descricao;
	
	private Date dataPublicacao;

}
