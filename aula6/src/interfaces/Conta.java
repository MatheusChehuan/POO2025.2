package interfaces;
//interface não permite new
//todos os metodos são abstratos
//interface não tem implementação (por enquanto)
public interface Conta {
	
	//assinaturas de metodos abstratos
	public double saque(double valor);
	public double depositar(double valor);
	public double pix(double valor);

}
