package exemplos;

import javax.swing.JOptionPane;


public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		//produto.setCodigo(1);
		produto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Cód.:")));

		//produto.setDescricao("Notebook i5");
		produto.setDescricao(JOptionPane.showInputDialog("Descrição:"));

		//produto.setPreco(2000.);
		produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço:")));

		
		//System.out.println("Codigo: " + produto.getCodigo() + "\nNome: " + produto.getDescricao() +"\nPreço: R$" + produto.getPreco());
		JOptionPane.showMessageDialog(null,"Codigo: " + produto.getCodigo() + "\nNome: " + produto.getDescricao() +"\nPreço: R$ " + produto.getPreco());
	}

}
