package Exercicio3;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		//iniciei com 0 pra abrir o menu
		int operacao = 0;
		double numero1 = 0, numero2 = 0;
		//tem que inicializar, ainda não entendi o motivo
		Calculadora calculadora = new Calculadora();
		//escanear a entrada
		Scanner sc = new Scanner(System.in);
		
		//menu
		System.out.println("Bem vindo a calculadora! \n");
		
		
		
		//menu operação
		System.out.println("Escolha a operação:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicacão");
		System.out.println("4 - Divisão");
		System.out.println("5 - Sair");
		
		//lendo operacao
		operacao = sc.nextInt();	
		
		//fechar
		if (operacao == 5) {
		sc.close();
		System.out.println("Até a próxima");
		return;
		}
		
		//lendo entradas
		System.out.println("Digite o primeiro numero: ");
		numero1 = sc.nextDouble();
				
		System.out.println("Digite o segundo numero: ");
		numero2 = sc.nextDouble();
				
		//aqui eu to unindo o numero1 que eu recebi ao numero_1 do Calculadora
		calculadora.setNumero_1(numero1);
		calculadora.setNumero_2(numero2);
		
		switch (operacao) {
		case 1:
			System.out.println("Soma: " + calculadora.getSoma());
			break;
		case 2:
			System.out.println("Subtração: " + calculadora.getSubtracao());
			break;
		case 3:
			System.out.println("Multiplicação: " + calculadora.getMultiplicacao());
			break;
		case 4:
			System.out.println("Divisão: " + calculadora.getDivisao());
			break;
		default:
	        System.out.println("Opção inválida!");
			break;
		}
		sc.close();
		System.out.print("\nCalculadora encerrada.");
	}
}