package CompeticaoDomestico;

import java.time.LocalDate;

public abstract class Mamifero extends Animal{
	private String raca;
	
	public Mamifero(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao);
		this.raca = raca;
	}
	
	public abstract void amamentar();

}
