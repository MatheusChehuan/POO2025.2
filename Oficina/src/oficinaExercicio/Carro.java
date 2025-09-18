package oficinaExercicio;

import java.time.LocalDate;
import java.time.DayOfWeek; // isso aqui eu não conhecia


public class Carro extends Veiculo implements Oficina{
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCategoria: " + categoria + proprietario.toString();
	}

	@Override
	public double lavarVeiculo() {
		valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double trocarOleo() {
		// TODO Auto-generated method stub
		valorCobrado = TipoServico.OLEO.getValorPorServico();
		if (dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY){
			this.valorCobrado = valorCobrado - 50.;
		}
		return valorCobrado;
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		valorCobrado = TipoServico.REVISAO.getValorPorServico();
		if (dataConserto.getMonthValue()==8) {
			this.valorCobrado = valorCobrado *0.9;
		}
		return valorCobrado += TipoServico.REVISAO.getValorPorServico();
		
		
	}	
}
