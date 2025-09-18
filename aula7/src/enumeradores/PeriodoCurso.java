package enumeradores;

public enum PeriodoCurso {
	INTEGRAL("TER E QUI", 40, 2000.), NOTURNO ("QUAR E SEX", 80, 3000.), MANHA("SEX", 80, 3000.);
	
	private String diasSemana;
	private int cargaHoraria;
	private double valor;
	
	private PeriodoCurso(String diasSemana, int cargaHoraria, double valor) {
		this.diasSemana = diasSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public String getDiasSemana() {
		return diasSemana;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public double getValor() {
		return valor;
	}
	
}
