package heranca;

public abstract class TesteImposto extends ImpostoRenda{

	public TesteImposto(String nome, String email, double rendimentos) {
		super(nome, email, rendimentos);
	}

	public static void main(String[] args) {
		pessoaFisica pf = new pessoaFisica("Matheus", 120000., "23", "2323");
		PessoaJuridica pj = new PessoaJuridica("Xpto Ltda", "xpto@gmail.com", 350000., "qualquer coisa", "234");
	
		System.out.printf("Imposto de Renda pessoa física: R$ %.2f", pf.calcularIR());
		System.out.printf("\nImposto de Renda pessoa juridica: R$ %.2f", pj.calcularIR());

	}
}
