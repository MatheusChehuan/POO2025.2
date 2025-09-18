package exercicioLavaRapido;

import java.time.LocalDate;

public class Carro extends Veiculo implements Oficina{
	private TipoServico tiposervico;
	private String categoria;
	private double valortotal;
	public Carro(String modelo, LocalDate dataconserto, Proprietario proprietario, String categoria, TipoServico tiposervico) {
		super(modelo, dataconserto, proprietario);
		this.categoria = categoria;
		this.tiposervico = tiposervico;
	}

	@Override
	public double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		return TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		return TipoServico.REVISAO.getValorPorServico();
	}
	
	public double valorCobrado() {
		valortotal += valorCobrado;
		return 0;
	}
	
	

	
	

}
