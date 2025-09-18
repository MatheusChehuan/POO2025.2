package lutador;

public class main {

	public static void main(String[] args) {
		Lutador lutador1 = new Lutador("Fulano", 25, 80.);
		Lutador lutador2 = new Lutador("Ciclano", 27, 200.);
		
		Luta luta1 = new Luta(lutador1, lutador2, 6);
		luta1.isConfirmado();
	}

}
