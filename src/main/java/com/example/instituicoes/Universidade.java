package com.example.instituicoes;

public class Universidade extends Instituicao {
    String credenciamento;

    public Universidade(String nome, String credenciamento) {
        super(nome);
        this.credenciamento = credenciamento;
    }

    public Universidade(String nome, String endereco, String telefone, String credenciamento) {
        super(nome, endereco, telefone);
        this.credenciamento = credenciamento;
    }

    public String getCredenciamento() {
        return this.credenciamento;
    }

    public void setCredenciamento(String credenciamento) {
        this.credenciamento = credenciamento;
    }
}
