package academy.devdojo.maratonajava.seminario.dominio;

public class Seminario {
    private Aluno[] alunos;
    private Local local;
    private String titulo;

    public Seminario(Aluno[] alunos, Local local, String titulo) {
        this.alunos = alunos;
        this.local = local;
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
