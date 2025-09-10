package exemplos;

public class TesteCampeonato {

	public static void main(String[] args) {
		//construtor - é chamado sempre que tiver uma instancia do objeto
		Campeonato c1 = new Campeonato(1, "Santa Cruz",10);
		Campeonato c2 = new Campeonato(2, "Remo", 12);
		Campeonato c3 = new Campeonato(3, "Vitoria", 15);
		
		
		
		System.out.println(c1.getTime());
		System.out.println(c2.getTime());
		System.out.println("Total de times: " + Campeonato.getTotalTimes());

		

	}

}
