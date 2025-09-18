package arquivos;

import java.io.File;
import java.util.Scanner;

public class ExemploListarPastaArquivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo ou Pasta:\n");
		
		String nome = sc.nextLine();
		File file = new File(nome );
		
		if (file.exists()) {
			if (file.isFile()) {
				System.out.printf("\nArquivo (%s) encontrado, seu tamanho em bytes é: %d bytes", file.getName(),file.length());
		}else{
			System.out.println("Conteúdo da Pasta:");
		for (String s:file.list()) {
			System.out.printf("%s",s);
		}
		}
		}else{
			System.out.println("Arquivo não encontrado");
		}
	}
}
