package com.example.colecoes.instituicoes;

import com.example.colecoes.Singleton;
import com.example.instituicoes.Empresa;

public class Empresas extends Singleton<Empresa> {
    private static Empresas instance;

    private Empresas() {
        super();
    }

    public static Empresas getInstance() {
        if (instance == null) {
            instance = new Empresas();
        }
        return instance;
    }

    public boolean remover(String cnpj) {
        return lista.removeIf(empresa -> empresa.getCnpj().equals(cnpj));
    }

    public Empresa buscarPorCnpj(String cnpj) {
        for (Empresa empresa : lista) {
            if (cnpj.equals(empresa.getCnpj())) {
                return empresa;
            }
        }
        return null;
    }
}
