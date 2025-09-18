package entity;

public class Empregado {
	private String nome;
	private String profissão;
	
	public Empregado(String nome, String profissão) {
		super();
		this.nome = nome;
		this.profissão = profissão;
	}

	@Override
	public String toString() {
		return "\nEmpregado \nNome: " + nome + "\nProfissão: " + profissão;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissão() {
		return profissão;
	}

	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}
	
	
	
	

}
