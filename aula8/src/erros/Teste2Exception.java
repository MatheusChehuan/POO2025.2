package erros;

public class Teste2Exception {

	public static void main(String[] args) {
		try {
			int vetor[] = {2,3,4};
			String texto = "a";
			System.out.println(texto.toUpperCase());
			System.out.println(vetor[5]);
		} catch (NullPointerException e) {
			System.err.println("Esqueceu de instanciar.");
			
		} catch (ArrayIndexOutOfBoundsException a) {
			System.err.println("Posição do vetor invalida.");
		}
	}

}
