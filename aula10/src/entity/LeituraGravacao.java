package entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeituraGravacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome do arquivo: \n");
		String nomeArquivo = sc.nextLine();
		
		File file = new File("\\aula\\empregado.csv");
		try {
			Scanner sc2 = new Scanner(file);
			Set<Empregado> empregados = new HashSet<>();
			while (sc2.hasNext()) {
				String linha = sc2.nextLine();
				if(!linha.isEmpty()) //se estiver vazia
				{
					String[] dados = linha.split(";"); //encontra o separador dos dados
					String nome = dados[0]; //joga em nome
					String profissao = dados[1]; // joga em profissão
					empregados.add(new Empregado(nome, profissao)); //adiciona na lista empregados
				}
			}
			sc2.close();
			
			
			System.out.println("----Leitura----");
			for (Empregado e : empregados){
				System.out.println(e);
			}
			
			
			
			System.out.println("----Gravação----");
			FileWriter caminho = new FileWriter("\\aula\\empregadofolha.csv");
			PrintWriter gravar = new PrintWriter(caminho);
			
			for (Empregado e:empregados) //for each varre tudo
				{
				String linhaArquivo = e.getNome() + " | " + e.getProfissão() +"\n";
				gravar.printf(linhaArquivo);
			}
			gravar.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não Encontrado!");
		} catch (IOException e1) {
			System.err.println("Arquivo de saída não Encontrado!");
			e1.printStackTrace();
		}
	}

}
