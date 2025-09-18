package aula9;

import java.util.ArrayList;
import java.util.List;

public class mainCliente {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Matheus", "matheus@gmail.com");
		Cliente cliente2 = new Cliente("Fulano", "fulano@gmail.com");
		Cliente cliente3 = new Cliente("Ciclano", "ciclano@gmail.com");
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		
		for(Cliente c : clientes) {
			System.out.println(c.getNome() + " - " + c.getEmail());
		}

}
}