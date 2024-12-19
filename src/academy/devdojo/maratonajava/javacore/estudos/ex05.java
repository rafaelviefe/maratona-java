package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite qual é o salário mínimo: ");
		float salarioMinimo = Float.parseFloat(input.next());
		System.out.print("Digite o salário mínimo do fulano: ");
		float salarioFulano = Float.parseFloat(input.next());

		float quantidade = salarioFulano / salarioMinimo;

		System.out.println("Fulano recebe " + quantidade + "x um salário mínimo!");
	}
}
