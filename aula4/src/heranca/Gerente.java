package heranca;

public class Gerente extends Funcionario{
	private double comissao;

	public Gerente(int id, String nome, String email, String string, double salario, double comissao) {
		super(id, nome, email, salario);
		this.comissao = comissao;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nComissao: " + comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	

	
	
}
