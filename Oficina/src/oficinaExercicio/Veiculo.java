package oficinaExercicio;

import java.time.LocalDate;

public class Veiculo{
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "|Veiculo| \n\nModelo: " + modelo + "\nValor Cobrado: R$ " + valorCobrado + "\nData Conserto: " + dataConserto;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

}
