package exercicio1;

public class Estado {
	private String nomeEstado;
	private String sigla;
	
	
	public Estado(String nomeEstado, String sigla) {
		super();
		this.nomeEstado = nomeEstado;
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "\nEstado: " + nomeEstado + "-" + sigla;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}
	public String getSigla() {
		return sigla;
	}
}