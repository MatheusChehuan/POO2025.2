package exemplos;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		// Criar um novo objeto - instância
		Conta conta1 = new Conta();
		Scanner sc = new Scanner (System.in);

		//leituras
		System.out.println("Digite o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.println("Digite o titular da conta: ");
		String titular = sc.next();
		
		System.out.println("Digite o saldo inicial da conta: ");
		double saldo = sc.nextDouble();
		
		conta1.numero = numero;
		conta1.saldo = saldo;
		conta1.titular = titular;
		
		//deposito
		System.out.println("Digite o valor do deposito: ");
		double valordeposito = sc.nextDouble();
		conta1.deposito(valordeposito);
		
		
		//saque
		System.out.println("Digite o valor de saque: ");
		double valorsaque = sc.nextDouble();
		
		
		if (conta1.saque(valorsaque)) {
			System.out.println("Saque efetuado!");
		}else {
			System.out.println("Saque não efetuado!");
		}
		
		System.out.println("Saldo Atual: "+conta1.saldo+"0");
		
	}
	

}
