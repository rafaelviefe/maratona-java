package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Nome do receptaculo: ");
		String nome = input.next();

		System.out.print("Digite a primeira nota: ");
		double valor1 = input.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double valor2 = input.nextDouble();

		System.out.print("Digite a terceira nota: ");
		double valor3 = input.nextDouble();

		System.out.print("Digite a quarta nota: ");
		double valor4 = input.nextDouble();

		double media = (valor1 + valor2 + valor3 + valor4) / 4;

		String situacao;
		if (media > 7) situacao = "APROVADO";
		else situacao = "REPROVADO";

		System.out.println("Aluno " + nome + " " + situacao);

		System.out.println(media);

		input.close();
	}
}
