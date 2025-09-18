package generics;

public class MeuGenerics<T> {
	private T valor;

	public MeuGenerics(T valor) {
		super();
		this.valor = valor;
	}	
	
	@Override
	public String toString() {
		return "MeuGenerics [valor=" + valor + "]";
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
	
	
}
