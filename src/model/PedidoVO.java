package model;

import java.util.Date;

public class PedidoVO   {
    private Integer id;
	private Date data;
	private Double preco;
	private Integer quantidade;
	private Integer idCliente;
	private Double precoTotal;
	

	public PedidoVO() {
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
	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		
		this.precoTotal = precoTotal;
	}

	public void setIdCliente(Integer idCliente) {
		// TODO Auto-generated method stub
		this.idCliente = idCliente;
	}



}
