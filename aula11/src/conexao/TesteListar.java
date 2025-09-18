package conexao;

import entity.Cliente;
import persistence.ClienteDAO;

public class TesteListar {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1,"José","jose@gmail.com","2222");
		ClienteDAO dao = new ClienteDAO();
		dao.listar();
		System.out.println("Cliente alterado com sucesso!");

	}

}