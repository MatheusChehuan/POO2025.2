package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploScanner {
	public static void main(String[] args) {
		try {
			File file = new File("\\aula\\exercicio.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
		System.err.println("Arquivo Não encontrado!");
	}
}
}