package erros;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraArquivo {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//TRY/CATCH	

//		try {
//			FileReader leitura = new FileReader("c:/Intel/liberação.JPG");
//			System.out.println("Arquivo encontrado.");
//		} catch (FileNotFoundException e) {
//			System.err.println("Arquivo não encontrado.");
//			//e.printStackTrace();
//		}
		
		
		//THROWS
		
		
		FileReader leitura = new FileReader("c:/Intel/liberação.JPG");

	}
}
