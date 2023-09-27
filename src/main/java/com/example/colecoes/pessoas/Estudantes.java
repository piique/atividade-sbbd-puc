package com.example.colecoes.pessoas;

import com.example.colecoes.Singleton;
import com.example.pessoas.Estudante;

public class Estudantes extends Singleton<Estudante> {
    private static Estudantes instance;

    private Estudantes() {
        super();
    }

    public static Estudantes getInstance() {
        if (instance == null) {
            instance = new Estudantes();
        }
        return instance;
    }

    public boolean remover(String codigoEstudante) {
        return lista.removeIf(estudante -> estudante.getMatricula() == codigoEstudante);
    }

    public Estudante buscarPorMatricula(String matricula) {
        for (Estudante estudante : lista) {
            if (matricula.equals(estudante.getMatricula())) {
                return estudante;
            }
        }
        return null;
    }

}
