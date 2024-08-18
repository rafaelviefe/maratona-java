package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "midoria";
        estudante.idade = 15;
        estudante.sexo = 'm';

        estudante2.nome = "sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'f';

        estudante.imprime();
        estudante2.imprime();
    }
}
