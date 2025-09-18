package veterinaria;

public class Gato extends AnimalDeEstimacao{
	private String cor;

	public Gato(String nome, int idade, String cor) {
		super(nome, idade);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void imprimir() {
		System.out.println("\nTipo: Gato ");
		super.imprimir();
		System.out.println("Cor: " + cor + "\n");
	}
}
