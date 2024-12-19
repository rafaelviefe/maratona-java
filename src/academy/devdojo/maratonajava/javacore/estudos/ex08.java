package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro valor inteiro: ");
		int valor1 = input.nextInt();

		System.out.print("Digite o segundo valor inteiro: ");
		int valor2 = input.nextInt();

		System.out.print("Digite o terceiro valor inteiro: ");
		int valor3 = input.nextInt();

		if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
			System.out.println("Os valores devem ser diferentes!");
		} else {
			if (valor1 < valor2) {
				int temp = valor1;
				valor1 = valor2;
				valor2 = temp;
			}
			if (valor1 < valor3) {
				int temp = valor1;
				valor1 = valor3;
				valor3 = temp;
			}
			if (valor2 < valor3) {
				int temp = valor2;
				valor2 = valor3;
				valor3 = temp;
			}

			System.out.println("Valores em ordem decrescente: " + valor1 + ", " + valor2 + ", " + valor3);
		}

		input.close();
	}
}
