package com.example.instituicoes;

public abstract class Instituicao {
    private String nome;
    private String endereco;
    private String telefone;

    public Instituicao(String nome) {
        this.nome = nome;
    }

    public Instituicao(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;

    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // private String nome;
    // private String endereco;
    // private String telefone;
    @Override
    public String toString() {
        return "Instituicao [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
    }
}
