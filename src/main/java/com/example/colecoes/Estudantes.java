package com.example.colecoes;

import java.util.ArrayList;
import java.util.List;

import com.example.pessoas.Estudante;
import com.example.pessoas.Professor;

public class Estudantes {
    private static Estudantes instance;
    private ArrayList<Estudante> listaEstudantes;

    private Estudantes() {
        listaEstudantes = new ArrayList<Estudante>();
    }

    public static Estudantes getInstance() {
        if (instance == null) {
            instance = new Estudantes();
        }
        return instance;
    }

    public void adicionarEstudante(Estudante estudante) {
        listaEstudantes.add(estudante);
    }

    public boolean removerEstudante(String codigoEstudante) {
        return listaEstudantes.removeIf(estudante -> estudante.getMatricula() == codigoEstudante);
    }

}
