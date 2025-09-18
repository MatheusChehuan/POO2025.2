package exercicioLavaRapido;

public enum TipoServico {
		OLEO(100.), LAVAGEM (50.), REVISAO(250.);

		private double valorPorServico;
		
		private TipoServico( double ValorPorServico) {
			
		}

		public double getValorPorServico() {
			return valorPorServico;
		}
		
}
