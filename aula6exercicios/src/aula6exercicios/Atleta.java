package aula6exercicios;

public class Atleta implements Olimpiadas{
	private String nome;
	private double peso;
	private String modalidade;
	private int totalParticipantes;
	private Pais pais;
	
	
	public Atleta(String nome, double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}


	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String verificaSituacao(String verifica) {
		if (peso > 90) {
			modalidade = "Modalidade: Peso pesado.";
			return modalidade + "\nParticipará";
		}if (peso > 60) {
			modalidade = "Modalidade: Peso medio.";
			return modalidade + "\nParticipará";
		}else {
			return "Não Participará.";
		}
	}
}
