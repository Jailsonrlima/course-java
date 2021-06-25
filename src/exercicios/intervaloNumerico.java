package exercicios;

/*Leia um valor inteiro N. Este valor será a quantidade de números inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/
import java.util.Scanner;

public class intervaloNumerico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				num1 += 1;
			} else {
				num2 += 1;
			}

		}
		System.out.println(num1 + " in\n" + num2 + " out");
		sc.close();
	}

}
