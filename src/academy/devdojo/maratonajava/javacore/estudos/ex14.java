package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor A: ");
		int vA = input.nextInt();

		System.out.print("Digite o valor B: ");
		int vB = input.nextInt();

		int temp = vA;
		vA = vB;
		vB = temp;

		System.out.println(vA + " " + vB);

		input.close();
	}
}
