package org.iphone.aparelhotelefonico;

import java.util.ArrayList;

public class DiscadorIphone implements IAparelhoTelefonico {
    private Contato contato;

    @Override
    public void fazerChamada(Contato ctt) {
        String nome = ctt.getNome();
        System.out.println("Ligando para: " + nome);

    }

    @Override
    public void encerrarChamada() {
        System.out.println("Encerrando chamada");

    }

    @Override
    public void listarContatos(ArrayList<Contato> contatos) {
        System.out.println("Listandot contatos: " + contatos);

    }

    @Override
    public void iniciarConferencia(Contato ctt1, Contato ctt2) {
        String contato1 = ctt1.getNome();
        String contato2 = ctt2.getNome();
        System.out.println("Inciando conferência com : " + contato1 + " + " + contato2);

    }

    @Override
    public void chamadaEmEspera() {
        System.out.println("Chamada em espera...");
    }
}
