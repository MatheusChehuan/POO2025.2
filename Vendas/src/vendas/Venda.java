package vendas;

import java.time.LocalDate;

public class Venda implements FinalizarVenda{
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private double totalVenda;
	
	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}
	
	

	@Override
	public String toString() {
		return "Total por Item:" + produto + ", dataCompra=" + dataCompra + ", quantidade=" + quantidade
				+ ", totalVenda=" + totalVenda + "]";
	}



	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		totalVenda = produto.getValor()*quantidade;
	}
	
	public void mostrarVenda() {
		System.out.println("Qtde: " + quantidade + " - " + produto.getDescricao() + " - "+ String.format(" R$ %.2f",totalVenda));
	}
}
