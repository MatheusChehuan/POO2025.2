package clinicaveterinaria;

public class Animal {
	String nome;
	int idade;
	String especie;
	Tutor tutor;
	
	public Animal(String nome, int idade, String especie, Tutor tutor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.tutor = tutor;
	}

	
	@Override
	public String toString() {
		return "|Animal| \nNome: " + nome + "\nIdade: " + idade + "\nEspecie: " + especie;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}
	

}
