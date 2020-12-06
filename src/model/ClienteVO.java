package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClienteVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String endereco;
	private double valorTotal;
	private List<PedidoVO> pedidos = new ArrayList<PedidoVO>();
	 
	public ClienteVO() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer idCliente) {		
		this.id = idCliente;
		// this.idStr = this.id+"";
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<PedidoVO> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoVO> pedidos) {
		this.pedidos = pedidos;
	}
	

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "ClienteVO [id=" + id  + " ,"
				+ " nome=" + nome + ", endereco=" + endereco + ", pedidos=" + pedidos + "]";
	}	

}
