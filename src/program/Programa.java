package program;

import java.util.Locale;
import java.util.Scanner;

import entidade.CurrencyConverter;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Retangulo rt = new Retangulo();
		System.out.println("Enter rectangle width and height:");
		rt.L = sc.nextDouble();
		rt.A = sc.nextDouble();
		System.out.println("AREA = " + rt.area() + "\nPERIMETER  = " + rt.perimetro() + "\nDIAGONAL = " + rt.diagonal());*/
		
		/*funcionario fn = new funcionario();
		
		fn.nome = sc.nextLine();
		fn.salBruto = sc.nextDouble();
		fn.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println(fn.toString()+"\n");
		System.out.print("Which percentage to increase salary?");
		
		double percentagen = sc.nextDouble();
		fn.increaseSalary(percentagen);
		
		System.out.println("\n"+fn.toString());*/
		
		/*estudante st = new estudante();
		st.nome = sc.nextLine();
		st.n1 = sc.nextDouble();
		st.n2 = sc.nextDouble();
		st.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", st.notaFinal());
		if (st.notaFinal() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", st.pontuacao());
		}
		else {
		System.out.println("PASS");
		}*/
		
	
		
		System.out.println("waht is dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollar will be bought? ");
		double quantidade = sc.nextDouble();
		double valorEmReais = price * quantidade + CurrencyConverter.Converter(price, quantidade);
		System.out.println("Amount to be paid in reais = " + valorEmReais);
		sc.close();

	}

}
