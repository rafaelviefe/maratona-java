package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Gualberto", "Desenho", 69, "combate", "Matue");
        anime.setTipo("TV");
        anime.setEpisodios(12);
        anime.imprime();
    }
}
