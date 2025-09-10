package aula6exercicios;

public class main {

	public static void main(String[] args) {
		
		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("EUA");
		Atleta at1 = new Atleta("Anderson Silva", 80., pais1);
		Atleta at2 = new Atleta("Jon Jones", 91., pais2);
		Atleta at3 = new Atleta("João Dias", 50., pais1);
		
		
		
		System.out.println("Lutador: " + at1.getNome()+ "\nPaís: " + at1.getPais().getNome());
		System.out.println(at1.verificaSituacao(null) + "\n------------------------");
		
		System.out.println("Lutador: " + at2.getNome() + "\nPaís: " + at2.getPais().getNome());
		System.out.println(at2.verificaSituacao(null) + "\n------------------------");

		System.out.println("Lutador: " + at3.getNome() + "\nPaís: " + at3.getPais().getNome());
		System.out.println(at3.verificaSituacao(null) + "\n------------------------");
	}

}
