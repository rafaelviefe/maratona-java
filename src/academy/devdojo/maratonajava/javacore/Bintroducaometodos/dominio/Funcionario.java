package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;
    private double media;


    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salario != null) {
            for (int i = 0; i < this.salario.length; i++) {
                System.out.println("Salário " + i + ": " + salario[i]);
            }
        }
    }

    public void mediaSalarial(){
        media = 0;
        if (salario != null) {
            for (double num: this.salario) {
                media += num;
            }
            media /= this.salario.length;
        }
        System.out.println(media);
    }
}
