package clinicaveterinaria;

public class Gato extends Animal{
	private String cor;
	private Tutor tutor;
	
	public Gato(String nome, int idade, String especie, String cor, Tutor tutor ) {
		super(nome, idade, especie, tutor);
		this.cor = cor;
		this.tutor = tutor;
	}


	@Override
	public String toString() {
		return super.toString() + "\ncor:" + cor + "\n" + tutor.toString();
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Tutor getTutor() {
		return tutor;
	}


	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	
}
