package veterinaria;

public class Cachorro extends AnimalDeEstimacao{
	private String raca;

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void imprimir() {
		System.out.println("\nTipo: Cachorro ");
		super.imprimir();
		System.out.println("Raça: " + raca + "\n");
	}
}