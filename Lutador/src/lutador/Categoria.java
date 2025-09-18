package lutador;

public class Categoria {
	private int codigo;
	private String tipo;
	
	public Categoria(int codigo, String tipo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTipo() {
		return tipo;
	}


}
