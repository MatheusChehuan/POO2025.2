package erros;

public class TesteException {

	public static void main(String[] args) {
		try {
			System.out.println(calcular(10, 0));

			System.out.println("teste");
		}catch(ArithmeticException erro0) {
			System.err.println("Você dividiu um numero por 0!");
			//err de erro(vermelho)
			erro0.printStackTrace();
		}finally {//dentro daqui roda
			System.out.println("Fechando Banco de dados");
		}
	}

	
	
	
	public static int calcular(int a, int b) {
		/*if (b==0) {
			throw new ("Não é possivel dividir por 0.");
		}*/
		
			return a/b;
	}
}
