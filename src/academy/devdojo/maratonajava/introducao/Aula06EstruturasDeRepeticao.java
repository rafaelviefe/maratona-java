package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 1;
        }

        count = 0;
        do {
            System.out.println(++count);
        } while (count < 10);

        for (int i=0; i<10; i++) {
            System.out.println("For" + i);
        }

        // pares de 0 a 1000000
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // quantas parcelas
        double valorTotal = 53485;
        for (int parcela = 0; parcela < valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela" + parcela + " R$ " + valorParcela);
        }
    }
}
