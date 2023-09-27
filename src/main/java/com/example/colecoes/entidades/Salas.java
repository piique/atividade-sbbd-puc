package com.example.colecoes.entidades;

import com.example.colecoes.Singleton;
import com.example.entidades.Sala;

public class Salas extends Singleton<Sala> {
    private static Salas instance;

    private Salas() {
        super();
    }

    public static Salas getInstance() {
        if (instance == null) {
            instance = new Salas();
        }
        return instance;
    }

    public boolean remover(int codigo) {
        return lista.removeIf(sala -> sala.getCodigo() == codigo);
    }

    public Sala buscarPorIdPredioCodigo(int idPredio, int codigo) {
        for (Sala sala : lista) {
            if (codigo == sala.getCodigo() && idPredio == sala.getIdPredio()) {
                return sala;
            }
        }
        return null;
    }

}
