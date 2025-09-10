package Exercicio1;

public class Funcionario {
	private String nome;
	private double salario;
	private double vt;


	public double getVt() {
		vt = salario*0.06;
		return vt;
	}


	public void setVt(double vt) {
		this.vt = vt;
	}


	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
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
	
	public double getSalario_liquido() {
		return salario* 0.83;
	}
	
	public double calcularInss() {
		return salario* 0.11;
	}

	
}
