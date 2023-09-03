package org.iphone.aparelhotelefonico;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private ArrayList<String> numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getNumero() {
        return numero;
    }

    public void setNumero(ArrayList<String> numero) {
        this.numero = numero;
    }
}
