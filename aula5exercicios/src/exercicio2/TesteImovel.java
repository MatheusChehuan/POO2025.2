package exercicio2;

public class TesteImovel {

	public static void main(String[] args) {
		Apto apto = new Apto("Coronel Veiga",300000.,5);
		Casa casa = new Casa("Bingen", 400000., true);
		Proprietario proprietario1 = new Proprietario("Bolhao", apto);
		Proprietario proprietario2 = new Proprietario("Bolhao", casa);
		
		
		System.out.println(proprietario1.getNome() +"\n"+ apto);
		System.out.println("ITBI: " + String.format("R$ %.2f", apto.calcularImpostoVenda()));
		
		System.out.println("\n" + proprietario2.getNome() +"\n"+ casa);
		System.out.println("ITBI: " + String.format("R$ %.2f", casa.calcularImpostoVenda()));
	}

}
