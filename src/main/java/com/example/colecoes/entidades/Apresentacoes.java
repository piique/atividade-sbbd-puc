package com.example.colecoes.entidades;

import com.example.colecoes.Singleton;
import com.example.entidades.Apresentacao;

public class Apresentacoes extends Singleton<Apresentacao> {
    private static Apresentacoes instance;

    private Apresentacoes() {
        super();
    }

    public static Apresentacoes getInstance() {
        if (instance == null) {
            instance = new Apresentacoes();
        }
        return instance;
    }

    public boolean remover(int id) {
        return lista.removeIf(apresentacao -> apresentacao.getId() == id);
    }

    public Apresentacao buscarPorId(int id) {
        for (Apresentacao apresentacao : lista) {
            if (id == apresentacao.getId()) {
                return apresentacao;
            }
        }
        return null;
    }
}
