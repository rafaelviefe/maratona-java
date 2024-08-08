package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean permitido = idade >= 18;
        if (permitido) {
            System.out.println("Dentro do if ");
        }
        // !
        if (!permitido) {
            System.out.println("paia");
        }
        System.out.println("Fora do if");
    }
}
