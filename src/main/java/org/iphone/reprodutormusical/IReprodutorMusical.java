package org.iphone.reprodutormusical;

import java.util.ArrayList;

public interface IReprodutorMusical {

    void tocarMusica(Artista musica);

    void proximaMusica();

    void anteriorMusica();

    void listarMusicas(Artista musicas);

    void listarAlbuns(Artista albuns);

    void listarArtistas(ArrayList<Artista> albuns);

    void abrirCapaAlbum();

}
