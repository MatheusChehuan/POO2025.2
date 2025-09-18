package aula9;

import java.util.Arrays;
import java.util.List;

public class ExemploArrays {
	public static void main(String[] args) {
		//Array não suporta novos elementos
		List<String> animais = Arrays.asList("Gato","Cachorro","Tigre");
		
		//substituindo gato por coruja
		animais.set(0,"Coruja");
		System.out.println(animais);
	}
}
