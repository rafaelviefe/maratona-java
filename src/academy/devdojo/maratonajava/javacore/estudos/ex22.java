package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a velocidade: ");
		double vel = input.nextDouble();

		System.out.print("Digite o tempo: ");
		int tempo = input.nextInt();

		double dist = vel * tempo;
		double litros = dist / 12;

		System.out.println(litros);

		input.close();
	}
}
