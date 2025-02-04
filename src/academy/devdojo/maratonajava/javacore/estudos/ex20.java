package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = input.nextInt();
		int temp = 1;

		while (temp <= 10) {
			System.out.println(num + " x " + temp + " = " + (num * temp));
			temp += 1;
		}


		input.close();
	}
}
