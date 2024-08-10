package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 12 * 3;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        categoria = idade < 15 ? "Categoria Infantil" : idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";

        System.out.println(categoria);


        double salario = 6000;
        String mensagemDoar = "Eu vou dar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);


        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = primeiraFaixa + salarioAnual;
        } else if (salarioAnual <= 68507) {
            valorImposto = segundaFaixa * salarioAnual;
        } else {
            valorImposto = terceiraFaixa * salarioAnual;
        }
        System.out.println(valorImposto);

        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opção inválida");
                break;
        }

        byte day = 4;
        switch (day) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
