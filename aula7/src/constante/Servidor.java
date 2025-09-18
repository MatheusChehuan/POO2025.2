package constante;
//final impede uma classe de ser pai
public class Servidor {
	protected String nome;
	protected String lotacao;
	protected final String LOTACAO = "Brasilia"; //não pode modificar, constante.
	
	
	public Servidor(String nome, String lotacao) {
		super();
		this.nome = nome;
		this.lotacao = lotacao;
	}
	//o final no metodo impede override
	public final void imprimirRelatorio() {
		System.out.println("Relatorio Impresso.");
	}
	

}
