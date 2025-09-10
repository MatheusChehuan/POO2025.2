package heranca;

public class PessoaJuridica extends ImpostoRenda {
	protected String cnpj;
	protected String razaosocial;
	
	
	public PessoaJuridica(String nome, String email, double rendimentos, String cnpj, String razaosocial) {
		super(nome, email, rendimentos);
		this.cnpj = cnpj;
		this.razaosocial = razaosocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getRazaosocial() {
		return razaosocial;
	}


	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}


	//@Override
	public double calcularIR() {
		return rendimentos * 0.20;
	}
	

}
