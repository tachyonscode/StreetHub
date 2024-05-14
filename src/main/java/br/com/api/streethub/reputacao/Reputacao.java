package br.com.api.streethub.reputacao;

import java.io.Serializable;

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
public class Reputacao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3016498351090729471L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReputacao;
	
	private Integer idUsuario;
	
	private Integer idProduto;
	
	private Integer idPostagem;

}
