package associacao;

public class TesteTime {
	public static void main(String[] args) {
	Atleta atleta1 = new Atleta("Arrascaeta", "meia");
	Atleta atleta2 = new Atleta("P.Coutinho", "meia");
	Atleta atleta3 = new Atleta("Yuri alberto", "atacante");
	
	Time time = new Time("Brasil", "Ancelotti", new Atleta[11]);
			
	time.adicionarAtletas(atleta1);
	time.adicionarAtletas(atleta2);
	time.adicionarAtletas(atleta3);
	
	time.imprimirtime();
	}
}
