package org.iphone.reprodutormusical;

import java.util.ArrayList;

public class Artista {

    private String nomeMusica;
    private String artistaMusica;
    private ArrayList<String> albuns;
    private ArrayList<String> musicas;

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getArtistaMusica() {
        return artistaMusica;
    }

    public void setArtistaMusica(String artistaMusica) {
        this.artistaMusica = artistaMusica;
    }

    public ArrayList<String> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(ArrayList<String> albuns) {
        this.albuns = albuns;
    }

    public ArrayList<String> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<String> musicas) {
        this.musicas = musicas;
    }
}
