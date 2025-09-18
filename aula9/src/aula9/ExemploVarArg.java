package aula9;

import java.util.Iterator;

public class ExemploVarArg {

	public static void main(String[] args) {
		System.out.println("Resultado da Soma: " + calcularSoma(10,20,30,50,2));

	}
	public static int calcularSoma(int numero,int... numeros) {
		int soma = 0;
		for (int i:numeros) {
			soma += i;
		}
		return soma;
	}
}
