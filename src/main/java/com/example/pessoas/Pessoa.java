package com.example.pessoas;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // public abstract void imprimeDados();
}
