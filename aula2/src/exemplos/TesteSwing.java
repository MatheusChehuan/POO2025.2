package exemplos;

import javax.swing.JOptionPane;

public class TesteSwing {

	public static void main(String[] args) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1:"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 2:"));

		JOptionPane.showMessageDialog(null,"Média:" + (num1+num2)/2);
	}
}
