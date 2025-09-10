package heranca;

public class pessoaFisica extends ImpostoRenda{
	protected String cpf;
	protected String rg;
	
	public pessoaFisica(String cpf, double d, String rg, String string) {
		super(string, string, d);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	//@Override
	public double calcularIR() {
		return rendimentos*0.15;
	}

}
