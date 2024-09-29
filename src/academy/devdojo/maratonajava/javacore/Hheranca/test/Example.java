package academy.devdojo.maratonajava.javacore.Hheranca.test;

public class Example {

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int sum = calculateSum(numbers);
        System.out.println("Soma dos números: " + sum);
    }

    public static int calculateSum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}



