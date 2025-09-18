package aula9;

import java.util.List;

public class ExemploIndexOf {

	public static void main(String[] args) {
		//List of é estatico, não precisa de new, não permite novos elementos e nem modificações
		List<String> setores = List.of("RH","DP","Contabilidade","CPD");
		
		System.out.println(setores);
	}

}
