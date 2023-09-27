package com.example.pessoas;

public class Estudante extends Pessoa {
    private String matricula;

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

    @Override
    public String toString() {
        return "Estudante [matricula=" + matricula + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
                + ", getCpf()=" + getCpf() + "]";
    }
}
