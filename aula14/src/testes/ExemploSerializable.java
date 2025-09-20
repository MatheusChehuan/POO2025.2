package testes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import entity.Fornecedor;
//serializable prepara pra transformar em binario (tipo deixa elegivel)
public class ExemploSerializable {
	
	public static void main (String[] args) {
		List<Fornecedor> fornecedores = new ArrayList<>();
		fornecedores.add(new Fornecedor("123","ABC 123"));
		fornecedores.add(new Fornecedor("345","XPTO 345"));
		
		
		//imprime
		try {
			FileOutputStream arquivo = new FileOutputStream("C:\\Users\\mathe\\OneDrive\\Documents\\teste\\fornecedor.dat");
			ObjectOutputStream gravarArquivo = new ObjectOutputStream(arquivo);
			gravarArquivo.writeObject(fornecedores);
			gravarArquivo.flush();
			gravarArquivo.close();
			arquivo.close();
			
		} catch (Exception e) {
			System.err.println("Arquivo não encontrado.");
			e.getStackTrace();
		}
		//le
		System.out.println("Recuperando arquivo com objetos!");
		 try {
			 FileInputStream arquivo = new FileInputStream("C:\\Users\\mathe\\OneDrive\\Documents\\teste\\fornecedor.dat");
			 ObjectInputStream lerarquivo = new ObjectInputStream(arquivo);
			 fornecedores = (ArrayList<Fornecedor>)lerarquivo.readObject();
			 lerarquivo.close();
			 arquivo.close();
			 System.out.println(fornecedores);
		 } catch (Exception e) {
			 System.err.println("Arquivo não encontrado");
			 e.getStackTrace();
		 }

}
}
