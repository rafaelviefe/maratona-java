package academy.devdojo.maratonajava.javacore.estudos;


public class ex19 {
	public static void main(String[] args) {

		int numAtual = 1;
		int numTemp;

		while (numAtual <= 10) {
			numTemp = 1;
			while (numTemp <= 10) {
				System.out.println(numAtual + " x " + numTemp + " = " + (numAtual * numTemp));
				numTemp += 1;
			}
			numAtual += 1;
		}

	}
}
