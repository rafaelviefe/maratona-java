package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num = Integer.parseInt(input.next());

		System.out.println("Antecessor é " + (num+1) + " e o sucessor é " + (num-1));

	}
}
