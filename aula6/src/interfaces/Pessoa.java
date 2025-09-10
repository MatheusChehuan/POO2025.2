package interfaces;

public class Pessoa implements Tributos{
	private String nome;
	private double rendimentos;
	
	
	
	
	@Override
	public double calcularImpostoRenda() {
		return rendimentos * irPessoaFisica;
	}
	@Override
	public double calcularIcms() {
		return 0;
	}
	@Override
	public double calcularIpi() {
		// TODO Auto-generated method stub
		return 0;
	}
}