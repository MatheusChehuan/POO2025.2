package revisaoheranca;

public class Medico extends Plano{
	protected String nome;
	protected int crm;
	
	
	public Medico(String empresa, double valorPago, double valorIss, String nome, int crm) {
		super(empresa, valorPago, valorIss);
		this.nome = nome;
		this.crm = crm;
	}
	

	@Override
	public String toString() {
		return super.toString() + "\n\n|Medico|\nNome: " + nome + "\nCRM:" + crm;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCrm() {
		return crm;
	}


	public void setCrm(int crm) {
		this.crm = crm;
	}
	@Override
	public double calcularPagamento() {
		return super.calcularPagamento()*1.10;
	}
}
