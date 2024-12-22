package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o nome da pessoa: ");
		String nome = input.next();

		System.out.print("Digite a idade dela: ");
		int idade = input.nextInt();

		if (idade >= 18) {
			System.out.println(nome + " tem " + idade + " anos e é de maior.");
		} else {
			System.out.println(nome + " tem " + idade + " anos e é de menor.");
		}

		input.close();
	}
}
