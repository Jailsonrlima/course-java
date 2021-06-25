package program;

import java.util.Locale;
import java.util.Scanner;

import entidade.ContaBancaria;

public class ProgramConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;

		System.out.print("Enter account number:");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String titularConta = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numeroConta, titularConta, depositoInicial);
		} else {
			conta = new ContaBancaria(numeroConta, titularConta);

		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);

		System.out.println(); // Metodo para realizar o deposito
		System.out.print("Enter a deposit value:");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println("Updated account data:");
		System.out.println(conta);

		System.out.println(); // Metodo para fazer o saque na conta
		System.out.print("Enter a withdraw value:");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);
		System.out.println("Updated account data:");
		System.out.println(conta);

		sc.close();

	}

}
