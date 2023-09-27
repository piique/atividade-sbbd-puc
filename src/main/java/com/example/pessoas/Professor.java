package com.example.pessoas;

public class Professor extends Pessoa {
    private Integer codigoProfessor;

    public Professor(String nome, Integer codigoProfessor) {
        super(nome);
        this.codigoProfessor = codigoProfessor;
    }

    public Professor(String nome, int idade, String cpf, Integer codigoProfessor) {
        super(nome, idade, cpf);
        this.codigoProfessor = codigoProfessor;
    }

    public Integer getCodigoProfessor() {
        return this.codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    @Override
    public String toString() {
        return "Professor [codigoProfessor=" + codigoProfessor + ", getNome()=" + getNome() + ", getIdade()="
                + getIdade() + ", getCpf()=" + getCpf() + "]";
    }

}
