package aula9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Não permite elementos Duplicados no Set
public class ExemploHashSet {

	public static void main(String[] args) {
		//Ordena
		Set<String> times = new TreeSet<>();
		//HashSet não mantem a ordem de inserção
		//Set<String> times = new HashSet<>()
		//LinkedHashSet mantem a ordem de inserção
		//Set<String> times = new LinkedHashSet<>()
		
		times.add("Inter");
		times.add("Inter");
		times.add("Sampdoria");
		times.add("Milan");
		times.add("Sampdoria");


		System.out.println(times);
	}

}
