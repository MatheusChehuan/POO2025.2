package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Exemplo2Generics {

	public static void main(String[] args) {
		List<Integer> numeros = 	Arrays.asList(10,29,30,50,60);
		List<String> marcas = Arrays.asList("Samsung","LG","Apple");
		List<Object> objects = new ArrayList<>();
		copiarListas(numeros, objects);
		imprimirListas(objects);
		
	}
		public static void copiarListas(List<? extends Number> origem,
									List<? super Number> destino) {
			//copia qualquer coisa que herda de number
			for (Number numero: origem) {
				destino.add(numero);
			}
		}
		
		public static void imprimirListas(List<?> lista) {
			for (Object object : lista) {
				System.out.println(object);
			}
			
		}
}
