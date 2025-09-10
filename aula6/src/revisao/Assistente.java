package revisao;

public class Assistente extends Empregado{
	private double adicional;

	public Assistente(String nome, double salario, double adicional, Setor setor) {
		super(nome, salario, setor);
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return toString() + "\n|Assistente| \nadicional:" + adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double calcularHoraExtra() {
		return 0;
	}

}
