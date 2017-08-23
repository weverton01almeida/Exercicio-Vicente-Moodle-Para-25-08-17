package Ex04Moodle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int flag = 0;
		ArrayList<Carro> lista = new ArrayList<Carro>();
		while (flag < 1) {
			Carro c1 = new Carro();
			c1.setMarca(JOptionPane.showInputDialog("Digite a marca do veiculo: (digite sair para parar o cadastro)"));
			if (c1.getMarca().equalsIgnoreCase("sair")) {
				flag++;
			} else {
				c1.setModelo(JOptionPane.showInputDialog("Digite o modelo do veiculo: "));
				c1.setVelocidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade do veiculo: ")));
				lista.add(c1);
			}
		}
		for(Carro carro : lista)
		{
			JOptionPane.showMessageDialog(null,carro.toString());
		}
		

	}
}
