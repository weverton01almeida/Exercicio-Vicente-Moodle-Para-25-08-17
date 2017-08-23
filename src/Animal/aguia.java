package Animal;

public class aguia extends animal implements Comer, Voar {

	@Override
	public String voar() {
		return "Voando...";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Comendo carne...";
	}
	
}
