package utilitarios;

import entidades.Cliente;

public class CalculadoraTotal {

	public static Double calcPrecoTotal(int quantidade, Double preco) {
		Double total = (preco * quantidade);
		return total;
	}
	
	public static Double calcValorTotal(Double valorTotal, Double precoTotal) {
		valorTotal = valorTotal + precoTotal;
		return valorTotal;
	}
	
}
