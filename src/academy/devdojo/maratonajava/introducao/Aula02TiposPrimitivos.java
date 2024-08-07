package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long bigNumber = (long) 155.23;
        double salaryDouble = 2000.0D;
        float salaryFloat = (float) 2500.0D;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean truly = true;
        boolean notTrue = false;
        char character = '\u0041';
        String nome = "A biiiiiiiig text";

        System.out.println("The age is " + age + " years");
        System.out.println(notTrue);
        System.out.println("char " + character);
        System.out.println("so that's " + nome);
    }
}
