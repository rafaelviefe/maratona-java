package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Carlo";
        funcionario.idade = 45;
        funcionario.salario = new double[]{67032.43, 72731.31, 59998.00};
        funcionario.imprimeDados();
        funcionario.mediaSalarial();
    }
}
