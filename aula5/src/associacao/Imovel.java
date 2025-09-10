package associacao;

public class Imovel {
	private String local;
	private String tipo;
	private double valor;
	// relacionando pessoa com imovel
	private Pessoa pessoa;

	public Imovel(String local, String tipo, double valor, Pessoa pessoa) {
		super();
		this.local = local;
		this.tipo = tipo;
		this.valor = valor;
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "|Imovel| \nLocalização:" + local + "\nTipo: " + tipo + "\nValor:R$ " + String.format("%.2f",valor) + "\n|Dono| " + pessoa;
	}
	
	
}
