package Ex01Moodle;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Main {
	public static void main (String []args) throws ParseException {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		String dia;
		String mes;
		String ano;
		String Ndata = null;
		p1.setNome(JOptionPane.showInputDialog("Qual é o seu nome?"));
		dia=(JOptionPane.showInputDialog("Qual é o dia de seu nascimento?"));
		mes=(JOptionPane.showInputDialog(null, "Qual é o mes de seu nascimento?"));
		ano=(JOptionPane.showInputDialog(null, "Qual é o ano de seu nascimento?"));
		Ndata = dia+"-"+mes+"-"+ano;
		SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
		p1.setData(formatador.parse(Ndata));
		p1.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o seu salario?")));
		
		p2.setNome(JOptionPane.showInputDialog("Qual é o seu nome?"));
		dia=(JOptionPane.showInputDialog("Qual é o dia de seu nascimento?"));
		mes=(JOptionPane.showInputDialog(null, "Qual é o mes de seu nascimento?"));
		ano=(JOptionPane.showInputDialog(null, "Qual é o ano de seu nascimento?"));
		Ndata = dia+"-"+mes+"-"+ano;
		p2.setData(formatador.parse(Ndata));
		p2.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o seu salario?")));
		
		p3.setNome(JOptionPane.showInputDialog("Qual é o seu nome?"));
		dia=(JOptionPane.showInputDialog("Qual é o dia de seu nascimento?"));
		mes=(JOptionPane.showInputDialog(null, "Qual é o mes de seu nascimento?"));
		ano=(JOptionPane.showInputDialog(null, "Qual é o ano de seu nascimento?"));
		Ndata = dia+"-"+mes+"-"+ano;
		p3.setData(formatador.parse(Ndata));
		p3.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual é o seu salario?")));
		
		String msgpessoa1 = "Nome: "+p1.getNome()+"\nAno de Nascimento: "+p1.getData()+"\nSalario: "+p1.getSalario();
		String msgpessoa2 = "Nome: "+p2.getNome()+"\nAno de Nascimento: "+p2.getData()+"\nSalario: "+p2.getSalario();
		String msgpessoa3 = "Nome: "+p3.getNome()+"\nAno de Nascimento: "+p3.getData()+"\nSalario: "+p3.getSalario();
		
		JOptionPane.showMessageDialog(null, "Nome: " + msgpessoa1);
		JOptionPane.showMessageDialog(null, "Nome: " + msgpessoa2);
		JOptionPane.showMessageDialog(null, "Nome: " + msgpessoa3);
		
	}
}
