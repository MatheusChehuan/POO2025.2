package exercicioLavaRapido;

public class TesteOficina {
	public static void main(String[] args) {

	Proprietario proprietario1 = new Proprietario("Bolhao"); 
	Carro carro1 = new Carro("Civic", null, proprietario1 ,"Sedan");
	
	
	System.out.println(carro1.toString());

	
	}
}
