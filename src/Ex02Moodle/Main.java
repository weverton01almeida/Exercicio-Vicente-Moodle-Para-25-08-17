package Ex02Moodle;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Classe c1 = new Classe();
		int data[] = new int[2];// data[0] == dia data[1] == mes data [2] == ano
		System.out.println("Qual é o seu nome?");
		c1.setNome(Sc.next());
		Sc.nextLine();
		System.out.println("Qual é o seu sobrenome?");
		c1.setSobrenome(Sc.nextLine());
		/*System.out.println("Qual é o numero inteiro a ser salvo?");
		c1.setI(Sc.nextInt());
		System.out.println("Qual é o numero decimal(maior) a ser salvo?");
		c1.setD(Sc.nextDouble());
		System.out.println("Qual é o numero decimal(menor) a ser salvo?");
		c1.setF(Sc.nextFloat());*/
		System.out.println("Qual é a data a ser salva?(Formato(aaaa-mm-dd)");
		c1.setDt(Sc.next());
		Sc.nextLine();
/*		System.out.println("Qual é o caractere a ser salvo?");
		c1.setC(Sc.next().charAt(0));*/
		System.out.println(c1.concatena());
		System.out.println(c1.invert());
		System.out.println(c1.maiusculas());
		System.out.println(c1.nomecorreto());
		c1.questao2j();
	}
}

