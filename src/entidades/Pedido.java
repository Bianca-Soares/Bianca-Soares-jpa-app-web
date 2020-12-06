package entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import utilitarios.GeradorID;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable  {
	  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)  // DATE - retorna apenas a data 
	private Date data;
	
	private Double preco;
	private Integer quantidade;
	private Integer idCliente;

	@Column(name = "preco_total", precision=18, scale=2)
	private Double precoTotal;

	public Pedido() {
	  // cria uma chave numérica única (ID)	
	  this.id =	GeradorID.geraNumeroID();
	}

	// getters e setters
	public Integer getId() {
		return id;
		}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double double1) {
		this.precoTotal = double1;
	}
	


}
