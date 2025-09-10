package Exercicio3;

public class Calculadora {
	private double numero_1;
	private double numero_2;
	
	public Calculadora() {
		this.numero_1 = numero_1;
		this.numero_2 = numero_2;
	}
	
	public double getNumero_1() {
		return numero_1;
	}
	public void setNumero_1(double numero_1) {
		this.numero_1 = numero_1;
	}
	public double getNumero_2() {
		return numero_2;
	}
	public void setNumero_2(double numero_2) {
		this.numero_2 = numero_2;
	}

	public double getSoma() {
		return numero_1+numero_2;
	}
	
	public double getSubtracao() {
		return numero_1-numero_2;
	}
	
	public double getMultiplicacao() {
		return numero_1*numero_2;
	}
	public double getDivisao() {
		return numero_1/numero_2;
	}
}