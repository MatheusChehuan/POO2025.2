package exemplos;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123;
		aluno1.nome = "José";
		aluno1.email = "jose@gmail.com";
		
		Aluno aluno2 = new Aluno();
		aluno2.matricula = 321;
		aluno2.nome = "Maria";
		aluno2.email = "maria@gmail.com";
		
		System.out.println(aluno1.matricula + " - " + aluno1.nome);
		System.out.println(aluno2.matricula + " - " + aluno2.nome);
	}

}
