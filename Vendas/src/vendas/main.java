package vendas;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto(1, "TV", 3000., Categoria.ELETRONICO);
		Produto produto2 = new Produto(1, "Pneu", 300., Categoria.AUTOMOTIVO);
		Produto produto3 = new Produto(1, "Celular", 3000., Categoria.ELETRONICO);
				
        Venda venda1 = new Venda(produto1, LocalDate.now(), 1);
        Venda venda2 = new Venda(produto2, LocalDate.now(), 4);
        Venda venda3 = new Venda(produto3, LocalDate.now(), 1);
        
        venda1.calcularVenda();
        venda2.calcularVenda();
        venda3.calcularVenda();
	
		System.out.println("    Nota Fiscal Eletronica");
		System.out.println("-------------------------------");
		
		venda1.mostrarVenda();
		venda2.mostrarVenda();
		venda3.mostrarVenda();
				
		System.out.println("-------------------------------");
		System.out.println("Total: R$ " + String.format("%.2f",(venda1.getTotalVenda() + venda2.getTotalVenda() + venda3.getTotalVenda())));

	}

}
