package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("88070820");
        endereco.setRua("Rua dos Carijós");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Galego");
        pessoa.setCpf("10595134980");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Despacito");
        funcionario.setCpf("01932230904");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(15555);
        funcionario.imprime();
    }
}
