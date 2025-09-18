package lutador;

public class Lutador {
	private String nome;
	private Categoria categoria;
	private int idade;
	private double peso;
	
	
	public Lutador(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}


	public String getNome() {
		return nome;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public int getIdade() {
		return idade;
	}


	public double getPeso() {
		return peso;
	}
	
	public String definirCategoria() {
		if (peso < 70.3){
			return "Peso Leve";
		}else if (peso <= 77.1) {
			return "Peso Meio-Médio";
		}else if (peso <= 83.9) {
			return "Peso Médio";
		}else if (peso <= 93.) {
			return "Peso Meio-Pesado";
		}else if (peso <= 120.2) {
			return "Peso Pesado";
		}else {
			return "Pesadão hein amigão";
		}
	}

}
