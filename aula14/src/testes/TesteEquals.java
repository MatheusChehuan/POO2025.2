package testes;

import entity.Fornecedor;

public class TesteEquals {

	public static void main(String[] args) {

		Fornecedor f1 = new Fornecedor("123", "ABC 123");
		Fornecedor f2 = new Fornecedor("123", "ABC 123");
		
		System.out.println(f1.equals(f2));
		
		System.out.println(f1.getRazaoSocial().equals(f2.getRazaoSocial()));
	}

}
