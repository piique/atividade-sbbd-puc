package com.example.colecoes.entidades;

import com.example.colecoes.Singleton;
import com.example.entidades.Trabalho;

public class Trabalhos extends Singleton<Trabalho> {
    private static Trabalhos instance;

    private Trabalhos() {
        super();
    }

    public static Trabalhos getInstance() {
        if (instance == null) {
            instance = new Trabalhos();
        }
        return instance;
    }

    public boolean remover(int id) {
        return lista.removeIf(trabalho -> trabalho.getId() == id);
    }

    public Trabalho buscarPorId(int id) {
        for (Trabalho trabalho : lista) {
            if (id == trabalho.getId()) {
                return trabalho;
            }
        }
        return null;
    }

}
