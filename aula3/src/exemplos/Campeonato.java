package exemplos;

public class Campeonato {
	private int id;
	private String time;
	private int pontos;
	private static int totalTimes=0;
	
	//Overload - mesmo nome com argumentos diferentes
	public Campeonato(int id, String time, int pontos) {
		this.id = id;
		this.time = time;
		this.pontos = pontos;
		totalTimes++;
	}
	
	//construtor não tem retorno e não é void e tem o mesmo nome da classe
	/*public Campeonato() {
		System.out.println("construtor executado!");
	}*/
	
	public static int getTotalTimes() {
		return totalTimes;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	

}
