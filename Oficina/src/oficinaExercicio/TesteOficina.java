package oficinaExercicio;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		
        LocalDate dataagosto = LocalDate.of(2025, 8, 30); // Data em agosto (para testar desconto)

		Proprietario proprietario1 = new Proprietario("Bolhao");
		Proprietario proprietario2 = new Proprietario("Roni");
		Proprietario proprietario3 = new Proprietario("Matheus");
		
		Carro carro1 = new Carro("Civic", dataagosto, proprietario1, "Sedan");
		Carro carro2 = new Carro("Ford Ka", dataagosto, proprietario1, "Hatch");
		Moto moto1 = new Moto("Honda biz", dataagosto, proprietario3, 1500);
		
		carro1.revisao();
		carro1.trocarOleo();
		
		System.out.println(carro1.toString());

	}

}
