package heranca;


public class TesteFuncionario {

	public static void main(String[] args) {
		Diretor diretor = new Diretor(1, "Matheus", "26", "matheus@gmail.com", 8000., "ADM", 1000.);
		Gerente gerente = new Gerente(2, "William", "32", "william@gmail.com", 6000., 10);
		
		System.out.println("Dados do diretor:\n"+diretor.toString());
		System.out.println("Salário:"+ diretor.calcularFolha());
		System.out.println("Dados do gerente:\n"+gerente.toString());
		System.out.println("Salário:"+ gerente.calcularFolha());
		
		
	
	}

}
