package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        // 0 = byte, short, int, long, float e double
        // '\u0000' " " = char
        // false = boolean
        // null = string
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaky";
        nomes[2] = "Lufy";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        int[] numeros = new int[]{1,2,3,4,5};
        for(int num : numeros) {
            System.out.println(num);
        }


    }


}
