package Exercicio2;

import java.util.Scanner;

public class TesteProduto {
	

	public static void main(String[] args) {
		Produto produto;
		String confirma = "n";
		Scanner sc = new Scanner(System.in);
		
	do {
		System.out.print("Produto: ");
		String nome = sc.next();
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		System.out.print("Qtde: ");
		int quantidade = sc.nextInt();
		
		
		produto = new Produto(nome,valor,quantidade);
        //produto.setDescricao(nome);
        //produto.setValor(valor);
        //produto.setQuantidade(quantidade);
        
        
		System.out.printf("Descrição: %s\nValor:R$ %.2f\nTotal:R$ %.2f\nICMS:R$ %.2f" , produto.getDescricao(), produto.getValor(), produto.getValor()* produto.getQuantidade(), produto.calcularIcms());
		System.out.println("\nDeseja encerrar o programa? (Y/N) ");
		confirma = sc.next();
		
	}while(!confirma.equalsIgnoreCase("Y"));
	
	sc.close();
	System.out.print("\nPrograma encerrado.");
	}

}
