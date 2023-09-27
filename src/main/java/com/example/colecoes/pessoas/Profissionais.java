package com.example.colecoes.pessoas;

import com.example.colecoes.Singleton;
import com.example.pessoas.Profissional;

public class Profissionais extends Singleton<Profissional> {
    private static Profissionais instance;

    private Profissionais() {
        super();
    }

    public static Profissionais getInstance() {
        if (instance == null) {
            instance = new Profissionais();
        }
        return instance;
    }

    public boolean remover(String cpf) {
        return lista.removeIf(profissional -> profissional.getCpf().equals(cpf));
    }

    public Profissional buscarPorCpf(String cnpj) {
        for (Profissional profissional : lista) {
            if (cnpj.equals(profissional.getCnpj())) {
                return profissional;
            }
        }
        return null;
    }
}