package academy.devdojo.maratonajava.seminario.controler;

import academy.devdojo.maratonajava.seminario.dominio.Aluno;
import academy.devdojo.maratonajava.seminario.dominio.Local;
import academy.devdojo.maratonajava.seminario.dominio.Professor;
import academy.devdojo.maratonajava.seminario.dominio.Seminario;

public class Controler {
    public static void main(String[] args) {
        Local local = new Local("Rua Olavo Bilac");
        Aluno aluno = new Aluno("Rafael", 19);
        Professor professor = new Professor("Thaís", "Cyber security");
        Seminario seminario = new Seminario(new Aluno[]{aluno}, local, "Carros clássicos");
        professor.setSeminarios(new Seminario[]{seminario});
        aluno.setSeminario(seminario);

        professor.imprime();
    }
}
