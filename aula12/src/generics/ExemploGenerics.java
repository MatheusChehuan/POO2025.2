package generics;

public class ExemploGenerics {
	

	public static void main(String[] args) {
		MeuGenerics<String> var1 = new MeuGenerics<String>("Teste");
		MeuGenerics<Integer>var2 = new MeuGenerics<Integer>(1000);
		
		
		System.out.println(var1.toString());
		System.out.println(var2.toString());
}
}