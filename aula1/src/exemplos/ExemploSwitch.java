package exemplos;

import javax.swing.JOptionPane;

public class ExemploSwitch {

	public static void main(String[] args) {
		int avaliacao = 1;		
		
		switch (avaliacao) {
		case 0:
			System.out.println("Ruim");
			JOptionPane.showMessageDialog(null, "Ruim");
			break;
		case 1:
			System.out.println("Regular");
			JOptionPane.showMessageDialog(null, "Regular");
			break;
		case 2:
			System.out.println("Bom");
			JOptionPane.showMessageDialog(null, "Bom");
			break;
			
		default:
			System.out.println("Opção Inválida.");
			JOptionPane.showMessageDialog(null, "Opção Inválida.");
			break;
		}
	}
}