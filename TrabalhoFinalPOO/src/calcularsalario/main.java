package calcularsalario;

import java.time.LocalDate;

import entity.Dependente;
import entity.Funcionario;

public class main {
	//criei só pra testar
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Matheus", "156", LocalDate.of(1999, 6, 29), 3000.);
		Dependente dependente1 = null;
		Dependente dependente2 = null;
		
		try {
			dependente1 = new Dependente("Bolhinha","245",LocalDate.of(2015, 7, 11),Parentesco.FILHO);
			dependente2 = new Dependente("Fulaninho","123", LocalDate.of(2017, 3, 9),Parentesco.FILHO);
		} catch (DependenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//tentando adicionar alguem		
		try {
			funcionario1.AdicionarDependente(dependente1);
			funcionario1.AdicionarDependente(dependente2);
		} catch (DependenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(funcionario1.toString()+"\n");
		System.out.println(dependente1.getNome() + "\n" + dependente2.getNome());
	}

}
