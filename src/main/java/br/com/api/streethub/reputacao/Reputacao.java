package br.com.api.streethub.reputacao;

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
public class Reputacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReputacao;
	
	private Integer idUsuario;
	
	private Integer idProduto;
	
	private Integer idPostagem;

}
