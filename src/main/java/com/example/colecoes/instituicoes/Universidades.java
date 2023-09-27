package com.example.colecoes.instituicoes;

import com.example.colecoes.Singleton;
import com.example.instituicoes.Universidade;

public class Universidades extends Singleton<Universidade> {
    private static Universidades instance;

    private Universidades() {
        super();
    }

    public static Universidades getInstance() {
        if (instance == null) {
            instance = new Universidades();
        }
        return instance;
    }

    public boolean remover(String credenciamento) {
        return lista.removeIf(universidade -> universidade.getCredenciamento().equals(credenciamento));
    }

    public Universidade buscarPorCredenciamento(String credenciamento) {
        for (Universidade universidade : lista) {
            if (credenciamento.equals(universidade.getCredenciamento())) {
                return universidade;
            }
        }
        return null;
    }

}
