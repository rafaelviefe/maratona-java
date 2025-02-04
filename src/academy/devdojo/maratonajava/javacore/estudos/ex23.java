package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número para calcular o fatorial: ");
		int numero = input.nextInt();

		long fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}

		System.out.println("O fatorial de " + numero + " é " + fatorial);

		input.close();
	}
}
