package entidade;

public class ContaBancaria {
	private int numeroConta;
	private String titularConta;
	private double saldo;

	public ContaBancaria(int numeroConta, String titularConta, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		depositar(depositoInicial); // Incapisulamento do metodo Deposito
	}
	

	public ContaBancaria(int numeroConta, String titularConta) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}


	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double depositar(double valor) {
		return saldo += valor;

	}

	public double sacar(double valor) {
		return saldo -= valor + 5.0;

	}


	@Override
	public String toString() {
		return "Account " 
	            + numeroConta 
	            + ", Holder: " 
	            + titularConta 
	            + ", Balance: $ " 
	            + saldo;
	}
	
	

}
