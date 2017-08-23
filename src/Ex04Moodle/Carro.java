package Ex04Moodle;

import javax.swing.JOptionPane;

public class Carro {
	String marca;
	String modelo;
	int velocidade;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		if (velocidade >= 10 && velocidade <= 150) {
			this.velocidade = velocidade;
		} else {

			while (this.velocidade < 10 || this.velocidade > 150) {
				
				this.velocidade = (Integer.parseInt(JOptionPane.showInputDialog(
						"Digite corretamente a velocidade(maior ou igual a 10 e  menor ou igual a 150)")));
			}
		}
	}

	public String toString() {
		return "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nVelocidade: " + this.getVelocidade();
	}
}
