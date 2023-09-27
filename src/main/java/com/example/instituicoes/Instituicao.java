package com.example.instituicoes;

public abstract class Instituicao {
    String nome;
    String endereco;
    String telefone;

    public Instituicao(String nome) {
        this.nome = nome;
    }

    public Instituicao(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
