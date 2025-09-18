package oficinaExercicio;

public class Proprietario {
	private String nome;

	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\n\n|Proprietario| \n\nNome: " + getNome();
	}

	public String getNome() {
		return nome;
	}
	
	
	
	

}
