package revisaoheranca;

public class Clinica extends Plano{
	private String nome;
	private String cnpj;
	
	public Clinica(String empresa, double valorPago, double valorIss, String nome, String cnpj) {
		super(empresa, valorPago, valorIss);
		this.nome = nome;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\n|Clinica| \nNome: " + nome + "\nCNPJ: " + cnpj ;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	

}
