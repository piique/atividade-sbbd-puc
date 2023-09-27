package com.example.pessoas;

public class Estudante extends Pessoa {
    public String matricula;

    public Estudante(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public Estudante(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
}
