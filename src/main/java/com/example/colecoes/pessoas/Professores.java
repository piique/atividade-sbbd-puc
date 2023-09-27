package com.example.colecoes.pessoas;

import com.example.colecoes.Singleton;
import com.example.pessoas.Professor;

public class Professores extends Singleton<Professor> {
    private static Professores instance;

    private Professores() {
        super();
    }

    public static Professores getInstance() {
        if (instance == null) {
            instance = new Professores();
        }
        return instance;
    }

    public void add(Professor professor) {
        lista.add(professor);
    }

    public boolean remover(int codigoProfessor) {
        return lista.removeIf(professor -> professor.getCodigoProfessor() == codigoProfessor);
    }

    public Professor buscarPorCodigoProfessor(int codigoProfessor) {
        for (Professor professor : lista) {
            if (codigoProfessor == professor.getCodigoProfessor()) {
                return professor;
            }
        }
        return null;
    }

}
