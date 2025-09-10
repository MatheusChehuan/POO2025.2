package exercicio1;

public class Maratona {
	protected String nome;
	protected String sexo;
	protected int idade;
	protected double altura;
	
	public Maratona(String nome, String sexo, int idade, double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nsexo: " + sexo + "\nidade: " + idade + "\naltura: " + altura;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String verificaSituacao(){
		if (idade > 18 || altura >= 1.80)
			return "Participará!";
		else {
			return "Não participará!";
		}
	}

	}
