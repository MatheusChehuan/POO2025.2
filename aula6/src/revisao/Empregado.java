package revisao;
//abstract serve para não dar new
public abstract class Empregado {
	protected String nome;
	protected double salario;
	protected Setor setor;
	
	public Empregado(String nome, double salario, Setor setor) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
	}

	
	@Override
	public String toString() {
		return "|Empregado| \nNome:" + nome + "\nSalario:" + salario + "Setor:" + setor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	//obriga abstract os outros a usarem
	public abstract double calcularHoraExtra();
	
}