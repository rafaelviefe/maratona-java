package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double valor1 = input.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double valor2 = input.nextDouble();

		System.out.print("Digite a terceira nota: ");
		double valor3 = input.nextDouble();

		double media = (valor1 + valor2 + valor3) / 3;

		System.out.println(media);

		input.close();
	}
}
