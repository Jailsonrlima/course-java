package entidade;

public class funcionario {
	public String nome;
	public double salBruto,salLiquido, taxa;

	public double netSalary() {
		return salLiquido = salBruto - taxa;
	}

	public double increaseSalary(double percentagen) {
		salBruto += (percentagen * salBruto) / 100; 
		return salLiquido = salBruto - taxa;

	}

	public String toString() {
		return "Employee: " + nome + ", $ " + String.format("%.2f", netSalary()) ;

	}

}
