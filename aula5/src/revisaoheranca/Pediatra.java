package revisaoheranca;

public class Pediatra extends Medico{
	private boolean aplicaVacina;

	public Pediatra(String empresa, double valorPago, double valorIss, String nome, int crm, boolean aplicaVacina) {
		super(empresa, valorPago, valorIss, nome, crm);
		this.aplicaVacina = aplicaVacina;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\n|Pediatra| \nPediatra aplica vacina? " + (aplicaVacina?"Aplica a Vacina":"Não aplica");
	}

	public boolean isAplicaVacina() {
		return aplicaVacina;
	}

	public void setAplicaVacina(boolean aplicaVacina) {
		this.aplicaVacina = aplicaVacina;
	}
	
}
