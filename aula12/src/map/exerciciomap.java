package map;

import java.util.LinkedHashMap;
import java.util.Map;

//1) Criar uma classe para inserir em um mapa de marcas e modelos
//de alguns veículos percorrer o mapa para imprimir a chave o valor.
public class exerciciomap {
	public static void main(String[] args) {
		LinkedHashMap<String,String> carro = new LinkedHashMap<>();
		carro.put("Fiat", "Argo");
		carro.put("Volkswagen", "Gol");
		carro.put("Chevrolet", "Astra");
		carro.put("Ford", "Fiesta");

		System.out.println("******Marcas******");
		for (String marca : carro.keySet()) {
			System.out.println(marca);
		}
		
		System.out.println("******Carro******");
		for (String carros : carro.keySet()) {
			System.out.println(carros);
		}
		//Imprimir Chave e valor
		System.out.println("******Marca e Carro******");
		for (Map.Entry<String,String> carros: carro.entrySet()) {
			System.out.println(carros.getKey()+"|"+ carros.getValue());
		}

	}

}
