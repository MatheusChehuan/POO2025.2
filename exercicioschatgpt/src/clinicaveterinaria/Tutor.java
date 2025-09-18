package clinicaveterinaria;

public class Tutor {
	private String nome;
	private String telefone;
	
	public Tutor(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "\n|Tutor| \nTutor:" + nome + "\nTelefone:" + telefone;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
