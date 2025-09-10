package revisaoheranca;

public class controlePagamentos {
	private double totalPago;


	public double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}
	
	public void calcularTotalPago(Plano plano) {
		totalPago += plano.getValorPago() + plano.calcularPagamento();
	}
	
}
