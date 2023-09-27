package com.example.colecoes.entidades;

import com.example.colecoes.Singleton;
import com.example.entidades.Minicurso;

public class Minicursos extends Singleton<Minicurso> {
    private static Minicursos instance;

    private Minicursos() {
        super();
    }

    public static Minicursos getInstance() {
        if (instance == null) {
            instance = new Minicursos();
        }
        return instance;
    }

    public boolean remover(int id) {
        return lista.removeIf(minicurso -> minicurso.getId() == id);
    }

    public Minicurso buscarPorId(int id) {
        for (Minicurso minicurso : lista) {
            if (id == minicurso.getId()) {
                return minicurso;
            }
        }
        return null;
    }
}
