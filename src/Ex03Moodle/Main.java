package Ex03Moodle;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int x = 0;
		float y = 0;
		int flag = 0;
		while (flag < 2) {
			flag = 0;
			int aux1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro( maior que 10 e menor que 100)"));
			while ((aux1 <= 10 && aux1 != 0) || aux1 >= 100) {
				aux1 = Integer.parseInt(JOptionPane
						.showInputDialog("Digite corretamente um numero inteiro( maior que 10 e menor que 100)"));
			}
			if (aux1 == 0) {
				flag++;
			} else {
				x = aux1;
			}
			float aux2 = Float
					.parseFloat(JOptionPane.showInputDialog("Digite um numero float( maior que 5 e menor que 250)"));
			while ((aux2 <= 5 && aux2 != 0) || aux2 >= 250) {
				aux2 = Float.parseFloat(
						JOptionPane.showInputDialog("Digite corretamente um numero float( maior que 5 e menor que 250)"));
			}
			if (aux2 == 0) {
				flag++;
			} else {
				y = aux2;
			}
			JOptionPane.showMessageDialog(null, "Numero:  1: \n" +x+"\nNumero 2: \n"+y );
		}
		
	}
}
