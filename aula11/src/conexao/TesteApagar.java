package conexao;

import persistence.ClienteDAO;

public class TesteApagar {

	public static void main(String[] args) {
		ClienteDAO dao = new ClienteDAO();
		dao.apagar(1);
		System.out.println("Apagado com sucesso!");
	}

}
