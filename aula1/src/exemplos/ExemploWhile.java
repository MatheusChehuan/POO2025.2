package exemplos;

import java.util.Iterator;

public class ExemploWhile {

	public static void main(String[] args) {
		
		
		//enquanto
		
		/*int cont = 0;
		 while (cont <= 10) {
			System.out.println(cont);
			cont++;
		}
		
		//faça enquanto
		 int cont = 0;
		do {
			System.out.println(cont);
			cont++;
		} while (cont <= 10);
		*/
		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 6) {
				continue;
			}
			System.out.println(i);

		}
		
	}

}
