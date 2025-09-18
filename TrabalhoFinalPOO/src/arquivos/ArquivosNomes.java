package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import calcularsalario.DependenteException;
import calcularsalario.Parentesco;

import entity.Dependente;
import entity.Funcionario;

	public class ArquivosNomes {

		public static void main(String[] args) {

			try {		
				File file = new File("C:\\Users\\mathe\\OneDrive\\Documents\\teste\\entrada.csv");
				Scanner sc = new Scanner(file);

				Set<Funcionario> funcionarios = new HashSet<>();
				Set<Dependente> dependentes = new HashSet<>();

				while (sc.hasNext()) {
					String linha = sc.nextLine();
					
					while (!linha.isEmpty()) {
						String[] dados = linha.split(";");
							
							String nome = dados[0];
							String cpf = dados[1];
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
							LocalDate dataNascimento = LocalDate.parse(dados[2], formatter);
							double salarioBruto = Double.parseDouble(dados[3]);
							
							funcionarios.add(
									new Funcionario(nome, cpf, dataNascimento, salarioBruto));
					// le funcionarios	
							if (dados[0].equalsIgnoreCase("DEP")) {

								String nomedep = dados[0];
								String cpfdep = dados[1];
								DateTimeFormatter formatterdep = DateTimeFormatter.ofPattern("yyyyMMdd");
								LocalDate dataNascimentodep = LocalDate.parse(dados[2], formatterdep);
								Parentesco parentesco = Parentesco.valueOf(dados[3]);
							
								dependentes.add(
									new Dependente(nomedep, cpfdep, dataNascimentodep, parentesco));
				        // le dependentes
				        }
					}
						if (linha.isEmpty()) {
							for (Dependente e : dependentes) {
								String linhaArquivo = e.getNome() + ";" + e.getCpf() + ";" + e.getDataNascimento() + ";"
										+ e.getParentesco() + "\n";
							}
						}

					}
				sc.close();

				System.out.println("=====Leitura de arquivo=====\n");
				for (Funcionario e : funcionarios) {
					System.out.println(e);
				}

				System.out.println("\n====Gravação de arquivo====");
				FileWriter caminho = new FileWriter("C:\\Users\\mathe\\OneDrive\\Documents\\teste\\teste.csv");
				PrintWriter gravar = new PrintWriter(caminho);

				for (Funcionario e : funcionarios) {
					String linhaArquivo = e.getNome() + ";" + e.getCpf() + ";" + e.getDataNascimento() + ";"
							+ String.format("%.2f",e.calcularINSS()) + ";" + String.format("%.2f",e.calcularIR()) + ";" + String.format("%.2f",e.calcularSalarioLiquido()) + "\n";
					gravar.printf(linhaArquivo);
				}

				gravar.close();
				System.out.println("\nGravação de arquivo feita com sucesso!");

			} catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado");
			}

			catch (IOException e1) {
				System.out.println("Arquivo de saída com problema");

			} catch (DependenteException e1) {
				System.out.println("Erro no dependente");
				e1.printStackTrace();
			}

		}
}