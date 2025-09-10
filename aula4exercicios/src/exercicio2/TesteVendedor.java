package exercicio2;

import java.util.Scanner;

public class TesteVendedor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		VendedorFixo v1 = new VendedorFixo("Matheus", "156262155555", 1500.);
		VendedorFixo v2 = new VendedorFixo("Maria", "156432155555", 1500.);
		VendedorFreelance v3 = new VendedorFreelance("João", "132432155555", 10, 120.);

		System.out.println("-------Sistema de Vendas-------\n");
		System.out.println("Vendedores:");
		System.out.println("1 - " + v1.getNome() + " (Fixo)");
		System.out.println("2 - " + v2.getNome() + " (Fixo)");
		System.out.println("3 - " + v3.getNome() + " (Freelance)");
		System.out.print("Escolha o vendedor (1-3): ");


		int opcao = sc.nextInt();
		sc.nextLine();



		Vendedor escolhido = null;

		switch (opcao) {
		case 1:
			escolhido = v1;
			break;
		case 2:
			escolhido = v2;
			break;
		case 3:
			escolhido = v3;
			break;

		default:
			break;
		}

		String continua;

		do {
			double valorVenda = 0;

			if (escolhido == v1 || escolhido == v2) {
				System.out.print("Digite o valor da venda: ");
				valorVenda = sc.nextDouble();
				sc.nextLine(); // limpa o buffer do nextDouble
			}

			double salario = escolhido.calcularSalario(valorVenda);
			System.out.println("Salário calculado de " + escolhido.getNome() + ": R$" + salario);
			
			System.out.print("Deseja continuar (S/N)?");
			continua = sc.nextLine();

		} while (continua.equalsIgnoreCase("S"));
	}
}