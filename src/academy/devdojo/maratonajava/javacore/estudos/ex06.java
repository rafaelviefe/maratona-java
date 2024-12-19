package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número aí: ");
		double num = Double.parseDouble(input.next());

		double reajustado = num * 1.05;

		System.out.println("Valor reajustado é " + reajustado);
	}
}
