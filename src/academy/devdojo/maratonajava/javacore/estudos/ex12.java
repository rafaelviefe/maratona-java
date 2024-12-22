package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double valorFinal = -1;

		System.out.print("Digite o valor do produto: ");
		double valor = input.nextDouble();

		System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
		System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
		System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
		System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
		System.out.print("Digite a forma de pagamento: ");
		int forma = input.nextInt();

		switch (forma) {
			case 1:
				valorFinal = valor * 0.85;
				break;
			case 2:
				valorFinal = valor * 0.9;
				break;
			case 3:
				valorFinal = valor;
				break;
			case 4:
				valorFinal = valor * 1.1;
				break;
			default:
				System.out.println("Opção invalida.");
				break;
		}

		if (valorFinal != -1) {
			System.out.println("O produto sairá com o valor de " + valorFinal);
		}

		input.close();
	}
}
