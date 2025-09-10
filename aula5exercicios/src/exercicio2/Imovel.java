package exercicio2;

public class Imovel {
	protected String local;
	protected double valorImovel;
	
	
	public Imovel(String local, double valorImovel) {
		this.local = local;
		this.valorImovel = valorImovel;
	}

	@Override
	public String toString() {
		return "|Imovel| \nLocalização: " + local + "\nValor do imovel: " + String.format("R$ %.2f", valorImovel);
	}
	
	public double calcularImpostoVenda(){
		return valorImovel*0.035;
	}
}