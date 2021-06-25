package exercicios;

import java.util.Locale;
/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/
import java.util.Scanner;

public class casosDeTeste {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		double media, nota1, nota2, nota3;
		for (int i = 0; i < N; i++) {
			double tst1 = sc.nextDouble();
			double tst2 = sc.nextDouble();
			double tst3 = sc.nextDouble();
			
			nota1 = (tst1 * 2) / 10;
			nota2 = (tst2 * 3) / 10;
			nota3 = (tst3 * 5) / 10;

			media = nota1 + nota2 + nota3;
			System.out.printf("%.1f%n",media);

		}
		sc.close();
	}

}

/*OUTRA FORMA
 * Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}*/
