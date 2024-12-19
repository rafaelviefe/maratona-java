package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a variável A: ");
		int A = Integer.parseInt(input.next());
		System.out.print("Digite a variável B: ");
		int B = Integer.parseInt(input.next());
		System.out.print("Digite a variável C: ");
		int C = Integer.parseInt(input.next());
		int sum = A + B;
		System.out.println(A + B);
		if (sum < C) {
			System.out.println("A soma é menor que C");
		} else {
			System.out.println("A soma não é menor que C");
		}
	}
}
