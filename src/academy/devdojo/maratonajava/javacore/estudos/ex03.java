package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite a variável A: ");
		int A = Integer.parseInt(input.next());
		System.out.print("Digite a variável B: ");
		int B = Integer.parseInt(input.next());

		int C;

		if (A == B) {
			C = A + B;
		} else C = A * B;

		System.out.println(C);
	}
}
