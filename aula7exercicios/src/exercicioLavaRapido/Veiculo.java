package exercicioLavaRapido;

import java.time.LocalDate;

public abstract class Veiculo{
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataconserto;
	protected Proprietario proprietario;
	
	
	public Veiculo(String modelo, LocalDate dataconserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataconserto = dataconserto;
		this.proprietario = proprietario;
	}
	
	
	@Override
	public String toString() {
		return "Veiculo \nModelo: " + modelo + "\nValor Cobrado: " + valorCobrado + "\nData Conserto: " + dataconserto
				+ "\nProprietario: " + proprietario.getNome();
	}


	public double getValorCobrado() {
		return valorCobrado;
	}
	
	

}
