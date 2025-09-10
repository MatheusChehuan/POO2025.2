package exercicio1;

public class AtletaProfissional extends Maratona{
	protected double peso;

	public AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}
	
	public String toString() {
		return super.toString() + "\npeso: " + peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
