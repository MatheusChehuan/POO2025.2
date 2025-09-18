package CompeticaoDomestico;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao{
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trocarFerradura() {
		
	}

	@Override
	public void viajar() {
		
	}

	@Override
	public String emitirSom() {
		return null;
	}

	@Override
	public void amamentar() {		
	}

}
