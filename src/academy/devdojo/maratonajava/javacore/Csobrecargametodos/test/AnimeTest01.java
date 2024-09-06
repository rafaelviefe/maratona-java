package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.setNome("Akudama Drive");
        anime.setGenero("Ação");
        anime.init("Rafael", "Desenho", 69);
        anime.init("Rafael", "Desenho", 69, "combate");
        anime.imprime();
    }
}
