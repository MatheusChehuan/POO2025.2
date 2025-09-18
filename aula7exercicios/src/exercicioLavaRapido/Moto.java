package exercicioLavaRapido;

import java.time.LocalDate;

public class Moto extends Veiculo implements Oficina{
	private int cilindradas;

	public Moto(String modelo, LocalDate dataconserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataconserto, proprietario);
		this.cilindradas = cilindradas;
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
	

	

}
