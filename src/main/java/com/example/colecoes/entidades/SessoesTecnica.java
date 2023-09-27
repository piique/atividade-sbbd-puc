package com.example.colecoes.entidades;

import com.example.colecoes.Singleton;
import com.example.entidades.SessaoTecnica;

public class SessoesTecnica extends Singleton<SessaoTecnica> {
    private static SessoesTecnica instance;

    private SessoesTecnica() {
        super();
    }

    public static SessoesTecnica getInstance() {
        if (instance == null) {
            instance = new SessoesTecnica();
        }
        return instance;
    }

    public boolean remover(int id) {
        return lista.removeIf(sessaoTecnica -> sessaoTecnica.getId() == id);
    }

    public SessaoTecnica buscarPorId(int id) {
        for (SessaoTecnica sessaoTecnica : lista) {
            if (id == sessaoTecnica.getId()) {
                return sessaoTecnica;
            }
        }
        return null;
    }

}
