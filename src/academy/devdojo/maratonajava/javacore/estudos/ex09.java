package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		double peso = input.nextDouble();

		System.out.print("Digite a altura: ");
		double altura = input.nextDouble();

		double imc = peso / (altura * altura);
		System.out.println(imc);

		System.out.println(retornaFaixa(imc));

		input.close();
	}

	public static String retornaFaixa(Double imc) {
		if (imc < 18.5) return "Abaixo do peso";
		else if (imc < 24.9) return "Peso ideal (parabéns)";
		else if (imc < 29.9) return "Levemente acima do peso";
		else if (imc < 34.9) return "Obesidade grau I ";
		else if (imc < 39.9) return "Obesidade grau II (severa)";
		else return "Obesidade grau III (mórbida)";

	}

}
