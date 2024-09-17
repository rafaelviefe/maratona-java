package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Ramalho");
        Jogador jogador2 = new Jogador("Grizman");
        Time time = new Time("Palmeiras");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---Time---");
        time.imprime();
        for (Jogador player : time.getJogadores()) {
            player.imprime();
        }

    }
}
