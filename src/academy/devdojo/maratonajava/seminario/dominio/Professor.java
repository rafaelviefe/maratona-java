package academy.devdojo.maratonajava.seminario.dominio;

public class Professor {
    private Seminario[] seminarios;
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(Seminario[] seminarios, String nome, String especialidade) {
        this.seminarios = seminarios;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("---------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " (" + aluno.getIdade() + ")");
            }

        }

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
