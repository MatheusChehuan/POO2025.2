package exercicio1;

public class TesteContato {
	public static void main(String[] args) {
		Estado estado = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade = new Cidade("Petropolis", estado);
		Endereco endereco = new Endereco("Rua Coronel Veiga", "Centro", "12345678", cidade);
		Contato contato = new Contato("Matheus", endereco);

		Telefone[] telefones = {new Telefone("24 98842-9254"), new Telefone("24 98888-8888")};
		
		contato.setTelefone(telefones);

		System.out.println("Nome: " + contato.getNome());
		System.out.println(endereco);
		contato.mostrarTelefones();
		
}
}
