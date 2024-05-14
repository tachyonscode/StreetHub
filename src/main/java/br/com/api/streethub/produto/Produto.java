package br.com.api.streethub.produto;

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
public class Produto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 652334854864932969L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduto;
	
	private Integer idUsuario;
	
	private Integer idComentario;
	
	private Integer idVerificacao;
	
	private String nomeProduto;
	
	private String descricao;
	
	private Double preco;
	
	private Date dataPublicacao;

}
