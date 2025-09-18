package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
			HashMap<String, String> estados = new HashMap<>(); 
			//se for TreeMap vai na ordem crescente e o LinkedHashMap pra ordem de inserção
			estados.put("AL", "Alagoas");
			estados.put("RJ", "Rio de Janeiro");
			estados.put("CE", "Ceará");
			estados.put("RS", "Rio Grande do Sul");
			estados.put("RS", "Rio Grande do Sul"); //provar que não repete


			//Imprimir Chave
			System.out.println("******Valor******");
			for (String chave : estados.keySet()) {
				System.out.println(chave);
			}
			
			//Imprimir Valor
			System.out.println("******Chave******");
			for (String valor : estados.values()) {
				System.out.println(valor);
			}
			
			//Imprimir Chave e valor
			System.out.println("******Chave e Valor******");
			for (Map.Entry<String,String> dados: estados.entrySet()) {
				System.out.println(dados.getKey()+"-"+ dados.getValue());
			}

	}

}
