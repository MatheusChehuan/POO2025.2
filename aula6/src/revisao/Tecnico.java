package revisao;

public class Tecnico extends Empregado{
	private String nivel;

	
	

	public Tecnico(String nome, double salario, Setor setor, String nivel) {
		super(nome, salario, setor);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return super.toString() + "|Tecnico| \nnivel:" + nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public double calcularHoraExtra() {
		return 0;
	}
}
