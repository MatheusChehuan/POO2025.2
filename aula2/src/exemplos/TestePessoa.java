package exemplos;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		//atribuição direta
		/*pessoa.nome =  "Ana";
		pessoa.altura = 1.70;
		pessoa.peso = 80;*/
		
		pessoa.setNome("Ana");
		pessoa.setAltura(1.70);
		pessoa.setPeso(85.0);
		
		System.out.println("Nome: "+ pessoa.getNome());
		System.out.println("Resultado IMC: "+ pessoa.resultado());
	}

}
