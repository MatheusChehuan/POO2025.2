package exercicio1;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone telefones[];

	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;

	}

	public String getNome() {
		return nome;
	}

	public Telefone[] getTelefone() {
		return telefones;
	}

	public void setTelefone(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void mostrarTelefones() {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] != null) {
				System.out.println("Telefone " + (i+1) + ": " + telefones[i].getNumero());
			}
		}
	}
}
