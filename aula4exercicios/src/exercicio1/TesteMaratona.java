package exercicio1;

public class TesteMaratona {

	public static void main(String[] args) {
		AtletaAmador atletamador1 = new AtletaAmador("Matheus","M", 26, 1.80, false);
		AtletaProfissional atletapro1 = new AtletaProfissional("Michael Phelps","M", 35, 1.95, 89.);
		AtletaProfissional atletapro2 = new AtletaProfissional("Serena Williams","F", 34, 1.80, 74.);
		
		
		
		System.out.println(atletamador1.toString()+"\n------------------");
		System.out.println(atletapro1.toString()+"\n-------------------");
		System.out.println(atletapro2.toString()+"\n-------------------");
		System.out.println("Partipará? " + atletamador1.verificaSituacao());
		System.out.println("Partipará? " + atletapro1.verificaSituacao());
		System.out.println("Partipará? " + atletapro2.verificaSituacao());

	}

}
