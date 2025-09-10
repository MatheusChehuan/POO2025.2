package heranca;

public class Diretor extends Funcionario{
	private String tipo;
	private double adicional;
	
	public Diretor(int id, String nome, String email, String string, double salario, String tipo, double adicional) {
		super(id, nome, email, salario);
		this.tipo = tipo;
		this.adicional = adicional;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//sobrescrita
	//@Override
	public double calcularFolha() {
		return super.calcularFolha() + adicional;
	}
	
	
}
