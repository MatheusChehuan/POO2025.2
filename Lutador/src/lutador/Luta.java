package lutador;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean confirmado;
	

	public Luta(Lutador desafiante, Lutador desafiado, int rounds) {
		super();
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
		this.confirmado = false;
	}


	public Lutador getDesafiante() {
		return desafiante;
	}




	public Lutador getDesafiado() {
		return desafiado;
	}




	public int getRounds() {
		return rounds;
	}



	public boolean confirmarLuta() {
		if (desafiante == desafiado) { 
			this.confirmado = false;
			return confirmado;
		}
		
		if (desafiante.definirCategoria() == desafiado.definirCategoria()) {
			this.confirmado = true;
			return confirmado;
		}
		
		return confirmado;
	}
	
	
	public boolean isConfirmado() {
		if (confirmado == true) {
			System.out.println("A luta irá Acontecer");
			return confirmado;
		}else{
	
			System.out.println("A luta não irá Acontecer");
			return confirmado;
		}
		
	}
}