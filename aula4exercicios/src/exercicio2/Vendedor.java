package exercicio2;

public class Vendedor {
	protected String nome;
	protected String cpf;
	
	
	public Vendedor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	  // Método polimórfico
    public double calcularSalario(double valor) {
        return 0; // (sobrescrita nas subclasses)
}
    
}