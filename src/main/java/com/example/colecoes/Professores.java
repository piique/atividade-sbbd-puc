package com.example.colecoes;

import java.util.ArrayList;

import com.example.pessoas.Professor;

public class Professores {
    private static Professores instance;

    private ArrayList<Professor> listaProfessores;

    private Professores() {
        listaProfessores = new ArrayList<Professor>();
    }

    public static Professores getInstance() {
        if (instance == null) {
            instance = new Professores();
        }
        return instance;
    }

    public void adicionarProfessor(Professor professor) {
        listaProfessores.add(professor);
    }

    public boolean removerProfessor(int codigoProfessor) {
        return listaProfessores.removeIf(professor -> professor.getCodigoProfessor() == codigoProfessor);
    }

    public Professor pesquisarProfessor(int codigoProfessor) {
        for (Professor professor : listaProfessores) {
            if (codigoProfessor == professor.getCodigoProfessor()) {
                return professor;
            }
        }
        return null;
    }

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

}
