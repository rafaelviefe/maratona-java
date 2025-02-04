package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a temperatura em Fahrenheit: ");
		double tempF = input.nextDouble();

		double tempC = 5 * (tempF - 32) / 9;

		System.out.println(tempC);

		input.close();
	}
}
