package com.example;

import com.example.colecoes.Estudantes;
import com.example.colecoes.Professores;
import com.example.pessoas.Estudante;
import com.example.pessoas.Professor;

public class Main {
    public static void main(String[] args) {
        Professores professores = Professores.getInstance();
        Estudantes estudantes = Estudantes.getInstance();

        // cadastro de professores
        Professor professor1 = new Professor("João", 33222222);
        Professor professor2 = new Professor("Maria", 33111111);
        professores.adicionarProfessor(professor1);
        professores.adicionarProfessor(professor2);

        // cadastro de estudantes
        Estudante estudante1 = new Estudante("João", "33113311");
        Estudante estudante2 = new Estudante("Maria", "1312312");
        estudantes.adicionarEstudante(estudante1);
        estudantes.adicionarEstudante(estudante2);

    }

    public static void MenuPrincipal() {

    }
}