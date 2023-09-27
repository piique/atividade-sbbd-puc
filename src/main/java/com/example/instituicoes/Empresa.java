package com.example.instituicoes;

public class Empresa extends Instituicao {
    private String cnpj;

    public Empresa(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public Empresa(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Empresa [cnpj=" + cnpj + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco()
                + ", getTelefone()=" + getTelefone() + "]";
    }
}
