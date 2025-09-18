package erros;

public class TesteConta {

	public static void main(String[] args) {
		try {
			ContaCorrente cc = new ContaCorrente("Roni", 1000.);
			cc.deposito(10);
			
			cc.saque(-1);
			
			System.out.println("Saldo:"+ cc.getSaldo());
		}catch (ContaException e) {
			System.err.println(e.getMessage());
			
		}
		
	}

}
