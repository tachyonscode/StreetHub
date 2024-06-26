package br.com.api.streethub.pedido;

import java.io.Serializable;
import java.sql.Date;

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
public class Pedido implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7606412369346740004L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPedido;
	
	private Integer idUsuario;
	
	private Integer idProduto;
	
	private Integer idVerificacao;
	
	private Double preco;
	
	private Date dataPedido;
	
	private Integer pagamento;

}
