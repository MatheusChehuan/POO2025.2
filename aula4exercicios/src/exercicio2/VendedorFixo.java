package exercicio2;

public class VendedorFixo extends Vendedor{
	private double salarioBase;
	private double comissao;	
	


	public VendedorFixo(String nome, String cpf, double salarioBase) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

    @Override
    public double calcularSalario(double valorVenda) {
        comissao = valorVenda * 0.05;
        return salarioBase + comissao;
    }

}
