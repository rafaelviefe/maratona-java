package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num = Integer.parseInt(input.next());

		if (num % 2 == 0) System.out.println("O número é par!");
		else System.out.println("O número é impar!");

		if (num > 0) System.out.println("O número é positivo!");
		else if (num < 0) System.out.println("O número é negativo!");
		else System.out.println("O número é neutro!");

	}
}
