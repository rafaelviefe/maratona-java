package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o l1: ");
		int l1 = input.nextInt();
		System.out.print("Digite o l2: ");
		int l2 = input.nextInt();
		System.out.print("Digite o l3: ");
		int l3 = input.nextInt();

		if (l1 == l2 && l2 == l3) {
			System.out.println("equilátero");
		} else if (l1 != l2 && l1 != l3 && l2 != l3) {
			System.out.println("escaleno");
		} else {
			System.out.println("isóceles");
		}

		input.close();
	}
}
