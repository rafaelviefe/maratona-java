package academy.devdojo.maratonajava.javacore.estudos;


public class ex18 {
	public static void main(String[] args) {

		double heightF = 1.5;
		double heightS = 1.1;
		boolean menor = false;
		int cont = 0;

		while (!menor) {
			heightF += 0.02;
			heightS += 0.03;
			cont += 1;
			if (heightF < heightS) {
				menor = true;
			}
		}

		System.out.println(cont);

	}
}
