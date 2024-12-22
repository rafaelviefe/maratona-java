package academy.devdojo.maratonajava.javacore.estudos;

import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite valor da hora aula: ");
		double vhr = input.nextDouble();

		System.out.print("Digite número de aulas lecionadas: ");
		int nal = input.nextInt();

		System.out.print("Digite percentual de desconto INSS: ");
		double pdi = input.nextDouble();

		double slb = vhr * nal;
		double inss = slb * pdi;
		double sll = slb - inss;

		System.out.println(sll);
		System.out.println(slb);
		System.out.println(inss);


		input.close();
	}
}
