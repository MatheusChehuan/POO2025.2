package enumeradores;

public class Curso {
	private String nome;
	private PeriodoCurso periodocurso;
	public Curso(String nome, PeriodoCurso periodocurso) {
		super();
		this.nome = nome;
		this.periodocurso = periodocurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public PeriodoCurso getPeriodocurso() {
		return periodocurso;
	}
	public void setPeriodocurso(PeriodoCurso periodocurso) {
		this.periodocurso = periodocurso;
	}


}
