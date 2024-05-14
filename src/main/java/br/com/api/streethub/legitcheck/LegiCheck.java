package br.com.api.streethub.legitcheck;


import java.io.Serializable;

import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table("legi_check")
public class LegiCheck implements Serializable {

   /**
	 * 
	 */
	private static final long serialVersionUID = 4446965541930265849L;

@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVerificacao;
	
	private Integer idSeguro;
	
	private Integer idProduto;
	
	private Integer idUsuario;
	
	private Integer idPostagem;
	
	private String status;
	
	private Integer valor;
	
}
