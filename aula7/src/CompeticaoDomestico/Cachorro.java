package CompeticaoDomestico;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico{
	private boolean castrado;
	
	public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean levarVeterinario() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alimentar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
