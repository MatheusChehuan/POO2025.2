package veterinaria;

import java.util.Scanner;

public class TesteVeterinaria {

	public static void main(String[] args) {
		
		LojaDePets loja1 = new LojaDePets("Petz");
		int menu = 0;
		String confirma = "N";
		Scanner sc = new Scanner(System.in);
		
		
		loja1.adicionarAnimal(new Cachorro("Snoopy",7,"Branco"));
		loja1.adicionarAnimal(new Cachorro("Krypto",9,"Supercão"));
		loja1.adicionarAnimal(new Cachorro("Dama",10,"Marrom"));
		loja1.adicionarAnimal(new Cachorro("Vagabundo",11,"Cinza"));
		loja1.adicionarAnimal(new Gato("Garfield",17,"Laranja"));
		loja1.adicionarAnimal(new Gato("Tom",13,"Cinza"));
		loja1.adicionarAnimal(new Gato("Frajola",12,"Preto e Branco"));
		loja1.adicionarAnimal(new Gato("Ratatouille",14,"Cinza"));
		
		
		System.out.println("Bem vindo a Loja " + loja1.getNomeLoja() + "\n");
		
		
		do{
			
		System.out.println("1 - Nossa Lista de Pets");
		System.out.println("2 - Escolha um pet para adoção");
		System.out.println("3 - Sair");
		
		menu = sc.nextInt();
		
		switch (menu) {
		
		case 1:
			loja1.listarAnimais();
			
			System.out.println("Deseja voltar ao menu para escolher seu novo pet? (S ou N)");
			
			confirma = sc.next();
			
			if (confirma == "S" || confirma == "s") {
				System.out.println("funcionou");
			}
			break;
			
		case 2:
			try {
				System.out.println("Digite o nome do pet que deseja adotar:");
				String escolhepet = sc.next();
				loja1.adotarAnimal(escolhepet);
			}catch (AnimalException e) {
					System.err.println(e.getMessage());			}
			break;
			
		case 3:
			System.out.println("Programa Encerrado.");
		
			break;			
		default:			
			break;
		}
		}while (menu > 0 && menu < 3);
	}
}