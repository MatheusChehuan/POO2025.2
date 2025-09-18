package conexao;

import java.util.Scanner;
import persistence.ClienteDAO;
import entity.Cliente;

public class TesteInserir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome:");
		String nome = sc.nextLine();
		
		System.out.println("Digite um telefone:");
		String telefone = sc.nextLine();
		
		System.out.println("Digite um e:");
		String email = sc.nextLine();
		
		
		Cliente cliente = new Cliente(0, nome, telefone, email);
		
		ClienteDAO dao = new ClienteDAO();
		
		dao.inserir(cliente);
	}

}
