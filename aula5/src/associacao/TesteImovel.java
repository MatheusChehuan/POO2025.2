package associacao;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Matheus", "15626217770");
		Pessoa pessoa2 = new Pessoa("Andrea", "476");
		Imovel imovel1 = new Imovel("Coronel Veiga", "apto", 250000., pessoa1); 
	
		System.out.println(imovel1.toString());
	}

}
