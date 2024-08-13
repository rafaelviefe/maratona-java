package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31,28,31,32 dias
        int [][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        for (int[] arr: dias) {
            for (int num : arr) {
                System.out.println(num);
            }
        }

        int[][] arrayInt = new int[3][];
        int[] vetor = {1,2};
        arrayInt[0] = vetor;
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1,2,3,4,5,6};
        for (int[] pog: arrayInt) {
            System.out.println("\n----");
            for (int cara : pog) {
                System.out.print(cara);
            }
        }

        int[][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};
    }
}
