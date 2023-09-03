package org.iphone.aparelhotelefonico;

import java.util.ArrayList;

public interface IAparelhoTelefonico {
    void fazerChamada(Contato contato);

    void encerrarChamada();

    void listarContatos(ArrayList<Contato> contatos);

    void iniciarConferencia(Contato contato1, Contato contato2);

    void chamadaEmEspera();
}
