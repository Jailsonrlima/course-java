package entidade;

public class estudante {
	public String nome;
	public double n1, n2, n3;

	public double notaFinal() {
		return n1 + n2 + n3;

	}
	
	public double pontuacao() {
		if (notaFinal() < 60) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}

	public final String toString() {
		return "FINAL GRADE = " + notaFinal();
	}

}
