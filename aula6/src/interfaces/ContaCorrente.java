package interfaces;

public class ContaCorrente implements Conta{
	private String titular;
	private double saldo;
	
	
	public ContaCorrente(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "|ContaCorrente| \nTitular: " + titular + "\nSaldo: R$" + saldo;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public double saque(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		}
		return 0;
	}


	@Override
	public double depositar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double pix(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

}
