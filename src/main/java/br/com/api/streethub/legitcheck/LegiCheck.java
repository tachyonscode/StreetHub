package br.com.api.streethub.legitcheck;


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
public class LegiCheck {

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
