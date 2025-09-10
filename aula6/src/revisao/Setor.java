package revisao;

public class Setor {
	private int codigo;
	private String descricao;
	
	
	public Setor(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	
	@Override
	public String toString() {
		return "|Setor| \ncodigo: " + codigo + "\ndescricao:" + descricao;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} 

	
}
