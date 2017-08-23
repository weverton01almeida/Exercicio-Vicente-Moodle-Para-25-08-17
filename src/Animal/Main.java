package Animal;
import 	javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		cachorro Cachorro = new cachorro();
		//Preenchendo valores
		Cachorro.nome = "CachorroQualquer";
		Cachorro.pernas = 4;
		Cachorro.carnivoro = true;
		Cachorro.bico = false;
		Cachorro.asas = false;
		//Metodos
		/*System.out.printf("Cachorro \n --------------------\n");
		System.out.println(Cachorro.nome + "  " +Cachorro.pernas+" "+
		Cachorro.carnivoro+" "+ Cachorro.bico+" "+Cachorro.asas);
		System.out.println(Cachorro.comer());*/
		
		aguia Aguia = new aguia();
		//Preenchendo valores
		Aguia.nome = "Aguia Qualquer";
		Aguia.pernas = 2;
		Aguia.carnivoro = true;
		Aguia.bico = true;
		Aguia.asas = true;
		//Metodos
/*		System.out.printf("Aguia\n ------------------------\n");
		System.out.println(Aguia.nome + "  " +Aguia.pernas+" "+
		Aguia.carnivoro+" "+ Aguia.bico+" "+Aguia.asas);
		System.out.println(Aguia.comer());*/
		Aguia.voar();
		
		elefante Elefante = new elefante();
		//Preenchendo valores
		Elefante.nome ="Elefante Qualquer";
		Elefante.pernas = 4;
		Elefante.carnivoro = false;
		Elefante.bico = false;
		Elefante.asas = false;
		//Metodos
		/*System.out.printf("Elefante \n --------------------\n");
		System.out.println(Elefante.nome + "  " +Elefante.pernas+" "+
		Elefante.carnivoro+" "+ Elefante.bico+" "+Elefante.asas);
		System.out.println(Elefante.comer());*/
		//Defiindo Caixa de dialogo
		String msgcachorro = " Nome : "+Cachorro.nome+"\n Pernas : "+Cachorro.pernas+"\n Carnivoro : "
		+Cachorro.carnivoro+"\n Bico : "+Cachorro.bico+"\n Asas : "+Cachorro.asas+"\n"+Cachorro.comer();
		String msgaguia = " Nome : "+Aguia.nome+"\n Pernas : "+Aguia.pernas+"\n Carnivoro : "
		+Aguia.carnivoro+"\n Bico : "+Aguia.bico+"\n Asas : "+Aguia.asas+"\n"+Aguia.comer()+"\n"+Aguia.voar();
		String msgelefante = " Nome : "+Elefante.nome+"\n Pernas : "+Elefante.pernas+"\n Carnivoro : "
				+Elefante.carnivoro+"\n Bico : "+Elefante.bico+"\n Asas : "+Elefante.asas+"\n"+Elefante.comer();
		
		//Caixas de dialogo	
		JOptionPane.showMessageDialog(null,msgcachorro,"Cachorro",1);
		JOptionPane.showMessageDialog(null,msgaguia,"Aguia",1);
		JOptionPane.showMessageDialog(null,msgelefante,"Elefante",1);
		
	}

}
