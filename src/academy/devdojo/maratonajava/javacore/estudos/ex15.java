package academy.devdojo.maratonajava.javacore.estudos;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		LocalDateTime now = LocalDateTime.now();

		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();

		System.out.print("Digite o ano: ");
		int ano = input.nextInt();
		System.out.print("Digite o mes: ");
		int mes = input.nextInt();
		System.out.print("Digite o dia: ");
		int dia = input.nextInt();

		int anoCalc = year - ano;
		int mesCalc;
		if (mes >= month) {
			mesCalc = 12 + (month - mes);
			anoCalc -= 1;
		} else {
			mesCalc = month - mes;
		}
		int diaCalc;
		if (dia >= day) {
			diaCalc = 30 + (day - dia);
			if (mesCalc > 0) {
				mesCalc -= 1;
			} else {
				mesCalc = 11;
				anoCalc -= 1;
			}
		} else {
			diaCalc = day - dia;
		}

		System.out.println(anoCalc + " anos " + mesCalc + " meses e " + diaCalc + " dias de vida.");

		input.close();
	}
}
