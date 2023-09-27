package com.example.entidades;

import java.util.ArrayList;

import com.example.pessoas.Estudante;
import com.example.pessoas.Professor;

public class Trabalho {
    int id;
    String titulo;
    String resumo;

    ArrayList<Estudante> estudantes;
    Professor professor;

    public Trabalho(int id, String titulo, String resumo, ArrayList<Estudante> estudantes, Professor professor) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.estudantes = estudantes;
        this.professor = professor;
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getResumo() {
        return this.resumo;
    }

    public ArrayList<Estudante> getEstudantes() {
        return this.estudantes;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
