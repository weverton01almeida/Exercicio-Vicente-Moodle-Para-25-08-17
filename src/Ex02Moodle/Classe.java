package Ex02Moodle;

public class Classe {
	String nome;
	String sobrenome;
	int i;
	double d;
	float f;
	String dt;
	char c;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public String concatena() {
		return this.getNome() + " " + this.getSobrenome();
	}

	public String invert() {
		String inverso = this.concatena();
		StringBuffer sb = new StringBuffer(inverso);
		return sb.reverse().toString();
	}

	public String maiusculas() {
		return this.concatena().toUpperCase();
	}

	public String nomecorreto() {
		String nomecompleto = new String();
		char auxant;
		char aux;
		aux = this.concatena().toUpperCase().charAt(0);
		nomecompleto = nomecompleto.concat(String.valueOf(aux));
		auxant = aux;
		for (int i = 1; i < this.concatena().length(); i++) {
			aux = this.concatena().charAt(i);
			if (auxant == ' ') {
				aux = this.concatena().toUpperCase().charAt(i);
				nomecompleto = nomecompleto.concat(String.valueOf(aux));
			} else {
				aux = this.concatena().toLowerCase().charAt(i);
				nomecompleto = nomecompleto.concat(String.valueOf(aux));
			}
			auxant = aux;
		}
		return nomecompleto;
	}

	/*
	 * public void FragmentarData() { char aux = dt.charAt(0); char auxprox =
	 * dt.charAt(1); for (int i = 0,j = 2; i < data.length; i++) { String auxdata =
	 * new String(); while(j < dt.length() || auxprox != '-') { auxdata =
	 * auxdata.concat(String.valueOf(aux)); aux = dt.charAt(j); auxprox =
	 * dt.charAt(j+1);
	 * 
	 * } data[i] = Integer.parseInt(auxdata); j++; } }
	 */
	public String convertInt() {

		return String.valueOf(this.i);
	}

	public String convertDouble() {

		return String.valueOf(this.d);
	}

	public String convertFloat() {

		return String.valueOf(this.f);
	}

	public String convertchar() {

		return String.valueOf(this.c);
	}

	public String questao2g() {
		String valor = "programacao java";
		String aux = "primeiro valor ";
		for (int i = 12, j = 0; i < valor.length() || j < 4; i++) {
			aux = aux.concat(String.valueOf(valor.charAt(i)));
		}
		aux = aux.concat(" segundo valor : ");
		for (int i = 3, j = 0; i < valor.length() || j < 5; i++) {
			aux = aux.concat(String.valueOf(valor.charAt(i)));
		}
		return aux;
	}

	public String questao2h() {
		return "000" + String.valueOf(i);
	}

	public int questao2i() {
		int ocorrencia = 0;
		for (int i = 0; i < this.concatena().length(); i++) {
			if (this.c == this.concatena().charAt(i)) {
				ocorrencia++;
			}
		}
		return ocorrencia;
	}
	public void questao2j() {
		String valor = "Para programar computadores necessita saber de logica";
		String splitado[]=valor.split(" ");
		for(int i = 0; i < splitado.length; i++) {
			System.out.println("posicao: "+(i+1) +" = "+ splitado[i].toString());
		}
	}

}
