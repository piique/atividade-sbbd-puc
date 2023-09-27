package com.example.entidades;

public class Sala {
    private int codigo;
    private int idPredio;

    public Sala(int codigo, int idPredio) {
        this.codigo = codigo;
        this.idPredio = idPredio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getIdPredio() {
        return idPredio;
    }

    @Override
    public String toString() {
        return "Sala [codigo=" + codigo + ", idPredio=" + idPredio + "]";
    }

}
