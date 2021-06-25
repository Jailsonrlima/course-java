package entidade;

public class Retangulo {

public double L, A;

	public double area() {
		return L * A;

	}

	public double perimetro() {
		return (2 * L) + (2 * A);

	}

	public double diagonal() {
		return Math.sqrt((L * L) + (A * A));

	}
}
