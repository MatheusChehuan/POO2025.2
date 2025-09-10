package Exercicio1;

public class FuncionarioTeste {

	public static void main(String[] args) {
	Funcionario f1 = new Funcionario("Matheus",3000.);
	Funcionario f2 = new Funcionario("William",4000.);
	Funcionario f3 = new Funcionario("Lucas",5000.);
	Funcionario f4 = new Funcionario("Pedro",6000.);
	
	
	
	System.out.printf("Nome: %s\nSalario:R$ %.2f\nSalario Liquido: R$ %.2f\nVT:R$ %.2f\nINSS:R$ %.2f\n---------------------------\n", f1.getNome(), f1.getSalario(), f1.getSalario_liquido(), f1.getVt(), f1.calcularInss());
	System.out.printf("Nome: %s\nSalario:R$ %.2f\nSalario Liquido: R$ %.2f\nVT:R$ %.2f\nINSS:R$ %.2f\n---------------------------\n", f2.getNome(), f2.getSalario(), f2.getSalario_liquido(), f2.getVt(), f2.calcularInss());
	System.out.printf("Nome: %s\nSalario:R$ %.2f\nSalario Liquido: R$ %.2f\nVT:R$ %.2f\nINSS:R$ %.2f\n---------------------------\n", f3.getNome(), f3.getSalario(), f3.getSalario_liquido(), f3.getVt(), f3.calcularInss());
	System.out.printf("Nome: %s\nSalario:R$ %.2f\nSalario Liquido: R$ %.2f\nVT:R$ %.2f\nINSS:R$ %.2f\n---------------------------\n", f4.getNome(), f4.getSalario(), f4.getSalario_liquido(), f4.getVt(), f4.calcularInss());
	}

}
