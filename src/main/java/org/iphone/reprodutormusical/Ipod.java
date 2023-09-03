package org.iphone.reprodutormusical;

import java.util.ArrayList;

public class Ipod implements IReprodutorMusical {

    private Artista artistas;

    @Override
    public void tocarMusica(Artista artista) {
        String musica = artista.getArtistaMusica();
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void proximaMusica() {
        System.out.println("Tocando Próxima música...");
    }

    @Override
    public void anteriorMusica() {
        System.out.println("Tocando Música anterior...");
    }

    @Override
    public void listarMusicas(Artista artista) {
        ArrayList<String> musicas = artista.getMusicas();
        System.out.println("Listando todas as músicas: " + musicas);
    }

    @Override
    public void listarAlbuns(Artista artista) {
        ArrayList<String> albuns = artista.getAlbuns();
        System.out.println("Listando todos albuns do artista: " + albuns);
    }

    @Override
    public void listarArtistas(ArrayList<Artista> artistas) {
        System.out.println("Listando todos os artistas: " + artistas);
    }

    @Override
    public void abrirCapaAlbum() {
        System.out.println("Abrindo capa do álbum...");
    }
}
