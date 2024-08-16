package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "midoria";
        estudante.idade = 15;
        estudante.sexo = 'm';

        estudante2.nome = "sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'f';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        impressora.imprime(estudante2);
        System.out.println(estudante2.sexo);
    }
}
