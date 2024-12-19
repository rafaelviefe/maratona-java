package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro boolean (true/false): ");
		boolean valor1 = input.nextBoolean();

		System.out.print("Digite o segundo boolean (true/false): ");
		boolean valor2 = input.nextBoolean();

		if (valor1 && valor2) {
			System.out.println("Ambos são VERDADEIRO.");
		} else if (!valor1 && !valor2) {
			System.out.println("Ambos são FALSO.");
		} else {
			System.out.println("Os valores são diferentes.");
		}

		input.close();
	}
}
