package com.example.pessoas;

public class Profissional extends Pessoa {
    String cargo;
    String cnpj;

    public Profissional(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    public Profissional(String nome, String cargo, String cnpj) {
        super(nome);
        this.cargo = cargo;
        this.cnpj = cnpj;
    }

    public Profissional(String nome, int idade, String cpf, String cargo, String cnpj) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.cnpj = cnpj;
    }

    public String getCargo() {
        return this.cargo;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
