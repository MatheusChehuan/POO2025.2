package clinicaveterinaria;

public class Cachorro extends Animal{
	private String raca;

	public Cachorro(String nome, int idade, String especie, String raca, Tutor tutor) {
		super(nome, idade, especie, tutor);
		this.raca = raca;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Raça: " + raca + "\n" + tutor.toString();
	}


	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
