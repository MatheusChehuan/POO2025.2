package revisaoheranca;

public class Anestesista extends Medico{
	private String tipoAnestesia;

	public Anestesista(String empresa, double valorPago, double valorIss, String nome, int crm, String tipoAnestesia) {
		super(empresa, valorPago, valorIss, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\n|Anestesista| \nAnestesia: " + tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}
	
	@Override
	public double calcularPagamento() {
		return super.calcularPagamento() + 1000.;
	}
}
