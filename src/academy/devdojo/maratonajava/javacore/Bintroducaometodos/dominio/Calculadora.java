package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros() {
        System.out.println(20-2);
    }

    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        return num1 / num2;
    }

    public void alteraDoisNUmeros(int num1, int num2) {
        num1 = 39;
        num2 = 33;
        System.out.println("Inside, " + num1 + " " + num2);
    }
}
