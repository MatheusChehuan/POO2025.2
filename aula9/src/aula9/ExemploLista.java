package aula9;

import java.util.ArrayList;
import java.util.List;


public class ExemploLista {

	public static void main(String[] args) {
	List<String> cores = new ArrayList<>();
	
	cores.add("Azul");
	cores.add("Amarelo");
	cores.add("Vermelho");

	
	System.out.println(cores);

	List<String> outrascores = new ArrayList<>();
	outrascores.add("Roxo");
	outrascores.addAll(cores);
	System.out.println(outrascores);
	System.out.println(outrascores.get(1));
	System.out.println(outrascores.size());
	System.out.println(outrascores.remove(3));
	System.out.println("Tem azul na lista?\n" + (outrascores.contains("Azul")?"Sim":"Não"));

//	for (int i = 0; i <outrascores.size(); i++) {
//		System.out.println(outrascores.get(i));
//		
//	}
	for (String cor: outrascores) {
		System.out.println(cor);
	}


	}

}
